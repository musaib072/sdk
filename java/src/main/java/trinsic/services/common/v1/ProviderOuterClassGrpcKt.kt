package trinsic.services.common.v1

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import trinsic.services.common.v1.ProviderGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for services.provider.v1.Provider.
 */
object ProviderGrpcKt {
  const val SERVICE_NAME: String = ProviderGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = ProviderGrpc.getServiceDescriptor()

  val createEcosystemMethod: MethodDescriptor<ProviderOuterClass.CreateEcosystemRequest,
      ProviderOuterClass.CreateEcosystemResponse>
    @JvmStatic
    get() = ProviderGrpc.getCreateEcosystemMethod()

  val listEcosystemsMethod: MethodDescriptor<ProviderOuterClass.ListEcosystemsRequest,
      ProviderOuterClass.ListEcosystemsResponse>
    @JvmStatic
    get() = ProviderGrpc.getListEcosystemsMethod()

  val inviteMethod: MethodDescriptor<ProviderOuterClass.InviteRequest,
      ProviderOuterClass.InviteResponse>
    @JvmStatic
    get() = ProviderGrpc.getInviteMethod()

  val acceptInviteMethod: MethodDescriptor<ProviderOuterClass.AcceptInviteRequest,
      ProviderOuterClass.AcceptInviteResponse>
    @JvmStatic
    get() = ProviderGrpc.getAcceptInviteMethod()

  val invitationStatusMethod: MethodDescriptor<ProviderOuterClass.InvitationStatusRequest,
      ProviderOuterClass.InvitationStatusResponse>
    @JvmStatic
    get() = ProviderGrpc.getInvitationStatusMethod()

  /**
   * A stub for issuing RPCs to a(n) services.provider.v1.Provider service as suspending coroutines.
   */
  @StubFor(ProviderGrpc::class)
  class ProviderCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ProviderCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ProviderCoroutineStub =
        ProviderCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun createEcosystem(request: ProviderOuterClass.CreateEcosystemRequest,
        headers: Metadata = Metadata()): ProviderOuterClass.CreateEcosystemResponse = unaryRpc(
      channel,
      ProviderGrpc.getCreateEcosystemMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun listEcosystems(request: ProviderOuterClass.ListEcosystemsRequest, headers: Metadata
        = Metadata()): ProviderOuterClass.ListEcosystemsResponse = unaryRpc(
      channel,
      ProviderGrpc.getListEcosystemsMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun invite(request: ProviderOuterClass.InviteRequest, headers: Metadata = Metadata()):
        ProviderOuterClass.InviteResponse = unaryRpc(
      channel,
      ProviderGrpc.getInviteMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun acceptInvite(request: ProviderOuterClass.AcceptInviteRequest, headers: Metadata =
        Metadata()): ProviderOuterClass.AcceptInviteResponse = unaryRpc(
      channel,
      ProviderGrpc.getAcceptInviteMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun invitationStatus(request: ProviderOuterClass.InvitationStatusRequest,
        headers: Metadata = Metadata()): ProviderOuterClass.InvitationStatusResponse = unaryRpc(
      channel,
      ProviderGrpc.getInvitationStatusMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the services.provider.v1.Provider service based on Kotlin
   * coroutines.
   */
  abstract class ProviderCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for services.provider.v1.Provider.CreateEcosystem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createEcosystem(request: ProviderOuterClass.CreateEcosystemRequest):
        ProviderOuterClass.CreateEcosystemResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method services.provider.v1.Provider.CreateEcosystem is unimplemented"))

    /**
     * Returns the response to an RPC for services.provider.v1.Provider.ListEcosystems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listEcosystems(request: ProviderOuterClass.ListEcosystemsRequest):
        ProviderOuterClass.ListEcosystemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method services.provider.v1.Provider.ListEcosystems is unimplemented"))

    /**
     * Returns the response to an RPC for services.provider.v1.Provider.Invite.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun invite(request: ProviderOuterClass.InviteRequest):
        ProviderOuterClass.InviteResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method services.provider.v1.Provider.Invite is unimplemented"))

    /**
     * Returns the response to an RPC for services.provider.v1.Provider.AcceptInvite.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun acceptInvite(request: ProviderOuterClass.AcceptInviteRequest):
        ProviderOuterClass.AcceptInviteResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method services.provider.v1.Provider.AcceptInvite is unimplemented"))

    /**
     * Returns the response to an RPC for services.provider.v1.Provider.InvitationStatus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun invitationStatus(request: ProviderOuterClass.InvitationStatusRequest):
        ProviderOuterClass.InvitationStatusResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method services.provider.v1.Provider.InvitationStatus is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProviderGrpc.getCreateEcosystemMethod(),
      implementation = ::createEcosystem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProviderGrpc.getListEcosystemsMethod(),
      implementation = ::listEcosystems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProviderGrpc.getInviteMethod(),
      implementation = ::invite
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProviderGrpc.getAcceptInviteMethod(),
      implementation = ::acceptInvite
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProviderGrpc.getInvitationStatusMethod(),
      implementation = ::invitationStatus
    )).build()
  }
}
