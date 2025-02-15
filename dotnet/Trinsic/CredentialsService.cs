using System;
using System.Threading.Tasks;
using Google.Protobuf.WellKnownTypes;
using Grpc.Net.Client;
using Newtonsoft.Json.Linq;
using Trinsic.Services.Account.V1;
using Trinsic.Services.Common.V1;
using Trinsic.Services.VerifiableCredentials.Templates.V1;
using Trinsic.Services.VerifiableCredentials.V1;

namespace Trinsic;

public class CredentialsService : ServiceBase
{
    public CredentialsService(AccountProfile accountProfile, ServerConfig serverConfig)
        : base(accountProfile, serverConfig) {
        Client = new(Channel);
    }

    public CredentialsService(AccountProfile accountProfile)
        : base(accountProfile) {
        Client = new(Channel);
    }
    
    public CredentialsService(AccountProfile accountProfile, GrpcChannel channel)
        : base(accountProfile, channel) {
        Client = new(Channel);
    }

    private VerifiableCredential.VerifiableCredentialClient Client { get; }

    /// <summary>
    /// Signs an input credential
    /// </summary>
    /// <param name="document"></param>
    /// <returns></returns>
    public async Task<JObject> IssueCredentialAsync(JObject document) {
        try {
            IssueRequest request = new() {
                Document = new() {JsonStruct = document.ToStruct()}
            };
            var response = await Client.IssueAsync(request, await BuildMetadataAsync(request));
            return response.Document.JsonStruct.ToJObject();
        } catch(Exception e) {
            Console.WriteLine(e);
            throw;
        }
    }

    public JObject IssueCredential(JObject document) {
        try {
            IssueRequest request = new() {
                Document = new() {JsonStruct = document.ToStruct()}
            };
            var response = Client.Issue(request, BuildMetadata(request));
            return response.Document.JsonStruct.ToJObject();
        } catch(Exception e) {
            Console.WriteLine(e);
            throw;
        }
    }

    /// <summary>
    /// Issue a verifiable credential from a predefined <see cref="TemplateData"/>.
    /// </summary>
    /// <param name="request">The request object with the template identifier and the values</param>
    /// <returns>Verifiable credential as JSON</returns>
    public async Task<string> IssueFromTemplateAsync(IssueFromTemplateRequest request) {
        var response = await Client.IssueFromTemplateAsync(request, await BuildMetadataAsync(request));
        return response.DocumentJson;
    }
    
    /// <summary>
    /// Issue a verifiable credential from a predefined <see cref="TemplateData"/>.
    /// </summary>
    /// <param name="request">The request object with the template identifier and the values</param>
    /// <returns>Verifiable credential as JSON</returns>
    public string IssueFromTemplate(IssueFromTemplateRequest request) {
        var response = Client.IssueFromTemplate(request, BuildMetadata(request));
        return response.DocumentJson;
    }


    /// <summary>
    /// Derive a proof from an existing document in the wallet using
    /// an input reveal document frame
    /// </summary>
    /// <param name="documentId"></param>
    /// <param name="revealDocument"></param>
    /// <returns></returns>
    public async Task<JObject> CreateProofAsync(string documentId, JObject revealDocument) {
        CreateProofRequest request = new() {
            DocumentId = documentId,
            RevealDocument = new() {JsonStruct = revealDocument.ToStruct()}
        };
        var response = await Client.CreateProofAsync(
            request: request,
            headers: await BuildMetadataAsync(request));

        return response.ProofDocument.JsonStruct.ToJObject();
    }

    public JObject CreateProof(string documentId, JObject revealDocument) {
        CreateProofRequest request = new() {
            DocumentId = documentId,
            RevealDocument = new() {JsonStruct = revealDocument.ToStruct()}
        };
        var response = Client.CreateProof(
            request: request,
            headers: BuildMetadata(request));

        return response.ProofDocument.JsonStruct.ToJObject();
    }

    /// <summary>
    /// Verifies a proof document
    /// </summary>
    /// <param name="proofDocument"></param>
    /// <returns></returns>
    public async Task<bool> VerifyProofAsync(JObject proofDocument) {
        VerifyProofRequest request = new() {
            ProofDocument = new() {JsonString = proofDocument.ToString()}
        };
        var response = await Client.VerifyProofAsync(
            request: request,
            headers: await BuildMetadataAsync(request));

        return response.Valid;
    }

    public bool VerifyProof(JObject proofDocument) {
        VerifyProofRequest request = new() {
            ProofDocument = new() {JsonString = proofDocument.ToString()}
        };
        var response = Client.VerifyProof(
            request: request,
            headers: BuildMetadata(request));

        return response.Valid;
    }

    /// <summary>
    /// Check credential template status
    /// </summary>
    /// <param name="credentialStatusId"></param>
    /// <returns></returns>
    public async Task<CheckStatusResponse> CheckStatusAsync(string credentialStatusId) {
        CheckStatusRequest request = new() {CredentialStatusId = credentialStatusId};
        return await Client.CheckStatusAsync(request, await BuildMetadataAsync(request));
    }
    
    public CheckStatusResponse CheckStatus(string credentialStatusId) {
        CheckStatusRequest request = new() {CredentialStatusId = credentialStatusId};
        return Client.CheckStatus(request, BuildMetadata(request));
    }
    
    /// <summary>
    /// Update credential template revocation status
    /// </summary>
    /// <param name="credentialStatusId"></param>
    /// <param name="revoked"></param>
    /// <returns></returns>
    public async Task UpdateStatusAsync(string credentialStatusId, bool revoked) {
        UpdateStatusRequest request = new() {CredentialStatusId = credentialStatusId, Revoked=revoked};
        var response = await Client.UpdateStatusAsync(request, await BuildMetadataAsync(request));
        if (response.Status == ResponseStatus.Success) return;
        throw new Exception($"Status not completely updated {response.Status}");
    }
    
    public void UpdateStatus(string credentialStatusId, bool revoked) {
        UpdateStatusRequest request = new() {CredentialStatusId = credentialStatusId, Revoked=revoked};
        var response = Client.UpdateStatus(request, BuildMetadata(request));
        if (response.Status == ResponseStatus.Success) return;
        throw new Exception($"Status not completely updated {response.Status}");  
    }


    /// <summary>
    /// Sends a document to the specified destination
    /// </summary>
    /// <param name="document"></param>
    /// <param name="email"></param>
    /// <returns></returns>
    public async Task SendAsync(JObject document, string email) {
        SendRequest request = new() {
            Email = email,
            Document = new() {JsonStruct = document.ToStruct()}
        };
        var response = await Client.SendAsync(
            request: request,
            headers: await BuildMetadataAsync(request));
    }

    public void Send(JObject document, string email) {
        SendRequest request = new() {
            Email = email,
            Document = new() {JsonStruct = document.ToStruct()}
        };
        var response = Client.Send(
            request: request,
            headers: BuildMetadata(request));
    }
}