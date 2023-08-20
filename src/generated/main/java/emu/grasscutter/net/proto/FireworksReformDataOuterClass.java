// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireworksReformData.proto

package emu.grasscutter.net.proto;

public final class FireworksReformDataOuterClass {
  private FireworksReformDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FireworksReformDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FireworksReformData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam> 
        getReformParamListList();
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
     */
    emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam getReformParamList(int index);
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
     */
    int getReformParamListCount();
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder> 
        getReformParamListOrBuilderList();
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
     */
    emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder getReformParamListOrBuilder(
        int index);

    /**
     * <code>uint32 id = 4;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * Obf: PNMCPOPPKJL
   * </pre>
   *
   * Protobuf type {@code FireworksReformData}
   */
  public static final class FireworksReformData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FireworksReformData)
      FireworksReformDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FireworksReformData.newBuilder() to construct.
    private FireworksReformData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FireworksReformData() {
      reformParamList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FireworksReformData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FireworksReformData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            case 32: {

              id_ = input.readUInt32();
              break;
            }
            case 74: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                reformParamList_ = new java.util.ArrayList<emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              reformParamList_.add(
                  input.readMessage(emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          reformParamList_ = java.util.Collections.unmodifiableList(reformParamList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FireworksReformDataOuterClass.internal_static_FireworksReformData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FireworksReformDataOuterClass.internal_static_FireworksReformData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.class, emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.Builder.class);
    }

    public static final int REFORM_PARAM_LIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam> reformParamList_;
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam> getReformParamListList() {
      return reformParamList_;
    }
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder> 
        getReformParamListOrBuilderList() {
      return reformParamList_;
    }
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
     */
    @java.lang.Override
    public int getReformParamListCount() {
      return reformParamList_.size();
    }
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam getReformParamList(int index) {
      return reformParamList_.get(index);
    }
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder getReformParamListOrBuilder(
        int index) {
      return reformParamList_.get(index);
    }

    public static final int ID_FIELD_NUMBER = 4;
    private int id_;
    /**
     * <code>uint32 id = 4;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (id_ != 0) {
        output.writeUInt32(4, id_);
      }
      for (int i = 0; i < reformParamList_.size(); i++) {
        output.writeMessage(9, reformParamList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, id_);
      }
      for (int i = 0; i < reformParamList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, reformParamList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData other = (emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData) obj;

      if (!getReformParamListList()
          .equals(other.getReformParamListList())) return false;
      if (getId()
          != other.getId()) return false;
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
      if (getReformParamListCount() > 0) {
        hash = (37 * hash) + REFORM_PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getReformParamListList().hashCode();
      }
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData prototype) {
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
     * Obf: PNMCPOPPKJL
     * </pre>
     *
     * Protobuf type {@code FireworksReformData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FireworksReformData)
        emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FireworksReformDataOuterClass.internal_static_FireworksReformData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FireworksReformDataOuterClass.internal_static_FireworksReformData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.class, emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.newBuilder()
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
          getReformParamListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (reformParamListBuilder_ == null) {
          reformParamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          reformParamListBuilder_.clear();
        }
        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FireworksReformDataOuterClass.internal_static_FireworksReformData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData build() {
        emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData buildPartial() {
        emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData result = new emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData(this);
        int from_bitField0_ = bitField0_;
        if (reformParamListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            reformParamList_ = java.util.Collections.unmodifiableList(reformParamList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.reformParamList_ = reformParamList_;
        } else {
          result.reformParamList_ = reformParamListBuilder_.build();
        }
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData) {
          return mergeFrom((emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData other) {
        if (other == emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.getDefaultInstance()) return this;
        if (reformParamListBuilder_ == null) {
          if (!other.reformParamList_.isEmpty()) {
            if (reformParamList_.isEmpty()) {
              reformParamList_ = other.reformParamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureReformParamListIsMutable();
              reformParamList_.addAll(other.reformParamList_);
            }
            onChanged();
          }
        } else {
          if (!other.reformParamList_.isEmpty()) {
            if (reformParamListBuilder_.isEmpty()) {
              reformParamListBuilder_.dispose();
              reformParamListBuilder_ = null;
              reformParamList_ = other.reformParamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              reformParamListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getReformParamListFieldBuilder() : null;
            } else {
              reformParamListBuilder_.addAllMessages(other.reformParamList_);
            }
          }
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
        emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam> reformParamList_ =
        java.util.Collections.emptyList();
      private void ensureReformParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          reformParamList_ = new java.util.ArrayList<emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam>(reformParamList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder> reformParamListBuilder_;

      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam> getReformParamListList() {
        if (reformParamListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(reformParamList_);
        } else {
          return reformParamListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public int getReformParamListCount() {
        if (reformParamListBuilder_ == null) {
          return reformParamList_.size();
        } else {
          return reformParamListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam getReformParamList(int index) {
        if (reformParamListBuilder_ == null) {
          return reformParamList_.get(index);
        } else {
          return reformParamListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public Builder setReformParamList(
          int index, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam value) {
        if (reformParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReformParamListIsMutable();
          reformParamList_.set(index, value);
          onChanged();
        } else {
          reformParamListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public Builder setReformParamList(
          int index, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder builderForValue) {
        if (reformParamListBuilder_ == null) {
          ensureReformParamListIsMutable();
          reformParamList_.set(index, builderForValue.build());
          onChanged();
        } else {
          reformParamListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public Builder addReformParamList(emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam value) {
        if (reformParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReformParamListIsMutable();
          reformParamList_.add(value);
          onChanged();
        } else {
          reformParamListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public Builder addReformParamList(
          int index, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam value) {
        if (reformParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReformParamListIsMutable();
          reformParamList_.add(index, value);
          onChanged();
        } else {
          reformParamListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public Builder addReformParamList(
          emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder builderForValue) {
        if (reformParamListBuilder_ == null) {
          ensureReformParamListIsMutable();
          reformParamList_.add(builderForValue.build());
          onChanged();
        } else {
          reformParamListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public Builder addReformParamList(
          int index, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder builderForValue) {
        if (reformParamListBuilder_ == null) {
          ensureReformParamListIsMutable();
          reformParamList_.add(index, builderForValue.build());
          onChanged();
        } else {
          reformParamListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public Builder addAllReformParamList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam> values) {
        if (reformParamListBuilder_ == null) {
          ensureReformParamListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, reformParamList_);
          onChanged();
        } else {
          reformParamListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public Builder clearReformParamList() {
        if (reformParamListBuilder_ == null) {
          reformParamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          reformParamListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public Builder removeReformParamList(int index) {
        if (reformParamListBuilder_ == null) {
          ensureReformParamListIsMutable();
          reformParamList_.remove(index);
          onChanged();
        } else {
          reformParamListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder getReformParamListBuilder(
          int index) {
        return getReformParamListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder getReformParamListOrBuilder(
          int index) {
        if (reformParamListBuilder_ == null) {
          return reformParamList_.get(index);  } else {
          return reformParamListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder> 
           getReformParamListOrBuilderList() {
        if (reformParamListBuilder_ != null) {
          return reformParamListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(reformParamList_);
        }
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder addReformParamListBuilder() {
        return getReformParamListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.getDefaultInstance());
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder addReformParamListBuilder(
          int index) {
        return getReformParamListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.getDefaultInstance());
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder> 
           getReformParamListBuilderList() {
        return getReformParamListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder> 
          getReformParamListFieldBuilder() {
        if (reformParamListBuilder_ == null) {
          reformParamListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParam.Builder, emu.grasscutter.net.proto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder>(
                  reformParamList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          reformParamList_ = null;
        }
        return reformParamListBuilder_;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 4;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 4;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FireworksReformData)
    }

    // @@protoc_insertion_point(class_scope:FireworksReformData)
    private static final emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData();
    }

    public static emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FireworksReformData>
        PARSER = new com.google.protobuf.AbstractParser<FireworksReformData>() {
      @java.lang.Override
      public FireworksReformData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FireworksReformData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FireworksReformData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FireworksReformData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FireworksReformData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FireworksReformData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031FireworksReformData.proto\032\032FireworksRe" +
      "formParam.proto\"S\n\023FireworksReformData\0220" +
      "\n\021reform_param_list\030\t \003(\0132\025.FireworksRef" +
      "ormParam\022\n\n\002id\030\004 \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FireworksReformParamOuterClass.getDescriptor(),
        });
    internal_static_FireworksReformData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FireworksReformData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FireworksReformData_descriptor,
        new java.lang.String[] { "ReformParamList", "Id", });
    emu.grasscutter.net.proto.FireworksReformParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
