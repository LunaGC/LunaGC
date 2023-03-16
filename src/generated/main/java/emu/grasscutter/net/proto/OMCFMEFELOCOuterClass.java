// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OMCFMEFELOC.proto

package emu.grasscutter.net.proto;

public final class OMCFMEFELOCOuterClass {
  private OMCFMEFELOCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OMCFMEFELOCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OMCFMEFELOC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 fungus_id = 7;</code>
     * @return The fungusId.
     */
    int getFungusId();

    /**
     * <code>uint32 MCMBFGDNCCG = 2;</code>
     * @return The mCMBFGDNCCG.
     */
    int getMCMBFGDNCCG();

    /**
     * <code>uint32 HNEHJAHLJAK = 8;</code>
     * @return The hNEHJAHLJAK.
     */
    int getHNEHJAHLJAK();

    /**
     * <code>bool BBDIAJGJJMI = 4;</code>
     * @return The bBDIAJGJJMI.
     */
    boolean getBBDIAJGJJMI();

    /**
     * <code>uint32 name_id = 13;</code>
     * @return The nameId.
     */
    int getNameId();
  }
  /**
   * <pre>
   * Name: OMCFMEFELOC
   * </pre>
   *
   * Protobuf type {@code OMCFMEFELOC}
   */
  public static final class OMCFMEFELOC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OMCFMEFELOC)
      OMCFMEFELOCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OMCFMEFELOC.newBuilder() to construct.
    private OMCFMEFELOC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OMCFMEFELOC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OMCFMEFELOC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OMCFMEFELOC(
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
            case 16: {

              mCMBFGDNCCG_ = input.readUInt32();
              break;
            }
            case 32: {

              bBDIAJGJJMI_ = input.readBool();
              break;
            }
            case 56: {

              fungusId_ = input.readUInt32();
              break;
            }
            case 64: {

              hNEHJAHLJAK_ = input.readUInt32();
              break;
            }
            case 104: {

              nameId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.internal_static_OMCFMEFELOC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.internal_static_OMCFMEFELOC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC.class, emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC.Builder.class);
    }

    public static final int FUNGUS_ID_FIELD_NUMBER = 7;
    private int fungusId_;
    /**
     * <code>uint32 fungus_id = 7;</code>
     * @return The fungusId.
     */
    @java.lang.Override
    public int getFungusId() {
      return fungusId_;
    }

    public static final int MCMBFGDNCCG_FIELD_NUMBER = 2;
    private int mCMBFGDNCCG_;
    /**
     * <code>uint32 MCMBFGDNCCG = 2;</code>
     * @return The mCMBFGDNCCG.
     */
    @java.lang.Override
    public int getMCMBFGDNCCG() {
      return mCMBFGDNCCG_;
    }

    public static final int HNEHJAHLJAK_FIELD_NUMBER = 8;
    private int hNEHJAHLJAK_;
    /**
     * <code>uint32 HNEHJAHLJAK = 8;</code>
     * @return The hNEHJAHLJAK.
     */
    @java.lang.Override
    public int getHNEHJAHLJAK() {
      return hNEHJAHLJAK_;
    }

    public static final int BBDIAJGJJMI_FIELD_NUMBER = 4;
    private boolean bBDIAJGJJMI_;
    /**
     * <code>bool BBDIAJGJJMI = 4;</code>
     * @return The bBDIAJGJJMI.
     */
    @java.lang.Override
    public boolean getBBDIAJGJJMI() {
      return bBDIAJGJJMI_;
    }

    public static final int NAME_ID_FIELD_NUMBER = 13;
    private int nameId_;
    /**
     * <code>uint32 name_id = 13;</code>
     * @return The nameId.
     */
    @java.lang.Override
    public int getNameId() {
      return nameId_;
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
      if (mCMBFGDNCCG_ != 0) {
        output.writeUInt32(2, mCMBFGDNCCG_);
      }
      if (bBDIAJGJJMI_ != false) {
        output.writeBool(4, bBDIAJGJJMI_);
      }
      if (fungusId_ != 0) {
        output.writeUInt32(7, fungusId_);
      }
      if (hNEHJAHLJAK_ != 0) {
        output.writeUInt32(8, hNEHJAHLJAK_);
      }
      if (nameId_ != 0) {
        output.writeUInt32(13, nameId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mCMBFGDNCCG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, mCMBFGDNCCG_);
      }
      if (bBDIAJGJJMI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, bBDIAJGJJMI_);
      }
      if (fungusId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, fungusId_);
      }
      if (hNEHJAHLJAK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, hNEHJAHLJAK_);
      }
      if (nameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, nameId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC other = (emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC) obj;

      if (getFungusId()
          != other.getFungusId()) return false;
      if (getMCMBFGDNCCG()
          != other.getMCMBFGDNCCG()) return false;
      if (getHNEHJAHLJAK()
          != other.getHNEHJAHLJAK()) return false;
      if (getBBDIAJGJJMI()
          != other.getBBDIAJGJJMI()) return false;
      if (getNameId()
          != other.getNameId()) return false;
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
      hash = (37 * hash) + FUNGUS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFungusId();
      hash = (37 * hash) + MCMBFGDNCCG_FIELD_NUMBER;
      hash = (53 * hash) + getMCMBFGDNCCG();
      hash = (37 * hash) + HNEHJAHLJAK_FIELD_NUMBER;
      hash = (53 * hash) + getHNEHJAHLJAK();
      hash = (37 * hash) + BBDIAJGJJMI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBBDIAJGJJMI());
      hash = (37 * hash) + NAME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNameId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC prototype) {
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
     * Name: OMCFMEFELOC
     * </pre>
     *
     * Protobuf type {@code OMCFMEFELOC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OMCFMEFELOC)
        emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.internal_static_OMCFMEFELOC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.internal_static_OMCFMEFELOC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC.class, emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC.newBuilder()
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
        fungusId_ = 0;

        mCMBFGDNCCG_ = 0;

        hNEHJAHLJAK_ = 0;

        bBDIAJGJJMI_ = false;

        nameId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.internal_static_OMCFMEFELOC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC build() {
        emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC buildPartial() {
        emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC result = new emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC(this);
        result.fungusId_ = fungusId_;
        result.mCMBFGDNCCG_ = mCMBFGDNCCG_;
        result.hNEHJAHLJAK_ = hNEHJAHLJAK_;
        result.bBDIAJGJJMI_ = bBDIAJGJJMI_;
        result.nameId_ = nameId_;
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
        if (other instanceof emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC) {
          return mergeFrom((emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC other) {
        if (other == emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC.getDefaultInstance()) return this;
        if (other.getFungusId() != 0) {
          setFungusId(other.getFungusId());
        }
        if (other.getMCMBFGDNCCG() != 0) {
          setMCMBFGDNCCG(other.getMCMBFGDNCCG());
        }
        if (other.getHNEHJAHLJAK() != 0) {
          setHNEHJAHLJAK(other.getHNEHJAHLJAK());
        }
        if (other.getBBDIAJGJJMI() != false) {
          setBBDIAJGJJMI(other.getBBDIAJGJJMI());
        }
        if (other.getNameId() != 0) {
          setNameId(other.getNameId());
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
        emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int fungusId_ ;
      /**
       * <code>uint32 fungus_id = 7;</code>
       * @return The fungusId.
       */
      @java.lang.Override
      public int getFungusId() {
        return fungusId_;
      }
      /**
       * <code>uint32 fungus_id = 7;</code>
       * @param value The fungusId to set.
       * @return This builder for chaining.
       */
      public Builder setFungusId(int value) {
        
        fungusId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fungus_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusId() {
        
        fungusId_ = 0;
        onChanged();
        return this;
      }

      private int mCMBFGDNCCG_ ;
      /**
       * <code>uint32 MCMBFGDNCCG = 2;</code>
       * @return The mCMBFGDNCCG.
       */
      @java.lang.Override
      public int getMCMBFGDNCCG() {
        return mCMBFGDNCCG_;
      }
      /**
       * <code>uint32 MCMBFGDNCCG = 2;</code>
       * @param value The mCMBFGDNCCG to set.
       * @return This builder for chaining.
       */
      public Builder setMCMBFGDNCCG(int value) {
        
        mCMBFGDNCCG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MCMBFGDNCCG = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMCMBFGDNCCG() {
        
        mCMBFGDNCCG_ = 0;
        onChanged();
        return this;
      }

      private int hNEHJAHLJAK_ ;
      /**
       * <code>uint32 HNEHJAHLJAK = 8;</code>
       * @return The hNEHJAHLJAK.
       */
      @java.lang.Override
      public int getHNEHJAHLJAK() {
        return hNEHJAHLJAK_;
      }
      /**
       * <code>uint32 HNEHJAHLJAK = 8;</code>
       * @param value The hNEHJAHLJAK to set.
       * @return This builder for chaining.
       */
      public Builder setHNEHJAHLJAK(int value) {
        
        hNEHJAHLJAK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HNEHJAHLJAK = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearHNEHJAHLJAK() {
        
        hNEHJAHLJAK_ = 0;
        onChanged();
        return this;
      }

      private boolean bBDIAJGJJMI_ ;
      /**
       * <code>bool BBDIAJGJJMI = 4;</code>
       * @return The bBDIAJGJJMI.
       */
      @java.lang.Override
      public boolean getBBDIAJGJJMI() {
        return bBDIAJGJJMI_;
      }
      /**
       * <code>bool BBDIAJGJJMI = 4;</code>
       * @param value The bBDIAJGJJMI to set.
       * @return This builder for chaining.
       */
      public Builder setBBDIAJGJJMI(boolean value) {
        
        bBDIAJGJJMI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool BBDIAJGJJMI = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBBDIAJGJJMI() {
        
        bBDIAJGJJMI_ = false;
        onChanged();
        return this;
      }

      private int nameId_ ;
      /**
       * <code>uint32 name_id = 13;</code>
       * @return The nameId.
       */
      @java.lang.Override
      public int getNameId() {
        return nameId_;
      }
      /**
       * <code>uint32 name_id = 13;</code>
       * @param value The nameId to set.
       * @return This builder for chaining.
       */
      public Builder setNameId(int value) {
        
        nameId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 name_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearNameId() {
        
        nameId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OMCFMEFELOC)
    }

    // @@protoc_insertion_point(class_scope:OMCFMEFELOC)
    private static final emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC();
    }

    public static emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OMCFMEFELOC>
        PARSER = new com.google.protobuf.AbstractParser<OMCFMEFELOC>() {
      @java.lang.Override
      public OMCFMEFELOC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OMCFMEFELOC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OMCFMEFELOC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OMCFMEFELOC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OMCFMEFELOCOuterClass.OMCFMEFELOC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OMCFMEFELOC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OMCFMEFELOC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OMCFMEFELOC.proto\"p\n\013OMCFMEFELOC\022\021\n\tfu" +
      "ngus_id\030\007 \001(\r\022\023\n\013MCMBFGDNCCG\030\002 \001(\r\022\023\n\013HN" +
      "EHJAHLJAK\030\010 \001(\r\022\023\n\013BBDIAJGJJMI\030\004 \001(\010\022\017\n\007" +
      "name_id\030\r \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OMCFMEFELOC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OMCFMEFELOC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OMCFMEFELOC_descriptor,
        new java.lang.String[] { "FungusId", "MCMBFGDNCCG", "HNEHJAHLJAK", "BBDIAJGJJMI", "NameId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
