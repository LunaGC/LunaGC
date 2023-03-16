// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OfficialCustomDungeon.proto

package emu.grasscutter.net.proto;

public final class OfficialCustomDungeonOuterClass {
  private OfficialCustomDungeonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OfficialCustomDungeonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OfficialCustomDungeon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 12;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 win_times = 4;</code>
     * @return The winTimes.
     */
    int getWinTimes();
  }
  /**
   * <pre>
   * Name: HDLOGEKNLLN
   * </pre>
   *
   * Protobuf type {@code OfficialCustomDungeon}
   */
  public static final class OfficialCustomDungeon extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OfficialCustomDungeon)
      OfficialCustomDungeonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OfficialCustomDungeon.newBuilder() to construct.
    private OfficialCustomDungeon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OfficialCustomDungeon() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OfficialCustomDungeon();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OfficialCustomDungeon(
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
            case 32: {

              winTimes_ = input.readUInt32();
              break;
            }
            case 96: {

              dungeonId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.internal_static_OfficialCustomDungeon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.internal_static_OfficialCustomDungeon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon.class, emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 12;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 12;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int WIN_TIMES_FIELD_NUMBER = 4;
    private int winTimes_;
    /**
     * <code>uint32 win_times = 4;</code>
     * @return The winTimes.
     */
    @java.lang.Override
    public int getWinTimes() {
      return winTimes_;
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
      if (winTimes_ != 0) {
        output.writeUInt32(4, winTimes_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(12, dungeonId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (winTimes_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, winTimes_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dungeonId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon other = (emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getWinTimes()
          != other.getWinTimes()) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + WIN_TIMES_FIELD_NUMBER;
      hash = (53 * hash) + getWinTimes();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon prototype) {
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
     * Name: HDLOGEKNLLN
     * </pre>
     *
     * Protobuf type {@code OfficialCustomDungeon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OfficialCustomDungeon)
        emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.internal_static_OfficialCustomDungeon_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.internal_static_OfficialCustomDungeon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon.class, emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon.newBuilder()
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
        dungeonId_ = 0;

        winTimes_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.internal_static_OfficialCustomDungeon_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon build() {
        emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon buildPartial() {
        emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon result = new emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon(this);
        result.dungeonId_ = dungeonId_;
        result.winTimes_ = winTimes_;
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
        if (other instanceof emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon) {
          return mergeFrom((emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon other) {
        if (other == emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getWinTimes() != 0) {
          setWinTimes(other.getWinTimes());
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
        emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int winTimes_ ;
      /**
       * <code>uint32 win_times = 4;</code>
       * @return The winTimes.
       */
      @java.lang.Override
      public int getWinTimes() {
        return winTimes_;
      }
      /**
       * <code>uint32 win_times = 4;</code>
       * @param value The winTimes to set.
       * @return This builder for chaining.
       */
      public Builder setWinTimes(int value) {
        
        winTimes_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 win_times = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearWinTimes() {
        
        winTimes_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OfficialCustomDungeon)
    }

    // @@protoc_insertion_point(class_scope:OfficialCustomDungeon)
    private static final emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon();
    }

    public static emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OfficialCustomDungeon>
        PARSER = new com.google.protobuf.AbstractParser<OfficialCustomDungeon>() {
      @java.lang.Override
      public OfficialCustomDungeon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OfficialCustomDungeon(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OfficialCustomDungeon> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OfficialCustomDungeon> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OfficialCustomDungeonOuterClass.OfficialCustomDungeon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OfficialCustomDungeon_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OfficialCustomDungeon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033OfficialCustomDungeon.proto\">\n\025Officia" +
      "lCustomDungeon\022\022\n\ndungeon_id\030\014 \001(\r\022\021\n\twi" +
      "n_times\030\004 \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OfficialCustomDungeon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OfficialCustomDungeon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OfficialCustomDungeon_descriptor,
        new java.lang.String[] { "DungeonId", "WinTimes", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
