// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestDestroyNpcReq.proto

package emu.grasscutter.net.proto;

public final class QuestDestroyNpcReqOuterClass {
  private QuestDestroyNpcReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestDestroyNpcReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestDestroyNpcReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 npc_id = 9;</code>
     * @return The npcId.
     */
    int getNpcId();

    /**
     * <code>uint32 parent_quest_id = 15;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();
  }
  /**
   * <pre>
   * CmdId: 477
   * Name: PIINBBBJFHG
   * </pre>
   *
   * Protobuf type {@code QuestDestroyNpcReq}
   */
  public static final class QuestDestroyNpcReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestDestroyNpcReq)
      QuestDestroyNpcReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestDestroyNpcReq.newBuilder() to construct.
    private QuestDestroyNpcReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestDestroyNpcReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestDestroyNpcReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private QuestDestroyNpcReq(
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
            case 72: {

              npcId_ = input.readUInt32();
              break;
            }
            case 120: {

              parentQuestId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.internal_static_QuestDestroyNpcReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.internal_static_QuestDestroyNpcReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq.class, emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq.Builder.class);
    }

    public static final int NPC_ID_FIELD_NUMBER = 9;
    private int npcId_;
    /**
     * <code>uint32 npc_id = 9;</code>
     * @return The npcId.
     */
    @java.lang.Override
    public int getNpcId() {
      return npcId_;
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 15;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 15;</code>
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
      if (npcId_ != 0) {
        output.writeUInt32(9, npcId_);
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(15, parentQuestId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (npcId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, npcId_);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, parentQuestId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq other = (emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq) obj;

      if (getNpcId()
          != other.getNpcId()) return false;
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
      hash = (37 * hash) + NPC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcId();
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq prototype) {
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
     * CmdId: 477
     * Name: PIINBBBJFHG
     * </pre>
     *
     * Protobuf type {@code QuestDestroyNpcReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestDestroyNpcReq)
        emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.internal_static_QuestDestroyNpcReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.internal_static_QuestDestroyNpcReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq.class, emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq.newBuilder()
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
        npcId_ = 0;

        parentQuestId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.internal_static_QuestDestroyNpcReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq build() {
        emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq buildPartial() {
        emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq result = new emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq(this);
        result.npcId_ = npcId_;
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
        if (other instanceof emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq) {
          return mergeFrom((emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq other) {
        if (other == emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq.getDefaultInstance()) return this;
        if (other.getNpcId() != 0) {
          setNpcId(other.getNpcId());
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
        emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int npcId_ ;
      /**
       * <code>uint32 npc_id = 9;</code>
       * @return The npcId.
       */
      @java.lang.Override
      public int getNpcId() {
        return npcId_;
      }
      /**
       * <code>uint32 npc_id = 9;</code>
       * @param value The npcId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcId(int value) {
        
        npcId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npc_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcId() {
        
        npcId_ = 0;
        onChanged();
        return this;
      }

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 15;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 15;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 15;</code>
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


      // @@protoc_insertion_point(builder_scope:QuestDestroyNpcReq)
    }

    // @@protoc_insertion_point(class_scope:QuestDestroyNpcReq)
    private static final emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq();
    }

    public static emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestDestroyNpcReq>
        PARSER = new com.google.protobuf.AbstractParser<QuestDestroyNpcReq>() {
      @java.lang.Override
      public QuestDestroyNpcReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QuestDestroyNpcReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<QuestDestroyNpcReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestDestroyNpcReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestDestroyNpcReqOuterClass.QuestDestroyNpcReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestDestroyNpcReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestDestroyNpcReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030QuestDestroyNpcReq.proto\"=\n\022QuestDestr" +
      "oyNpcReq\022\016\n\006npc_id\030\t \001(\r\022\027\n\017parent_quest" +
      "_id\030\017 \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestDestroyNpcReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestDestroyNpcReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestDestroyNpcReq_descriptor,
        new java.lang.String[] { "NpcId", "ParentQuestId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
