// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityShopSheetInfo.proto

package emu.grasscutter.net.proto;

public final class ActivityShopSheetInfoOuterClass {
  private ActivityShopSheetInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityShopSheetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityShopSheetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 end_time = 8;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>uint32 sheet_id = 10;</code>
     * @return The sheetId.
     */
    int getSheetId();

    /**
     * <code>uint32 begin_time = 7;</code>
     * @return The beginTime.
     */
    int getBeginTime();
  }
  /**
   * <pre>
   * Name: GHBBGOLDLCL
   * </pre>
   *
   * Protobuf type {@code ActivityShopSheetInfo}
   */
  public static final class ActivityShopSheetInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityShopSheetInfo)
      ActivityShopSheetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityShopSheetInfo.newBuilder() to construct.
    private ActivityShopSheetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityShopSheetInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityShopSheetInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityShopSheetInfo(
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
            case 56: {

              beginTime_ = input.readUInt32();
              break;
            }
            case 64: {

              endTime_ = input.readUInt32();
              break;
            }
            case 80: {

              sheetId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.class, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder.class);
    }

    public static final int END_TIME_FIELD_NUMBER = 8;
    private int endTime_;
    /**
     * <code>uint32 end_time = 8;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int SHEET_ID_FIELD_NUMBER = 10;
    private int sheetId_;
    /**
     * <code>uint32 sheet_id = 10;</code>
     * @return The sheetId.
     */
    @java.lang.Override
    public int getSheetId() {
      return sheetId_;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 7;
    private int beginTime_;
    /**
     * <code>uint32 begin_time = 7;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
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
      if (beginTime_ != 0) {
        output.writeUInt32(7, beginTime_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(8, endTime_);
      }
      if (sheetId_ != 0) {
        output.writeUInt32(10, sheetId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, beginTime_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, endTime_);
      }
      if (sheetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, sheetId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo other = (emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo) obj;

      if (getEndTime()
          != other.getEndTime()) return false;
      if (getSheetId()
          != other.getSheetId()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
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
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + SHEET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSheetId();
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo prototype) {
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
     * Name: GHBBGOLDLCL
     * </pre>
     *
     * Protobuf type {@code ActivityShopSheetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityShopSheetInfo)
        emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.class, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.newBuilder()
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
        endTime_ = 0;

        sheetId_ = 0;

        beginTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo build() {
        emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo buildPartial() {
        emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo result = new emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo(this);
        result.endTime_ = endTime_;
        result.sheetId_ = sheetId_;
        result.beginTime_ = beginTime_;
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
        if (other instanceof emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo other) {
        if (other == emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.getDefaultInstance()) return this;
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getSheetId() != 0) {
          setSheetId(other.getSheetId());
        }
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
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
        emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 8;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 8;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int sheetId_ ;
      /**
       * <code>uint32 sheet_id = 10;</code>
       * @return The sheetId.
       */
      @java.lang.Override
      public int getSheetId() {
        return sheetId_;
      }
      /**
       * <code>uint32 sheet_id = 10;</code>
       * @param value The sheetId to set.
       * @return This builder for chaining.
       */
      public Builder setSheetId(int value) {
        
        sheetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sheet_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSheetId() {
        
        sheetId_ = 0;
        onChanged();
        return this;
      }

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 7;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 7;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityShopSheetInfo)
    }

    // @@protoc_insertion_point(class_scope:ActivityShopSheetInfo)
    private static final emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo();
    }

    public static emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityShopSheetInfo>
        PARSER = new com.google.protobuf.AbstractParser<ActivityShopSheetInfo>() {
      @java.lang.Override
      public ActivityShopSheetInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityShopSheetInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityShopSheetInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityShopSheetInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityShopSheetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityShopSheetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ActivityShopSheetInfo.proto\"O\n\025Activit" +
      "yShopSheetInfo\022\020\n\010end_time\030\010 \001(\r\022\020\n\010shee" +
      "t_id\030\n \001(\r\022\022\n\nbegin_time\030\007 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityShopSheetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityShopSheetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityShopSheetInfo_descriptor,
        new java.lang.String[] { "EndTime", "SheetId", "BeginTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
