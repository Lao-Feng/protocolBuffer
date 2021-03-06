// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StepInfo.proto

package com.demo.v3;

public final class StepInfoBean {
  private StepInfoBean() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StepInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.demo.v3.StepInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 StepNo = 1;</code>
     */
    long getStepNo();

    /**
     * <code>string StepName = 2;</code>
     */
    String getStepName();
    /**
     * <code>string StepName = 2;</code>
     */
    com.google.protobuf.ByteString
        getStepNameBytes();

    /**
     * <code>int32 StepStatus = 3;</code>
     */
    int getStepStatus();

    /**
     * <code>string Reason = 4;</code>
     */
    String getReason();
    /**
     * <code>string Reason = 4;</code>
     */
    com.google.protobuf.ByteString
        getReasonBytes();

    /**
     * <code>string StartTime = 5;</code>
     */
    String getStartTime();
    /**
     * <code>string StartTime = 5;</code>
     */
    com.google.protobuf.ByteString
        getStartTimeBytes();

    /**
     * <code>string EndTime = 6;</code>
     */
    String getEndTime();
    /**
     * <code>string EndTime = 6;</code>
     */
    com.google.protobuf.ByteString
        getEndTimeBytes();
  }
  /**
   * Protobuf type {@code com.demo.v3.StepInfo}
   */
  public  static final class StepInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.demo.v3.StepInfo)
      StepInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StepInfo.newBuilder() to construct.
    private StepInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StepInfo() {
      stepNo_ = 0L;
      stepName_ = "";
      stepStatus_ = 0;
      reason_ = "";
      startTime_ = "";
      endTime_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StepInfo(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              stepNo_ = input.readInt64();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              stepName_ = s;
              break;
            }
            case 24: {

              stepStatus_ = input.readInt32();
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              reason_ = s;
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();

              startTime_ = s;
              break;
            }
            case 50: {
              String s = input.readStringRequireUtf8();

              endTime_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StepInfoBean.internal_static_com_demo_v3_StepInfo_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StepInfoBean.internal_static_com_demo_v3_StepInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StepInfo.class, Builder.class);
    }

    public static final int STEPNO_FIELD_NUMBER = 1;
    private long stepNo_;
    /**
     * <code>int64 StepNo = 1;</code>
     */
    public long getStepNo() {
      return stepNo_;
    }

    public static final int STEPNAME_FIELD_NUMBER = 2;
    private volatile Object stepName_;
    /**
     * <code>string StepName = 2;</code>
     */
    public String getStepName() {
      Object ref = stepName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        stepName_ = s;
        return s;
      }
    }
    /**
     * <code>string StepName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStepNameBytes() {
      Object ref = stepName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        stepName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STEPSTATUS_FIELD_NUMBER = 3;
    private int stepStatus_;
    /**
     * <code>int32 StepStatus = 3;</code>
     */
    public int getStepStatus() {
      return stepStatus_;
    }

    public static final int REASON_FIELD_NUMBER = 4;
    private volatile Object reason_;
    /**
     * <code>string Reason = 4;</code>
     */
    public String getReason() {
      Object ref = reason_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        reason_ = s;
        return s;
      }
    }
    /**
     * <code>string Reason = 4;</code>
     */
    public com.google.protobuf.ByteString
        getReasonBytes() {
      Object ref = reason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STARTTIME_FIELD_NUMBER = 5;
    private volatile Object startTime_;
    /**
     * <code>string StartTime = 5;</code>
     */
    public String getStartTime() {
      Object ref = startTime_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        startTime_ = s;
        return s;
      }
    }
    /**
     * <code>string StartTime = 5;</code>
     */
    public com.google.protobuf.ByteString
        getStartTimeBytes() {
      Object ref = startTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ENDTIME_FIELD_NUMBER = 6;
    private volatile Object endTime_;
    /**
     * <code>string EndTime = 6;</code>
     */
    public String getEndTime() {
      Object ref = endTime_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        endTime_ = s;
        return s;
      }
    }
    /**
     * <code>string EndTime = 6;</code>
     */
    public com.google.protobuf.ByteString
        getEndTimeBytes() {
      Object ref = endTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        endTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (stepNo_ != 0L) {
        output.writeInt64(1, stepNo_);
      }
      if (!getStepNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stepName_);
      }
      if (stepStatus_ != 0) {
        output.writeInt32(3, stepStatus_);
      }
      if (!getReasonBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, reason_);
      }
      if (!getStartTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, startTime_);
      }
      if (!getEndTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, endTime_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stepNo_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, stepNo_);
      }
      if (!getStepNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stepName_);
      }
      if (stepStatus_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, stepStatus_);
      }
      if (!getReasonBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, reason_);
      }
      if (!getStartTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, startTime_);
      }
      if (!getEndTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, endTime_);
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
      if (!(obj instanceof StepInfo)) {
        return super.equals(obj);
      }
      StepInfo other = (StepInfo) obj;

      boolean result = true;
      result = result && (getStepNo()
          == other.getStepNo());
      result = result && getStepName()
          .equals(other.getStepName());
      result = result && (getStepStatus()
          == other.getStepStatus());
      result = result && getReason()
          .equals(other.getReason());
      result = result && getStartTime()
          .equals(other.getStartTime());
      result = result && getEndTime()
          .equals(other.getEndTime());
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
      hash = (37 * hash) + STEPNO_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStepNo());
      hash = (37 * hash) + STEPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getStepName().hashCode();
      hash = (37 * hash) + STEPSTATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStepStatus();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + getReason().hashCode();
      hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
      hash = (37 * hash) + ENDTIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static StepInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StepInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StepInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StepInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StepInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StepInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StepInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static StepInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static StepInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static StepInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static StepInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static StepInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(StepInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.demo.v3.StepInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.demo.v3.StepInfo)
        StepInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return StepInfoBean.internal_static_com_demo_v3_StepInfo_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return StepInfoBean.internal_static_com_demo_v3_StepInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StepInfo.class, Builder.class);
      }

      // Construct using com.demo.v3.StepInfoBean.StepInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        stepNo_ = 0L;

        stepName_ = "";

        stepStatus_ = 0;

        reason_ = "";

        startTime_ = "";

        endTime_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return StepInfoBean.internal_static_com_demo_v3_StepInfo_descriptor;
      }

      public StepInfo getDefaultInstanceForType() {
        return StepInfo.getDefaultInstance();
      }

      public StepInfo build() {
        StepInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public StepInfo buildPartial() {
        StepInfo result = new StepInfo(this);
        result.stepNo_ = stepNo_;
        result.stepName_ = stepName_;
        result.stepStatus_ = stepStatus_;
        result.reason_ = reason_;
        result.startTime_ = startTime_;
        result.endTime_ = endTime_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof StepInfo) {
          return mergeFrom((StepInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(StepInfo other) {
        if (other == StepInfo.getDefaultInstance()) return this;
        if (other.getStepNo() != 0L) {
          setStepNo(other.getStepNo());
        }
        if (!other.getStepName().isEmpty()) {
          stepName_ = other.stepName_;
          onChanged();
        }
        if (other.getStepStatus() != 0) {
          setStepStatus(other.getStepStatus());
        }
        if (!other.getReason().isEmpty()) {
          reason_ = other.reason_;
          onChanged();
        }
        if (!other.getStartTime().isEmpty()) {
          startTime_ = other.startTime_;
          onChanged();
        }
        if (!other.getEndTime().isEmpty()) {
          endTime_ = other.endTime_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        StepInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (StepInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long stepNo_ ;
      /**
       * <code>int64 StepNo = 1;</code>
       */
      public long getStepNo() {
        return stepNo_;
      }
      /**
       * <code>int64 StepNo = 1;</code>
       */
      public Builder setStepNo(long value) {
        
        stepNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 StepNo = 1;</code>
       */
      public Builder clearStepNo() {
        
        stepNo_ = 0L;
        onChanged();
        return this;
      }

      private Object stepName_ = "";
      /**
       * <code>string StepName = 2;</code>
       */
      public String getStepName() {
        Object ref = stepName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          stepName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string StepName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStepNameBytes() {
        Object ref = stepName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          stepName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string StepName = 2;</code>
       */
      public Builder setStepName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        stepName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string StepName = 2;</code>
       */
      public Builder clearStepName() {
        
        stepName_ = getDefaultInstance().getStepName();
        onChanged();
        return this;
      }
      /**
       * <code>string StepName = 2;</code>
       */
      public Builder setStepNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        stepName_ = value;
        onChanged();
        return this;
      }

      private int stepStatus_ ;
      /**
       * <code>int32 StepStatus = 3;</code>
       */
      public int getStepStatus() {
        return stepStatus_;
      }
      /**
       * <code>int32 StepStatus = 3;</code>
       */
      public Builder setStepStatus(int value) {
        
        stepStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 StepStatus = 3;</code>
       */
      public Builder clearStepStatus() {
        
        stepStatus_ = 0;
        onChanged();
        return this;
      }

      private Object reason_ = "";
      /**
       * <code>string Reason = 4;</code>
       */
      public String getReason() {
        Object ref = reason_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          reason_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string Reason = 4;</code>
       */
      public com.google.protobuf.ByteString
          getReasonBytes() {
        Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Reason = 4;</code>
       */
      public Builder setReason(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Reason = 4;</code>
       */
      public Builder clearReason() {
        
        reason_ = getDefaultInstance().getReason();
        onChanged();
        return this;
      }
      /**
       * <code>string Reason = 4;</code>
       */
      public Builder setReasonBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        reason_ = value;
        onChanged();
        return this;
      }

      private Object startTime_ = "";
      /**
       * <code>string StartTime = 5;</code>
       */
      public String getStartTime() {
        Object ref = startTime_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          startTime_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string StartTime = 5;</code>
       */
      public com.google.protobuf.ByteString
          getStartTimeBytes() {
        Object ref = startTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          startTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string StartTime = 5;</code>
       */
      public Builder setStartTime(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        startTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string StartTime = 5;</code>
       */
      public Builder clearStartTime() {
        
        startTime_ = getDefaultInstance().getStartTime();
        onChanged();
        return this;
      }
      /**
       * <code>string StartTime = 5;</code>
       */
      public Builder setStartTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        startTime_ = value;
        onChanged();
        return this;
      }

      private Object endTime_ = "";
      /**
       * <code>string EndTime = 6;</code>
       */
      public String getEndTime() {
        Object ref = endTime_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          endTime_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string EndTime = 6;</code>
       */
      public com.google.protobuf.ByteString
          getEndTimeBytes() {
        Object ref = endTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          endTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string EndTime = 6;</code>
       */
      public Builder setEndTime(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string EndTime = 6;</code>
       */
      public Builder clearEndTime() {
        
        endTime_ = getDefaultInstance().getEndTime();
        onChanged();
        return this;
      }
      /**
       * <code>string EndTime = 6;</code>
       */
      public Builder setEndTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        endTime_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.demo.v3.StepInfo)
    }

    // @@protoc_insertion_point(class_scope:com.demo.v3.StepInfo)
    private static final StepInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StepInfo();
    }

    public static StepInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StepInfo>
        PARSER = new com.google.protobuf.AbstractParser<StepInfo>() {
      public StepInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StepInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StepInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<StepInfo> getParserForType() {
      return PARSER;
    }

    public StepInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_v3_StepInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_v3_StepInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016StepInfo.proto\022\013com.demo.v3\"t\n\010StepInf" +
      "o\022\016\n\006StepNo\030\001 \001(\003\022\020\n\010StepName\030\002 \001(\t\022\022\n\nS" +
      "tepStatus\030\003 \001(\005\022\016\n\006Reason\030\004 \001(\t\022\021\n\tStart" +
      "Time\030\005 \001(\t\022\017\n\007EndTime\030\006 \001(\tB\033\n\013com.demo." +
      "v3B\014StepInfoBeanb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_demo_v3_StepInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_demo_v3_StepInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_v3_StepInfo_descriptor,
        new String[] { "StepNo", "StepName", "StepStatus", "Reason", "StartTime", "EndTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
