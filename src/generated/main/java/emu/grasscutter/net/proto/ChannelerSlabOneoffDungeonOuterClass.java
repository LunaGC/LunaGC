// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabOneoffDungeon.proto

package emu.grasscutter.net.proto;

public final class ChannelerSlabOneoffDungeonOuterClass {
  private ChannelerSlabOneoffDungeonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabOneoffDungeonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabOneoffDungeon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 12;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 reward_id = 14;</code>
     * @return The rewardId.
     */
    int getRewardId();

    /**
     * <code>bool is_done = 4;</code>
     * @return The isDone.
     */
    boolean getIsDone();
  }
  /**
   * <pre>
   * Name: BAEHNHHABBK
   * </pre>
   *
   * Protobuf type {@code ChannelerSlabOneoffDungeon}
   */
  public static final class ChannelerSlabOneoffDungeon extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabOneoffDungeon)
      ChannelerSlabOneoffDungeonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabOneoffDungeon.newBuilder() to construct.
    private ChannelerSlabOneoffDungeon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabOneoffDungeon() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabOneoffDungeon();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.internal_static_ChannelerSlabOneoffDungeon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.internal_static_ChannelerSlabOneoffDungeon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon.class, emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 12;
    private int dungeonId_ = 0;
    /**
     * <code>uint32 dungeon_id = 12;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int REWARD_ID_FIELD_NUMBER = 14;
    private int rewardId_ = 0;
    /**
     * <code>uint32 reward_id = 14;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
    }

    public static final int IS_DONE_FIELD_NUMBER = 4;
    private boolean isDone_ = false;
    /**
     * <code>bool is_done = 4;</code>
     * @return The isDone.
     */
    @java.lang.Override
    public boolean getIsDone() {
      return isDone_;
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
      if (isDone_ != false) {
        output.writeBool(4, isDone_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(12, dungeonId_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(14, rewardId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isDone_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isDone_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dungeonId_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, rewardId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon other = (emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getRewardId()
          != other.getRewardId()) return false;
      if (getIsDone()
          != other.getIsDone()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (37 * hash) + IS_DONE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDone());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon prototype) {
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
     * Name: BAEHNHHABBK
     * </pre>
     *
     * Protobuf type {@code ChannelerSlabOneoffDungeon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabOneoffDungeon)
        emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.internal_static_ChannelerSlabOneoffDungeon_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.internal_static_ChannelerSlabOneoffDungeon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon.class, emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        dungeonId_ = 0;
        rewardId_ = 0;
        isDone_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.internal_static_ChannelerSlabOneoffDungeon_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon build() {
        emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon buildPartial() {
        emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon result = new emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dungeonId_ = dungeonId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.rewardId_ = rewardId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isDone_ = isDone_;
        }
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
        if (other instanceof emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon) {
          return mergeFrom((emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon other) {
        if (other == emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
        }
        if (other.getIsDone() != false) {
          setIsDone(other.getIsDone());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 32: {
                isDone_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
              case 96: {
                dungeonId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
              case 112: {
                rewardId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 14;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 14;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        rewardId_ = 0;
        onChanged();
        return this;
      }

      private boolean isDone_ ;
      /**
       * <code>bool is_done = 4;</code>
       * @return The isDone.
       */
      @java.lang.Override
      public boolean getIsDone() {
        return isDone_;
      }
      /**
       * <code>bool is_done = 4;</code>
       * @param value The isDone to set.
       * @return This builder for chaining.
       */
      public Builder setIsDone(boolean value) {
        
        isDone_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_done = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDone() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isDone_ = false;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabOneoffDungeon)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabOneoffDungeon)
    private static final emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon();
    }

    public static emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabOneoffDungeon>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabOneoffDungeon>() {
      @java.lang.Override
      public ChannelerSlabOneoffDungeon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ChannelerSlabOneoffDungeon> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabOneoffDungeon> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChannelerSlabOneoffDungeonOuterClass.ChannelerSlabOneoffDungeon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabOneoffDungeon_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabOneoffDungeon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ChannelerSlabOneoffDungeon.proto\"T\n\032Ch" +
      "annelerSlabOneoffDungeon\022\022\n\ndungeon_id\030\014" +
      " \001(\r\022\021\n\treward_id\030\016 \001(\r\022\017\n\007is_done\030\004 \001(\010" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabOneoffDungeon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabOneoffDungeon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabOneoffDungeon_descriptor,
        new java.lang.String[] { "DungeonId", "RewardId", "IsDone", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
