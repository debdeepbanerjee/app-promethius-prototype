package com.aexp.observability.monitoring.apppromethiusprototype.employee;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: employee-service.proto")
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeRequest,
          com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeResponse>
      getGetEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployee",
      requestType =
          com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeRequest.class,
      responseType =
          com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeRequest,
          com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeResponse>
      getGetEmployeeMethod() {
    io.grpc.MethodDescriptor<
            com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeRequest,
            com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeResponse>
        getGetEmployeeMethod;
    if ((getGetEmployeeMethod = EmployeeServiceGrpc.getGetEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeMethod = EmployeeServiceGrpc.getGetEmployeeMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeMethod =
              getGetEmployeeMethod =
                  io.grpc.MethodDescriptor
                      .<com.aexp.observability.monitoring.apppromethiusprototype.employee
                              .EmployeeRequest,
                          com.aexp.observability.monitoring.apppromethiusprototype.employee
                              .EmployeeResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName("EmployeeService", "getEmployee"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.aexp.observability.monitoring.apppromethiusprototype.employee
                                  .EmployeeRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.aexp.observability.monitoring.apppromethiusprototype.employee
                                  .EmployeeResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new EmployeeServiceMethodDescriptorSupplier("getEmployee"))
                      .build();
        }
      }
    }
    return getGetEmployeeMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    return new EmployeeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new EmployeeServiceBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static EmployeeServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    return new EmployeeServiceFutureStub(channel);
  }

  /** */
  public abstract static class EmployeeServiceImplBase implements io.grpc.BindableService {

    /** */
    public void getEmployee(
        com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeRequest request,
        io.grpc.stub.StreamObserver<
                com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmployeeMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getGetEmployeeMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.aexp.observability.monitoring.apppromethiusprototype.employee
                          .EmployeeRequest,
                      com.aexp.observability.monitoring.apppromethiusprototype.employee
                          .EmployeeResponse>(this, METHODID_GET_EMPLOYEE)))
          .build();
    }
  }

  /** */
  public static final class EmployeeServiceStub
      extends io.grpc.stub.AbstractStub<EmployeeServiceStub> {
    private EmployeeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /** */
    public void getEmployee(
        com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeRequest request,
        io.grpc.stub.StreamObserver<
                com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class EmployeeServiceBlockingStub
      extends io.grpc.stub.AbstractStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /** */
    public com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeResponse
        getEmployee(
            com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeRequest
                request) {
      return blockingUnaryCall(getChannel(), getGetEmployeeMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class EmployeeServiceFutureStub
      extends io.grpc.stub.AbstractStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeResponse>
        getEmployee(
            com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE = 0;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE:
          serviceImpl.getEmployee(
              (com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.aexp.observability.monitoring.apppromethiusprototype.employee
                          .EmployeeResponse>)
                  responseObserver);
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

  private abstract static class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aexp.observability.monitoring.apppromethiusprototype.employee
          .EmployeeServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
                      .addMethod(getGetEmployeeMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
