// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ParentQuestInferenceDataNotify.proto

package emu.grasscutter.net.proto;

public final class ParentQuestInferenceDataNotifyOuterClass {
  private ParentQuestInferenceDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParentQuestInferenceDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ParentQuestInferenceDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo> 
        getInferencePageListList();
    /**
     * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
     */
    emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo getInferencePageList(int index);
    /**
     * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
     */
    int getInferencePageListCount();
    /**
     * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfoOrBuilder> 
        getInferencePageListOrBuilderList();
    /**
     * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
     */
    emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfoOrBuilder getInferencePageListOrBuilder(
        int index);

    /**
     * <code>uint32 parent_quest_id = 4;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();
  }
  /**
   * <pre>
   * CmdId: 24796
   * Obf: LPFEFNDAENI
   * </pre>
   *
   * Protobuf type {@code ParentQuestInferenceDataNotify}
   */
  public static final class ParentQuestInferenceDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ParentQuestInferenceDataNotify)
      ParentQuestInferenceDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ParentQuestInferenceDataNotify.newBuilder() to construct.
    private ParentQuestInferenceDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ParentQuestInferenceDataNotify() {
      inferencePageList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ParentQuestInferenceDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ParentQuestInferenceDataNotify(
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

              parentQuestId_ = input.readUInt32();
              break;
            }
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                inferencePageList_ = new java.util.ArrayList<emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              inferencePageList_.add(
                  input.readMessage(emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.parser(), extensionRegistry));
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
          inferencePageList_ = java.util.Collections.unmodifiableList(inferencePageList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.internal_static_ParentQuestInferenceDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.internal_static_ParentQuestInferenceDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify.class, emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify.Builder.class);
    }

    public static final int INFERENCE_PAGE_LIST_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo> inferencePageList_;
    /**
     * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo> getInferencePageListList() {
      return inferencePageList_;
    }
    /**
     * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfoOrBuilder> 
        getInferencePageListOrBuilderList() {
      return inferencePageList_;
    }
    /**
     * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
     */
    @java.lang.Override
    public int getInferencePageListCount() {
      return inferencePageList_.size();
    }
    /**
     * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo getInferencePageList(int index) {
      return inferencePageList_.get(index);
    }
    /**
     * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfoOrBuilder getInferencePageListOrBuilder(
        int index) {
      return inferencePageList_.get(index);
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 4;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 4;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
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
      if (parentQuestId_ != 0) {
        output.writeUInt32(4, parentQuestId_);
      }
      for (int i = 0; i < inferencePageList_.size(); i++) {
        output.writeMessage(12, inferencePageList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, parentQuestId_);
      }
      for (int i = 0; i < inferencePageList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, inferencePageList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify other = (emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify) obj;

      if (!getInferencePageListList()
          .equals(other.getInferencePageListList())) return false;
      if (getParentQuestId()
          != other.getParentQuestId()) return false;
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
      if (getInferencePageListCount() > 0) {
        hash = (37 * hash) + INFERENCE_PAGE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getInferencePageListList().hashCode();
      }
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify prototype) {
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
     * CmdId: 24796
     * Obf: LPFEFNDAENI
     * </pre>
     *
     * Protobuf type {@code ParentQuestInferenceDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ParentQuestInferenceDataNotify)
        emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.internal_static_ParentQuestInferenceDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.internal_static_ParentQuestInferenceDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify.class, emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify.newBuilder()
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
          getInferencePageListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (inferencePageListBuilder_ == null) {
          inferencePageList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          inferencePageListBuilder_.clear();
        }
        parentQuestId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.internal_static_ParentQuestInferenceDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify build() {
        emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify buildPartial() {
        emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify result = new emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (inferencePageListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            inferencePageList_ = java.util.Collections.unmodifiableList(inferencePageList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.inferencePageList_ = inferencePageList_;
        } else {
          result.inferencePageList_ = inferencePageListBuilder_.build();
        }
        result.parentQuestId_ = parentQuestId_;
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
        if (other instanceof emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify other) {
        if (other == emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify.getDefaultInstance()) return this;
        if (inferencePageListBuilder_ == null) {
          if (!other.inferencePageList_.isEmpty()) {
            if (inferencePageList_.isEmpty()) {
              inferencePageList_ = other.inferencePageList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInferencePageListIsMutable();
              inferencePageList_.addAll(other.inferencePageList_);
            }
            onChanged();
          }
        } else {
          if (!other.inferencePageList_.isEmpty()) {
            if (inferencePageListBuilder_.isEmpty()) {
              inferencePageListBuilder_.dispose();
              inferencePageListBuilder_ = null;
              inferencePageList_ = other.inferencePageList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              inferencePageListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInferencePageListFieldBuilder() : null;
            } else {
              inferencePageListBuilder_.addAllMessages(other.inferencePageList_);
            }
          }
        }
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
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
        emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo> inferencePageList_ =
        java.util.Collections.emptyList();
      private void ensureInferencePageListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          inferencePageList_ = new java.util.ArrayList<emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo>(inferencePageList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.Builder, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfoOrBuilder> inferencePageListBuilder_;

      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo> getInferencePageListList() {
        if (inferencePageListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(inferencePageList_);
        } else {
          return inferencePageListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public int getInferencePageListCount() {
        if (inferencePageListBuilder_ == null) {
          return inferencePageList_.size();
        } else {
          return inferencePageListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo getInferencePageList(int index) {
        if (inferencePageListBuilder_ == null) {
          return inferencePageList_.get(index);
        } else {
          return inferencePageListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public Builder setInferencePageList(
          int index, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo value) {
        if (inferencePageListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInferencePageListIsMutable();
          inferencePageList_.set(index, value);
          onChanged();
        } else {
          inferencePageListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public Builder setInferencePageList(
          int index, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.Builder builderForValue) {
        if (inferencePageListBuilder_ == null) {
          ensureInferencePageListIsMutable();
          inferencePageList_.set(index, builderForValue.build());
          onChanged();
        } else {
          inferencePageListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public Builder addInferencePageList(emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo value) {
        if (inferencePageListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInferencePageListIsMutable();
          inferencePageList_.add(value);
          onChanged();
        } else {
          inferencePageListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public Builder addInferencePageList(
          int index, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo value) {
        if (inferencePageListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInferencePageListIsMutable();
          inferencePageList_.add(index, value);
          onChanged();
        } else {
          inferencePageListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public Builder addInferencePageList(
          emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.Builder builderForValue) {
        if (inferencePageListBuilder_ == null) {
          ensureInferencePageListIsMutable();
          inferencePageList_.add(builderForValue.build());
          onChanged();
        } else {
          inferencePageListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public Builder addInferencePageList(
          int index, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.Builder builderForValue) {
        if (inferencePageListBuilder_ == null) {
          ensureInferencePageListIsMutable();
          inferencePageList_.add(index, builderForValue.build());
          onChanged();
        } else {
          inferencePageListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public Builder addAllInferencePageList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo> values) {
        if (inferencePageListBuilder_ == null) {
          ensureInferencePageListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, inferencePageList_);
          onChanged();
        } else {
          inferencePageListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public Builder clearInferencePageList() {
        if (inferencePageListBuilder_ == null) {
          inferencePageList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          inferencePageListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public Builder removeInferencePageList(int index) {
        if (inferencePageListBuilder_ == null) {
          ensureInferencePageListIsMutable();
          inferencePageList_.remove(index);
          onChanged();
        } else {
          inferencePageListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.Builder getInferencePageListBuilder(
          int index) {
        return getInferencePageListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfoOrBuilder getInferencePageListOrBuilder(
          int index) {
        if (inferencePageListBuilder_ == null) {
          return inferencePageList_.get(index);  } else {
          return inferencePageListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfoOrBuilder> 
           getInferencePageListOrBuilderList() {
        if (inferencePageListBuilder_ != null) {
          return inferencePageListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(inferencePageList_);
        }
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.Builder addInferencePageListBuilder() {
        return getInferencePageListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.Builder addInferencePageListBuilder(
          int index) {
        return getInferencePageListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .InferencePageInfo inference_page_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.Builder> 
           getInferencePageListBuilderList() {
        return getInferencePageListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.Builder, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfoOrBuilder> 
          getInferencePageListFieldBuilder() {
        if (inferencePageListBuilder_ == null) {
          inferencePageListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfo.Builder, emu.grasscutter.net.proto.InferencePageInfoOuterClass.InferencePageInfoOrBuilder>(
                  inferencePageList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          inferencePageList_ = null;
        }
        return inferencePageListBuilder_;
      }

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 4;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 4;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ParentQuestInferenceDataNotify)
    }

    // @@protoc_insertion_point(class_scope:ParentQuestInferenceDataNotify)
    private static final emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify();
    }

    public static emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ParentQuestInferenceDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<ParentQuestInferenceDataNotify>() {
      @java.lang.Override
      public ParentQuestInferenceDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ParentQuestInferenceDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ParentQuestInferenceDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ParentQuestInferenceDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ParentQuestInferenceDataNotifyOuterClass.ParentQuestInferenceDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ParentQuestInferenceDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ParentQuestInferenceDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$ParentQuestInferenceDataNotify.proto\032\027" +
      "InferencePageInfo.proto\"j\n\036ParentQuestIn" +
      "ferenceDataNotify\022/\n\023inference_page_list" +
      "\030\014 \003(\0132\022.InferencePageInfo\022\027\n\017parent_que" +
      "st_id\030\004 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.InferencePageInfoOuterClass.getDescriptor(),
        });
    internal_static_ParentQuestInferenceDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ParentQuestInferenceDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ParentQuestInferenceDataNotify_descriptor,
        new java.lang.String[] { "InferencePageList", "ParentQuestId", });
    emu.grasscutter.net.proto.InferencePageInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
