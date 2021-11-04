package trinsic.services.verifiablecredentials.templates.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: services/verifiable-credentials/templates/v1/templates.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CredentialTemplatesGrpc {

  private CredentialTemplatesGrpc() {}

  public static final String SERVICE_NAME = "services.verifiablecredentials.templates.v1.CredentialTemplates";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest,
      trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest.class,
      responseType = trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest,
      trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest, trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse> getCreateMethod;
    if ((getCreateMethod = CredentialTemplatesGrpc.getCreateMethod) == null) {
      synchronized (CredentialTemplatesGrpc.class) {
        if ((getCreateMethod = CredentialTemplatesGrpc.getCreateMethod) == null) {
          CredentialTemplatesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest, trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CredentialTemplatesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest,
      trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest.class,
      responseType = trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest,
      trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse> getGetMethod() {
    io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest, trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse> getGetMethod;
    if ((getGetMethod = CredentialTemplatesGrpc.getGetMethod) == null) {
      synchronized (CredentialTemplatesGrpc.class) {
        if ((getGetMethod = CredentialTemplatesGrpc.getGetMethod) == null) {
          CredentialTemplatesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest, trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CredentialTemplatesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest,
      trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest.class,
      responseType = trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest,
      trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest, trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse> getSearchMethod;
    if ((getSearchMethod = CredentialTemplatesGrpc.getSearchMethod) == null) {
      synchronized (CredentialTemplatesGrpc.class) {
        if ((getSearchMethod = CredentialTemplatesGrpc.getSearchMethod) == null) {
          CredentialTemplatesGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest, trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CredentialTemplatesMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest,
      trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest.class,
      responseType = trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest,
      trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest, trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse> getUpdateMethod;
    if ((getUpdateMethod = CredentialTemplatesGrpc.getUpdateMethod) == null) {
      synchronized (CredentialTemplatesGrpc.class) {
        if ((getUpdateMethod = CredentialTemplatesGrpc.getUpdateMethod) == null) {
          CredentialTemplatesGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest, trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CredentialTemplatesMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest,
      trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest.class,
      responseType = trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest,
      trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest, trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse> getDeleteMethod;
    if ((getDeleteMethod = CredentialTemplatesGrpc.getDeleteMethod) == null) {
      synchronized (CredentialTemplatesGrpc.class) {
        if ((getDeleteMethod = CredentialTemplatesGrpc.getDeleteMethod) == null) {
          CredentialTemplatesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest, trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CredentialTemplatesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CredentialTemplatesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CredentialTemplatesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CredentialTemplatesStub>() {
        @java.lang.Override
        public CredentialTemplatesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CredentialTemplatesStub(channel, callOptions);
        }
      };
    return CredentialTemplatesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CredentialTemplatesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CredentialTemplatesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CredentialTemplatesBlockingStub>() {
        @java.lang.Override
        public CredentialTemplatesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CredentialTemplatesBlockingStub(channel, callOptions);
        }
      };
    return CredentialTemplatesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CredentialTemplatesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CredentialTemplatesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CredentialTemplatesFutureStub>() {
        @java.lang.Override
        public CredentialTemplatesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CredentialTemplatesFutureStub(channel, callOptions);
        }
      };
    return CredentialTemplatesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CredentialTemplatesImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void get(trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void search(trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void update(trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest,
                trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest,
                trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest,
                trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest,
                trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest,
                trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class CredentialTemplatesStub extends io.grpc.stub.AbstractAsyncStub<CredentialTemplatesStub> {
    private CredentialTemplatesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CredentialTemplatesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CredentialTemplatesStub(channel, callOptions);
    }

    /**
     */
    public void create(trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CredentialTemplatesBlockingStub extends io.grpc.stub.AbstractBlockingStub<CredentialTemplatesBlockingStub> {
    private CredentialTemplatesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CredentialTemplatesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CredentialTemplatesBlockingStub(channel, callOptions);
    }

    /**
     */
    public trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse create(trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse get(trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse search(trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse update(trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse delete(trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CredentialTemplatesFutureStub extends io.grpc.stub.AbstractFutureStub<CredentialTemplatesFutureStub> {
    private CredentialTemplatesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CredentialTemplatesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CredentialTemplatesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse> create(
        trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse> get(
        trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse> search(
        trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse> update(
        trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse> delete(
        trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_SEARCH = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CredentialTemplatesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CredentialTemplatesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.CreateCredentialTemplateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.GetCredentialTemplateResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.SearchCredentialTemplatesResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.UpdateCredentialTemplateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.verifiablecredentials.templates.v1.Templates.DeleteCredentialTemplateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CredentialTemplatesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CredentialTemplatesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return trinsic.services.verifiablecredentials.templates.v1.Templates.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CredentialTemplates");
    }
  }

  private static final class CredentialTemplatesFileDescriptorSupplier
      extends CredentialTemplatesBaseDescriptorSupplier {
    CredentialTemplatesFileDescriptorSupplier() {}
  }

  private static final class CredentialTemplatesMethodDescriptorSupplier
      extends CredentialTemplatesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CredentialTemplatesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CredentialTemplatesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CredentialTemplatesFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getSearchMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
