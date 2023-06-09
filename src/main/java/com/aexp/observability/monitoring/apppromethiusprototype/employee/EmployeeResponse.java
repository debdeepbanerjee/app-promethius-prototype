// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee-service.proto

package com.aexp.observability.monitoring.apppromethiusprototype.employee;

/** Protobuf type {@code EmployeeResponse} */
public final class EmployeeResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:EmployeeResponse)
    EmployeeResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EmployeeResponse.newBuilder() to construct.
  private EmployeeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EmployeeResponse() {
    empId_ = "";
    name_ = "";
    role_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private EmployeeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              String s = input.readStringRequireUtf8();

              empId_ = s;
              break;
            }
          case 18:
            {
              String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              role_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return EmployeeServiceOuterClass.internal_static_EmployeeResponse_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EmployeeServiceOuterClass.internal_static_EmployeeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(EmployeeResponse.class, Builder.class);
  }

  public static final int EMP_ID_FIELD_NUMBER = 1;
  private volatile Object empId_;
  /** <code>string emp_id = 1;</code> */
  public String getEmpId() {
    Object ref = empId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      empId_ = s;
      return s;
    }
  }
  /** <code>string emp_id = 1;</code> */
  public com.google.protobuf.ByteString getEmpIdBytes() {
    Object ref = empId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
      empId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile Object name_;
  /** <code>string name = 2;</code> */
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /** <code>string name = 2;</code> */
  public com.google.protobuf.ByteString getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLE_FIELD_NUMBER = 3;
  private int role_;
  /** <code>.constants.Role role = 3;</code> */
  public int getRoleValue() {
    return role_;
  }
  /** <code>.constants.Role role = 3;</code> */
  public com.techgeeknext.constants.Role getRole() {
    @SuppressWarnings("deprecation")
    com.techgeeknext.constants.Role result = com.techgeeknext.constants.Role.valueOf(role_);
    return result == null ? com.techgeeknext.constants.Role.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;

  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getEmpIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, empId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (role_ != com.techgeeknext.constants.Role.USER.getNumber()) {
      output.writeEnum(3, role_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEmpIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, empId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (role_ != com.techgeeknext.constants.Role.USER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, role_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof EmployeeResponse)) {
      return super.equals(obj);
    }
    EmployeeResponse other = (EmployeeResponse) obj;

    boolean result = true;
    result = result && getEmpId().equals(other.getEmpId());
    result = result && getName().equals(other.getName());
    result = result && role_ == other.role_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EMP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEmpId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static EmployeeResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static EmployeeResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static EmployeeResponse parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static EmployeeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static EmployeeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static EmployeeResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static EmployeeResponse parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static EmployeeResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static EmployeeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static EmployeeResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static EmployeeResponse parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static EmployeeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(EmployeeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /** Protobuf type {@code EmployeeResponse} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:EmployeeResponse)
      EmployeeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return EmployeeServiceOuterClass.internal_static_EmployeeResponse_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EmployeeServiceOuterClass.internal_static_EmployeeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(EmployeeResponse.class, Builder.class);
    }

    // Construct using
    // com.aexp.observability.monitoring.apppromethiusprototype.employee.EmployeeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @Override
    public Builder clear() {
      super.clear();
      empId_ = "";

      name_ = "";

      role_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return EmployeeServiceOuterClass.internal_static_EmployeeResponse_descriptor;
    }

    @Override
    public EmployeeResponse getDefaultInstanceForType() {
      return EmployeeResponse.getDefaultInstance();
    }

    @Override
    public EmployeeResponse build() {
      EmployeeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public EmployeeResponse buildPartial() {
      EmployeeResponse result = new EmployeeResponse(this);
      result.empId_ = empId_;
      result.name_ = name_;
      result.role_ = role_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @Override
    public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
      return (Builder) super.setField(field, value);
    }

    @Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof EmployeeResponse) {
        return mergeFrom((EmployeeResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(EmployeeResponse other) {
      if (other == EmployeeResponse.getDefaultInstance()) return this;
      if (!other.getEmpId().isEmpty()) {
        empId_ = other.empId_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      EmployeeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (EmployeeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object empId_ = "";
    /** <code>string emp_id = 1;</code> */
    public String getEmpId() {
      Object ref = empId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        empId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /** <code>string emp_id = 1;</code> */
    public com.google.protobuf.ByteString getEmpIdBytes() {
      Object ref = empId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        empId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /** <code>string emp_id = 1;</code> */
    public Builder setEmpId(String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      empId_ = value;
      onChanged();
      return this;
    }
    /** <code>string emp_id = 1;</code> */
    public Builder clearEmpId() {

      empId_ = getDefaultInstance().getEmpId();
      onChanged();
      return this;
    }
    /** <code>string emp_id = 1;</code> */
    public Builder setEmpIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      empId_ = value;
      onChanged();
      return this;
    }

    private Object name_ = "";
    /** <code>string name = 2;</code> */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /** <code>string name = 2;</code> */
    public com.google.protobuf.ByteString getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /** <code>string name = 2;</code> */
    public Builder setName(String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /** <code>string name = 2;</code> */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /** <code>string name = 2;</code> */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private int role_ = 0;
    /** <code>.constants.Role role = 3;</code> */
    public int getRoleValue() {
      return role_;
    }
    /** <code>.constants.Role role = 3;</code> */
    public Builder setRoleValue(int value) {
      role_ = value;
      onChanged();
      return this;
    }
    /** <code>.constants.Role role = 3;</code> */
    public com.techgeeknext.constants.Role getRole() {
      @SuppressWarnings("deprecation")
      com.techgeeknext.constants.Role result = com.techgeeknext.constants.Role.valueOf(role_);
      return result == null ? com.techgeeknext.constants.Role.UNRECOGNIZED : result;
    }
    /** <code>.constants.Role role = 3;</code> */
    public Builder setRole(com.techgeeknext.constants.Role value) {
      if (value == null) {
        throw new NullPointerException();
      }

      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /** <code>.constants.Role role = 3;</code> */
    public Builder clearRole() {

      role_ = 0;
      onChanged();
      return this;
    }

    @Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:EmployeeResponse)
  }

  // @@protoc_insertion_point(class_scope:EmployeeResponse)
  private static final EmployeeResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new EmployeeResponse();
  }

  public static EmployeeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmployeeResponse> PARSER =
      new com.google.protobuf.AbstractParser<EmployeeResponse>() {
        @Override
        public EmployeeResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new EmployeeResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<EmployeeResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<EmployeeResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public EmployeeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
