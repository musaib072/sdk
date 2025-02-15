﻿using System;
using Grpc.Core;
using Google.Protobuf;
using Trinsic.Services.Common.V1;
using Trinsic.Services.Account.V1;
using System.Threading.Tasks;
using Grpc.Net.Client;
#if __BROWSER__
using System.Net.Http;
using Grpc.Net.Client.Web;
#endif

namespace Trinsic;

public abstract class ServiceBase
{
    protected internal ServiceBase(ServerConfig serverConfig) {
        Channel = CreateChannel(serverConfig);
    }
    protected internal ServiceBase(AccountProfile accountProfile) {
        Channel = CreateChannel();
        Profile = accountProfile;
    }
    protected internal ServiceBase(AccountProfile accountProfile, ServerConfig serverConfig) {
        Profile = accountProfile;
        Channel = CreateChannel(serverConfig);
    }

    protected internal ServiceBase(GrpcChannel existingChannel) {
        Channel = existingChannel;
    }

    protected internal ServiceBase(AccountProfile accountProfile, GrpcChannel existingChannel) {
        Profile = accountProfile;
        Channel = existingChannel;
    }

    private static GrpcChannel CreateChannel(ServerConfig? serverConfig = null) {
        serverConfig ??= DefaultServerConfig();
#if __BROWSER__
        var httpClient = new HttpClient(new GrpcWebHandler(GrpcWebMode.GrpcWeb, new HttpClientHandler()));
        return GrpcChannel.ForAddress(Configuration.FormatUrl(), new GrpcChannelOptions { HttpClient = httpClient });
#else
        return GrpcChannel.ForAddress(serverConfig.FormatUrl());
#endif
    }

    protected static ServerConfig DefaultServerConfig() => new() {
        Endpoint = "prod.trinsic.cloud",
        Port = 443,
        UseTls = true
    };

    private readonly ISecurityProvider _securityProvider = new OberonSecurityProvider();

    public virtual AccountProfile? Profile { get; set; }

    /// <summary>
    /// Gets the gRPC channel used by this service. This channel can be reused
    /// by passing this instance to other service constructors.
    /// </summary>
    public GrpcChannel Channel { get; private set; }

    /// <summary>
    /// Create call metadata by setting the required authentication headers
    /// </summary>
    /// <returns></returns>
    protected async Task<Metadata> BuildMetadataAsync(IMessage request) {
        if (Profile is null) throw new("Cannot call authenticated endpoint: profile must be set");

        return new() {
            {"Authorization", await _securityProvider.GetAuthHeaderAsync(Profile, request)}
        };
    }

    /// <summary>
    /// Create call metadata by setting the required authentication headers
    /// </summary>
    /// <returns></returns>
    protected Metadata BuildMetadata(IMessage request) {
        if (Profile is null) throw new("Cannot call authenticated endpoint: profile must be set");

        return new() {
            {"Authorization", _securityProvider.GetAuthHeader(Profile, request)}
        };
    }
}