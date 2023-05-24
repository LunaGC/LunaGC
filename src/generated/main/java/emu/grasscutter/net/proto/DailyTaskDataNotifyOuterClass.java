// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DailyTaskDataNotify.proto

package emu.grasscutter.net.proto;

public final class DailyTaskDataNotifyOuterClass {
  private DailyTaskDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DailyTaskDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DailyTaskDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 finished_num = 6;</code>
     * @return The finishedNum.
     */
    int getFinishedNum();

    /**
     * <code>uint32 score_reward_id = 9;</code>
     * @return The scoreRewardId.
     */
    int getScoreRewardId();

    /**
     * <code>bool is_taken_score_reward = 15;</code>
     * @return The isTakenScoreReward.
     */
    boolean getIsTakenScoreReward();
  }
  /**
   * <pre>
   * CmdId: 156
   * Obf: LKFOLMKGHDK
   * </pre>
   *
   * Protobuf type {@code DailyTaskDataNotify}
   */
  public static final class DailyTaskDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DailyTaskDataNotify)
      DailyTaskDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DailyTaskDataNotify.newBuilder() to construct.
    private DailyTaskDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DailyTaskDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DailyTaskDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DailyTaskDataNotify(
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

              finishedNum_ = input.readUInt32();
              break;
            }
            case 72: {

              scoreRewardId_ = input.readUInt32();
              break;
            }
            case 120: {

              isTakenScoreReward_ = input.readBool();
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
      return emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.internal_static_DailyTaskDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.internal_static_DailyTaskDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.class, emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.Builder.class);
    }

    public static final int FINISHED_NUM_FIELD_NUMBER = 6;
    private int finishedNum_;
    /**
     * <code>uint32 finished_num = 6;</code>
     * @return The finishedNum.
     */
    @java.lang.Override
    public int getFinishedNum() {
      return finishedNum_;
    }

    public static final int SCORE_REWARD_ID_FIELD_NUMBER = 9;
    private int scoreRewardId_;
    /**
     * <code>uint32 score_reward_id = 9;</code>
     * @return The scoreRewardId.
     */
    @java.lang.Override
    public int getScoreRewardId() {
      return scoreRewardId_;
    }

    public static final int IS_TAKEN_SCORE_REWARD_FIELD_NUMBER = 15;
    private boolean isTakenScoreReward_;
    /**
     * <code>bool is_taken_score_reward = 15;</code>
     * @return The isTakenScoreReward.
     */
    @java.lang.Override
    public boolean getIsTakenScoreReward() {
      return isTakenScoreReward_;
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
      if (finishedNum_ != 0) {
        output.writeUInt32(6, finishedNum_);
      }
      if (scoreRewardId_ != 0) {
        output.writeUInt32(9, scoreRewardId_);
      }
      if (isTakenScoreReward_ != false) {
        output.writeBool(15, isTakenScoreReward_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (finishedNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, finishedNum_);
      }
      if (scoreRewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, scoreRewardId_);
      }
      if (isTakenScoreReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isTakenScoreReward_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify other = (emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify) obj;

      if (getFinishedNum()
          != other.getFinishedNum()) return false;
      if (getScoreRewardId()
          != other.getScoreRewardId()) return false;
      if (getIsTakenScoreReward()
          != other.getIsTakenScoreReward()) return false;
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
      hash = (37 * hash) + FINISHED_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getFinishedNum();
      hash = (37 * hash) + SCORE_REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScoreRewardId();
      hash = (37 * hash) + IS_TAKEN_SCORE_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTakenScoreReward());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify prototype) {
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
     * CmdId: 156
     * Obf: LKFOLMKGHDK
     * </pre>
     *
     * Protobuf type {@code DailyTaskDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DailyTaskDataNotify)
        emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.internal_static_DailyTaskDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.internal_static_DailyTaskDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.class, emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.newBuilder()
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
        finishedNum_ = 0;

        scoreRewardId_ = 0;

        isTakenScoreReward_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.internal_static_DailyTaskDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify build() {
        emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify buildPartial() {
        emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify result = new emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify(this);
        result.finishedNum_ = finishedNum_;
        result.scoreRewardId_ = scoreRewardId_;
        result.isTakenScoreReward_ = isTakenScoreReward_;
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
        if (other instanceof emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify other) {
        if (other == emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify.getDefaultInstance()) return this;
        if (other.getFinishedNum() != 0) {
          setFinishedNum(other.getFinishedNum());
        }
        if (other.getScoreRewardId() != 0) {
          setScoreRewardId(other.getScoreRewardId());
        }
        if (other.getIsTakenScoreReward() != false) {
          setIsTakenScoreReward(other.getIsTakenScoreReward());
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
        emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int finishedNum_ ;
      /**
       * <code>uint32 finished_num = 6;</code>
       * @return The finishedNum.
       */
      @java.lang.Override
      public int getFinishedNum() {
        return finishedNum_;
      }
      /**
       * <code>uint32 finished_num = 6;</code>
       * @param value The finishedNum to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedNum(int value) {
        
        finishedNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finished_num = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedNum() {
        
        finishedNum_ = 0;
        onChanged();
        return this;
      }

      private int scoreRewardId_ ;
      /**
       * <code>uint32 score_reward_id = 9;</code>
       * @return The scoreRewardId.
       */
      @java.lang.Override
      public int getScoreRewardId() {
        return scoreRewardId_;
      }
      /**
       * <code>uint32 score_reward_id = 9;</code>
       * @param value The scoreRewardId to set.
       * @return This builder for chaining.
       */
      public Builder setScoreRewardId(int value) {
        
        scoreRewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score_reward_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearScoreRewardId() {
        
        scoreRewardId_ = 0;
        onChanged();
        return this;
      }

      private boolean isTakenScoreReward_ ;
      /**
       * <code>bool is_taken_score_reward = 15;</code>
       * @return The isTakenScoreReward.
       */
      @java.lang.Override
      public boolean getIsTakenScoreReward() {
        return isTakenScoreReward_;
      }
      /**
       * <code>bool is_taken_score_reward = 15;</code>
       * @param value The isTakenScoreReward to set.
       * @return This builder for chaining.
       */
      public Builder setIsTakenScoreReward(boolean value) {
        
        isTakenScoreReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_taken_score_reward = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTakenScoreReward() {
        
        isTakenScoreReward_ = false;
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


      // @@protoc_insertion_point(builder_scope:DailyTaskDataNotify)
    }

    // @@protoc_insertion_point(class_scope:DailyTaskDataNotify)
    private static final emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify();
    }

    public static emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DailyTaskDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<DailyTaskDataNotify>() {
      @java.lang.Override
      public DailyTaskDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DailyTaskDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DailyTaskDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DailyTaskDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DailyTaskDataNotifyOuterClass.DailyTaskDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DailyTaskDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DailyTaskDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031DailyTaskDataNotify.proto\"c\n\023DailyTask" +
      "DataNotify\022\024\n\014finished_num\030\006 \001(\r\022\027\n\017scor" +
      "e_reward_id\030\t \001(\r\022\035\n\025is_taken_score_rewa" +
      "rd\030\017 \001(\010B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DailyTaskDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DailyTaskDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DailyTaskDataNotify_descriptor,
        new java.lang.String[] { "FinishedNum", "ScoreRewardId", "IsTakenScoreReward", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
