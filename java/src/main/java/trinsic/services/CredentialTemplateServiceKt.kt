package trinsic.services

import com.google.protobuf.InvalidProtocolBufferException
import io.grpc.Channel
import trinsic.okapi.DidException
import trinsic.services.account.v1.AccountOuterClass
import trinsic.services.common.v1.CommonOuterClass
import trinsic.services.verifiablecredentials.templates.v1.CredentialTemplatesGrpcKt
import trinsic.services.verifiablecredentials.templates.v1.Templates.*

class CredentialTemplateServiceKt(
    accountProfile: AccountOuterClass.AccountProfile?, serverConfig: CommonOuterClass.ServerConfig?, channel: Channel?
) : ServiceBase(accountProfile, serverConfig, channel) {
    var stub = CredentialTemplatesGrpcKt.CredentialTemplatesCoroutineStub(this.channel)

    @Throws(InvalidProtocolBufferException::class, DidException::class)
    suspend fun create(request: CreateCredentialTemplateRequest): CreateCredentialTemplateResponse {
        return withMetadata(stub, request).create(request)
    }

    @Throws(InvalidProtocolBufferException::class, DidException::class)
    suspend fun get(request: GetCredentialTemplateRequest): GetCredentialTemplateResponse {
        return withMetadata(stub, request).get(request)
    }

    @Throws(InvalidProtocolBufferException::class, DidException::class)
    suspend fun list(request: ListCredentialTemplatesRequest): ListCredentialTemplatesResponse {
        return withMetadata(stub, request).list(request)
    }

    @Throws(InvalidProtocolBufferException::class, DidException::class)
    suspend fun search(request: SearchCredentialTemplatesRequest): SearchCredentialTemplatesResponse {
        return withMetadata(stub, request).search(request)
    }

    @Throws(InvalidProtocolBufferException::class, DidException::class)
    suspend fun delete(request: DeleteCredentialTemplateRequest): DeleteCredentialTemplateResponse {
        return withMetadata(stub, request).delete(request)
    }
}