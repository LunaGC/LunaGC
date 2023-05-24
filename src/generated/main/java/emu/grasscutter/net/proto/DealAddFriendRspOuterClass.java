// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DealAddFriendRsp.proto

package emu.grasscutter.net.proto;

public final class DealAddFriendRspOuterClass {
  private DealAddFriendRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DealAddFriendRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DealAddFriendRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.DealAddFriendResultType deal_add_friend_result = 6;</code>
     * @return The enum numeric value on the wire for dealAddFriendResult.
     */
    int getDealAddFriendResultValue();
    /**
     * <code>.DealAddFriendResultType deal_add_friend_result = 6;</code>
     * @return The dealAddFriendResult.
     */
    emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 target_uid = 10;</code>
     * @return The targetUid.
     */
    int getTargetUid();
  }
  /**
   * <pre>
   * CmdId: 4035
   * Obf: KFFFGHCHFCP
   * </pre>
   *
   * Protobuf type {@code DealAddFriendRsp}
   */
  public static final class DealAddFriendRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DealAddFriendRsp)
      DealAddFriendRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DealAddFriendRsp.newBuilder() to construct.
    private DealAddFriendRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DealAddFriendRsp() {
      dealAddFriendResult_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DealAddFriendRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DealAddFriendRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 48: {
              int rawValue = input.readEnum();

              dealAddFriendResult_ = rawValue;
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              targetUid_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return emu.grasscutter.net.proto.DealAddFriendRspOuterClass.internal_static_DealAddFriendRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DealAddFriendRspOuterClass.internal_static_DealAddFriendRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.class, emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.Builder.class);
    }

    public static final int DEAL_ADD_FRIEND_RESULT_FIELD_NUMBER = 6;
    private int dealAddFriendResult_;
    /**
     * <code>.DealAddFriendResultType deal_add_friend_result = 6;</code>
     * @return The enum numeric value on the wire for dealAddFriendResult.
     */
    @java.lang.Override public int getDealAddFriendResultValue() {
      return dealAddFriendResult_;
    }
    /**
     * <code>.DealAddFriendResultType deal_add_friend_result = 6;</code>
     * @return The dealAddFriendResult.
     */
    @java.lang.Override public emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType result = emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.valueOf(dealAddFriendResult_);
      return result == null ? emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TARGET_UID_FIELD_NUMBER = 10;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 10;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (dealAddFriendResult_ != emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_REJECT.getNumber()) {
        output.writeEnum(6, dealAddFriendResult_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(10, targetUid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dealAddFriendResult_ != emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_REJECT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, dealAddFriendResult_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, targetUid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp other = (emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp) obj;

      if (dealAddFriendResult_ != other.dealAddFriendResult_) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DEAL_ADD_FRIEND_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + dealAddFriendResult_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 4035
     * Obf: KFFFGHCHFCP
     * </pre>
     *
     * Protobuf type {@code DealAddFriendRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DealAddFriendRsp)
        emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DealAddFriendRspOuterClass.internal_static_DealAddFriendRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DealAddFriendRspOuterClass.internal_static_DealAddFriendRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.class, emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dealAddFriendResult_ = 0;

        retcode_ = 0;

        targetUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DealAddFriendRspOuterClass.internal_static_DealAddFriendRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp build() {
        emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp buildPartial() {
        emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp result = new emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp(this);
        result.dealAddFriendResult_ = dealAddFriendResult_;
        result.retcode_ = retcode_;
        result.targetUid_ = targetUid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp other) {
        if (other == emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.getDefaultInstance()) return this;
        if (other.dealAddFriendResult_ != 0) {
          setDealAddFriendResultValue(other.getDealAddFriendResultValue());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dealAddFriendResult_ = 0;
      /**
       * <code>.DealAddFriendResultType deal_add_friend_result = 6;</code>
       * @return The enum numeric value on the wire for dealAddFriendResult.
       */
      @java.lang.Override public int getDealAddFriendResultValue() {
        return dealAddFriendResult_;
      }
      /**
       * <code>.DealAddFriendResultType deal_add_friend_result = 6;</code>
       * @param value The enum numeric value on the wire for dealAddFriendResult to set.
       * @return This builder for chaining.
       */
      public Builder setDealAddFriendResultValue(int value) {
        
        dealAddFriendResult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.DealAddFriendResultType deal_add_friend_result = 6;</code>
       * @return The dealAddFriendResult.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType result = emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.valueOf(dealAddFriendResult_);
        return result == null ? emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.UNRECOGNIZED : result;
      }
      /**
       * <code>.DealAddFriendResultType deal_add_friend_result = 6;</code>
       * @param value The dealAddFriendResult to set.
       * @return This builder for chaining.
       */
      public Builder setDealAddFriendResult(emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dealAddFriendResult_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.DealAddFriendResultType deal_add_friend_result = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDealAddFriendResult() {
        
        dealAddFriendResult_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 10;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 10;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DealAddFriendRsp)
    }

    // @@protoc_insertion_point(class_scope:DealAddFriendRsp)
    private static final emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp();
    }

    public static emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DealAddFriendRsp>
        PARSER = new com.google.protobuf.AbstractParser<DealAddFriendRsp>() {
      @java.lang.Override
      public DealAddFriendRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DealAddFriendRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DealAddFriendRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DealAddFriendRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DealAddFriendRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DealAddFriendRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026DealAddFriendRsp.proto\032\035DealAddFriendR" +
      "esultType.proto\"q\n\020DealAddFriendRsp\0228\n\026d" +
      "eal_add_friend_result\030\006 \001(\0162\030.DealAddFri" +
      "endResultType\022\017\n\007retcode\030\007 \001(\005\022\022\n\ntarget" +
      "_uid\030\n \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.getDescriptor(),
        });
    internal_static_DealAddFriendRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DealAddFriendRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DealAddFriendRsp_descriptor,
        new java.lang.String[] { "DealAddFriendResult", "Retcode", "TargetUid", });
    emu.grasscutter.net.proto.DealAddFriendResultTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
