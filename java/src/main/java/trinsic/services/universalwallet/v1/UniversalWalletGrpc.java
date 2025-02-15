package trinsic.services.universalwallet.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: services/universal-wallet/v1/universal-wallet.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UniversalWalletGrpc {

  private UniversalWalletGrpc() {}

  public static final String SERVICE_NAME = "services.universalwallet.v1.UniversalWallet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest,
      trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest.class,
      responseType = trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest,
      trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest, trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse> getSearchMethod;
    if ((getSearchMethod = UniversalWalletGrpc.getSearchMethod) == null) {
      synchronized (UniversalWalletGrpc.class) {
        if ((getSearchMethod = UniversalWalletGrpc.getSearchMethod) == null) {
          UniversalWalletGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest, trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UniversalWalletMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest,
      trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse> getInsertItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertItem",
      requestType = trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest.class,
      responseType = trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest,
      trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse> getInsertItemMethod() {
    io.grpc.MethodDescriptor<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest, trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse> getInsertItemMethod;
    if ((getInsertItemMethod = UniversalWalletGrpc.getInsertItemMethod) == null) {
      synchronized (UniversalWalletGrpc.class) {
        if ((getInsertItemMethod = UniversalWalletGrpc.getInsertItemMethod) == null) {
          UniversalWalletGrpc.getInsertItemMethod = getInsertItemMethod =
              io.grpc.MethodDescriptor.<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest, trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UniversalWalletMethodDescriptorSupplier("InsertItem"))
              .build();
        }
      }
    }
    return getInsertItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest,
      trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse> getDeleteitemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deleteitem",
      requestType = trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest.class,
      responseType = trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest,
      trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse> getDeleteitemMethod() {
    io.grpc.MethodDescriptor<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest, trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse> getDeleteitemMethod;
    if ((getDeleteitemMethod = UniversalWalletGrpc.getDeleteitemMethod) == null) {
      synchronized (UniversalWalletGrpc.class) {
        if ((getDeleteitemMethod = UniversalWalletGrpc.getDeleteitemMethod) == null) {
          UniversalWalletGrpc.getDeleteitemMethod = getDeleteitemMethod =
              io.grpc.MethodDescriptor.<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest, trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deleteitem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UniversalWalletMethodDescriptorSupplier("Deleteitem"))
              .build();
        }
      }
    }
    return getDeleteitemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UniversalWalletStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UniversalWalletStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UniversalWalletStub>() {
        @java.lang.Override
        public UniversalWalletStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UniversalWalletStub(channel, callOptions);
        }
      };
    return UniversalWalletStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UniversalWalletBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UniversalWalletBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UniversalWalletBlockingStub>() {
        @java.lang.Override
        public UniversalWalletBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UniversalWalletBlockingStub(channel, callOptions);
        }
      };
    return UniversalWalletBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UniversalWalletFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UniversalWalletFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UniversalWalletFutureStub>() {
        @java.lang.Override
        public UniversalWalletFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UniversalWalletFutureStub(channel, callOptions);
        }
      };
    return UniversalWalletFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UniversalWalletImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Search the wallet using a SQL-like syntax
     * </pre>
     */
    public void search(trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Insert an item into the wallet
     * </pre>
     */
    public void insertItem(trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an item from the wallet permanently
     * </pre>
     */
    public void deleteitem(trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteitemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest,
                trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getInsertItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest,
                trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse>(
                  this, METHODID_INSERT_ITEM)))
          .addMethod(
            getDeleteitemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest,
                trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse>(
                  this, METHODID_DELETEITEM)))
          .build();
    }
  }

  /**
   */
  public static final class UniversalWalletStub extends io.grpc.stub.AbstractAsyncStub<UniversalWalletStub> {
    private UniversalWalletStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniversalWalletStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UniversalWalletStub(channel, callOptions);
    }

    /**
     * <pre>
     * Search the wallet using a SQL-like syntax
     * </pre>
     */
    public void search(trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Insert an item into the wallet
     * </pre>
     */
    public void insertItem(trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an item from the wallet permanently
     * </pre>
     */
    public void deleteitem(trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteitemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UniversalWalletBlockingStub extends io.grpc.stub.AbstractBlockingStub<UniversalWalletBlockingStub> {
    private UniversalWalletBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniversalWalletBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UniversalWalletBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Search the wallet using a SQL-like syntax
     * </pre>
     */
    public trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse search(trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Insert an item into the wallet
     * </pre>
     */
    public trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse insertItem(trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an item from the wallet permanently
     * </pre>
     */
    public trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse deleteitem(trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteitemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UniversalWalletFutureStub extends io.grpc.stub.AbstractFutureStub<UniversalWalletFutureStub> {
    private UniversalWalletFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniversalWalletFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UniversalWalletFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Search the wallet using a SQL-like syntax
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse> search(
        trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Insert an item into the wallet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse> insertItem(
        trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an item from the wallet permanently
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse> deleteitem(
        trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteitemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_INSERT_ITEM = 1;
  private static final int METHODID_DELETEITEM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UniversalWalletImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UniversalWalletImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.SearchResponse>) responseObserver);
          break;
        case METHODID_INSERT_ITEM:
          serviceImpl.insertItem((trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.InsertItemResponse>) responseObserver);
          break;
        case METHODID_DELETEITEM:
          serviceImpl.deleteitem((trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.universalwallet.v1.UniversalWalletOuterClass.DeleteItemResponse>) responseObserver);
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

  private static abstract class UniversalWalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UniversalWalletBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return trinsic.services.universalwallet.v1.UniversalWalletOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UniversalWallet");
    }
  }

  private static final class UniversalWalletFileDescriptorSupplier
      extends UniversalWalletBaseDescriptorSupplier {
    UniversalWalletFileDescriptorSupplier() {}
  }

  private static final class UniversalWalletMethodDescriptorSupplier
      extends UniversalWalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UniversalWalletMethodDescriptorSupplier(String methodName) {
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
      synchronized (UniversalWalletGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UniversalWalletFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getInsertItemMethod())
              .addMethod(getDeleteitemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
