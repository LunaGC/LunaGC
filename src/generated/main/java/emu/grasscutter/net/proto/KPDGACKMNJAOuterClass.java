// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KPDGACKMNJA.proto

package emu.grasscutter.net.proto;

public final class KPDGACKMNJAOuterClass {
  private KPDGACKMNJAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KPDGACKMNJAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KPDGACKMNJA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float OGEJIAIJMDB = 14;</code>
     * @return The oGEJIAIJMDB.
     */
    float getOGEJIAIJMDB();

    /**
     * <code>float AKLACKOIKOE = 7;</code>
     * @return The aKLACKOIKOE.
     */
    float getAKLACKOIKOE();

    /**
     * <code>uint32 NCIHLNFLAAF = 10;</code>
     * @return The nCIHLNFLAAF.
     */
    int getNCIHLNFLAAF();

    /**
     * <code>float PFNLKOMLOIO = 4;</code>
     * @return The pFNLKOMLOIO.
     */
    float getPFNLKOMLOIO();

    /**
     * <code>float JLEGJBGOHHP = 2;</code>
     * @return The jLEGJBGOHHP.
     */
    float getJLEGJBGOHHP();

    /**
     * <code>uint32 LDDDDFHEMBA = 3;</code>
     * @return The lDDDDFHEMBA.
     */
    int getLDDDDFHEMBA();
  }
  /**
   * <pre>
   * Name: KPDGACKMNJA
   * </pre>
   *
   * Protobuf type {@code KPDGACKMNJA}
   */
  public static final class KPDGACKMNJA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KPDGACKMNJA)
      KPDGACKMNJAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KPDGACKMNJA.newBuilder() to construct.
    private KPDGACKMNJA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KPDGACKMNJA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KPDGACKMNJA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KPDGACKMNJA(
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
            case 21: {

              jLEGJBGOHHP_ = input.readFloat();
              break;
            }
            case 24: {

              lDDDDFHEMBA_ = input.readUInt32();
              break;
            }
            case 37: {

              pFNLKOMLOIO_ = input.readFloat();
              break;
            }
            case 61: {

              aKLACKOIKOE_ = input.readFloat();
              break;
            }
            case 80: {

              nCIHLNFLAAF_ = input.readUInt32();
              break;
            }
            case 117: {

              oGEJIAIJMDB_ = input.readFloat();
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
      return emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.internal_static_KPDGACKMNJA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.internal_static_KPDGACKMNJA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA.class, emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA.Builder.class);
    }

    public static final int OGEJIAIJMDB_FIELD_NUMBER = 14;
    private float oGEJIAIJMDB_;
    /**
     * <code>float OGEJIAIJMDB = 14;</code>
     * @return The oGEJIAIJMDB.
     */
    @java.lang.Override
    public float getOGEJIAIJMDB() {
      return oGEJIAIJMDB_;
    }

    public static final int AKLACKOIKOE_FIELD_NUMBER = 7;
    private float aKLACKOIKOE_;
    /**
     * <code>float AKLACKOIKOE = 7;</code>
     * @return The aKLACKOIKOE.
     */
    @java.lang.Override
    public float getAKLACKOIKOE() {
      return aKLACKOIKOE_;
    }

    public static final int NCIHLNFLAAF_FIELD_NUMBER = 10;
    private int nCIHLNFLAAF_;
    /**
     * <code>uint32 NCIHLNFLAAF = 10;</code>
     * @return The nCIHLNFLAAF.
     */
    @java.lang.Override
    public int getNCIHLNFLAAF() {
      return nCIHLNFLAAF_;
    }

    public static final int PFNLKOMLOIO_FIELD_NUMBER = 4;
    private float pFNLKOMLOIO_;
    /**
     * <code>float PFNLKOMLOIO = 4;</code>
     * @return The pFNLKOMLOIO.
     */
    @java.lang.Override
    public float getPFNLKOMLOIO() {
      return pFNLKOMLOIO_;
    }

    public static final int JLEGJBGOHHP_FIELD_NUMBER = 2;
    private float jLEGJBGOHHP_;
    /**
     * <code>float JLEGJBGOHHP = 2;</code>
     * @return The jLEGJBGOHHP.
     */
    @java.lang.Override
    public float getJLEGJBGOHHP() {
      return jLEGJBGOHHP_;
    }

    public static final int LDDDDFHEMBA_FIELD_NUMBER = 3;
    private int lDDDDFHEMBA_;
    /**
     * <code>uint32 LDDDDFHEMBA = 3;</code>
     * @return The lDDDDFHEMBA.
     */
    @java.lang.Override
    public int getLDDDDFHEMBA() {
      return lDDDDFHEMBA_;
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
      if (jLEGJBGOHHP_ != 0F) {
        output.writeFloat(2, jLEGJBGOHHP_);
      }
      if (lDDDDFHEMBA_ != 0) {
        output.writeUInt32(3, lDDDDFHEMBA_);
      }
      if (pFNLKOMLOIO_ != 0F) {
        output.writeFloat(4, pFNLKOMLOIO_);
      }
      if (aKLACKOIKOE_ != 0F) {
        output.writeFloat(7, aKLACKOIKOE_);
      }
      if (nCIHLNFLAAF_ != 0) {
        output.writeUInt32(10, nCIHLNFLAAF_);
      }
      if (oGEJIAIJMDB_ != 0F) {
        output.writeFloat(14, oGEJIAIJMDB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jLEGJBGOHHP_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, jLEGJBGOHHP_);
      }
      if (lDDDDFHEMBA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, lDDDDFHEMBA_);
      }
      if (pFNLKOMLOIO_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, pFNLKOMLOIO_);
      }
      if (aKLACKOIKOE_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, aKLACKOIKOE_);
      }
      if (nCIHLNFLAAF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, nCIHLNFLAAF_);
      }
      if (oGEJIAIJMDB_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(14, oGEJIAIJMDB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA other = (emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA) obj;

      if (java.lang.Float.floatToIntBits(getOGEJIAIJMDB())
          != java.lang.Float.floatToIntBits(
              other.getOGEJIAIJMDB())) return false;
      if (java.lang.Float.floatToIntBits(getAKLACKOIKOE())
          != java.lang.Float.floatToIntBits(
              other.getAKLACKOIKOE())) return false;
      if (getNCIHLNFLAAF()
          != other.getNCIHLNFLAAF()) return false;
      if (java.lang.Float.floatToIntBits(getPFNLKOMLOIO())
          != java.lang.Float.floatToIntBits(
              other.getPFNLKOMLOIO())) return false;
      if (java.lang.Float.floatToIntBits(getJLEGJBGOHHP())
          != java.lang.Float.floatToIntBits(
              other.getJLEGJBGOHHP())) return false;
      if (getLDDDDFHEMBA()
          != other.getLDDDDFHEMBA()) return false;
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
      hash = (37 * hash) + OGEJIAIJMDB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getOGEJIAIJMDB());
      hash = (37 * hash) + AKLACKOIKOE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAKLACKOIKOE());
      hash = (37 * hash) + NCIHLNFLAAF_FIELD_NUMBER;
      hash = (53 * hash) + getNCIHLNFLAAF();
      hash = (37 * hash) + PFNLKOMLOIO_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getPFNLKOMLOIO());
      hash = (37 * hash) + JLEGJBGOHHP_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getJLEGJBGOHHP());
      hash = (37 * hash) + LDDDDFHEMBA_FIELD_NUMBER;
      hash = (53 * hash) + getLDDDDFHEMBA();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA prototype) {
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
     * Name: KPDGACKMNJA
     * </pre>
     *
     * Protobuf type {@code KPDGACKMNJA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KPDGACKMNJA)
        emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.internal_static_KPDGACKMNJA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.internal_static_KPDGACKMNJA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA.class, emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA.newBuilder()
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
        oGEJIAIJMDB_ = 0F;

        aKLACKOIKOE_ = 0F;

        nCIHLNFLAAF_ = 0;

        pFNLKOMLOIO_ = 0F;

        jLEGJBGOHHP_ = 0F;

        lDDDDFHEMBA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.internal_static_KPDGACKMNJA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA build() {
        emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA buildPartial() {
        emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA result = new emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA(this);
        result.oGEJIAIJMDB_ = oGEJIAIJMDB_;
        result.aKLACKOIKOE_ = aKLACKOIKOE_;
        result.nCIHLNFLAAF_ = nCIHLNFLAAF_;
        result.pFNLKOMLOIO_ = pFNLKOMLOIO_;
        result.jLEGJBGOHHP_ = jLEGJBGOHHP_;
        result.lDDDDFHEMBA_ = lDDDDFHEMBA_;
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
        if (other instanceof emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA) {
          return mergeFrom((emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA other) {
        if (other == emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA.getDefaultInstance()) return this;
        if (other.getOGEJIAIJMDB() != 0F) {
          setOGEJIAIJMDB(other.getOGEJIAIJMDB());
        }
        if (other.getAKLACKOIKOE() != 0F) {
          setAKLACKOIKOE(other.getAKLACKOIKOE());
        }
        if (other.getNCIHLNFLAAF() != 0) {
          setNCIHLNFLAAF(other.getNCIHLNFLAAF());
        }
        if (other.getPFNLKOMLOIO() != 0F) {
          setPFNLKOMLOIO(other.getPFNLKOMLOIO());
        }
        if (other.getJLEGJBGOHHP() != 0F) {
          setJLEGJBGOHHP(other.getJLEGJBGOHHP());
        }
        if (other.getLDDDDFHEMBA() != 0) {
          setLDDDDFHEMBA(other.getLDDDDFHEMBA());
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
        emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float oGEJIAIJMDB_ ;
      /**
       * <code>float OGEJIAIJMDB = 14;</code>
       * @return The oGEJIAIJMDB.
       */
      @java.lang.Override
      public float getOGEJIAIJMDB() {
        return oGEJIAIJMDB_;
      }
      /**
       * <code>float OGEJIAIJMDB = 14;</code>
       * @param value The oGEJIAIJMDB to set.
       * @return This builder for chaining.
       */
      public Builder setOGEJIAIJMDB(float value) {
        
        oGEJIAIJMDB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float OGEJIAIJMDB = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearOGEJIAIJMDB() {
        
        oGEJIAIJMDB_ = 0F;
        onChanged();
        return this;
      }

      private float aKLACKOIKOE_ ;
      /**
       * <code>float AKLACKOIKOE = 7;</code>
       * @return The aKLACKOIKOE.
       */
      @java.lang.Override
      public float getAKLACKOIKOE() {
        return aKLACKOIKOE_;
      }
      /**
       * <code>float AKLACKOIKOE = 7;</code>
       * @param value The aKLACKOIKOE to set.
       * @return This builder for chaining.
       */
      public Builder setAKLACKOIKOE(float value) {
        
        aKLACKOIKOE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float AKLACKOIKOE = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAKLACKOIKOE() {
        
        aKLACKOIKOE_ = 0F;
        onChanged();
        return this;
      }

      private int nCIHLNFLAAF_ ;
      /**
       * <code>uint32 NCIHLNFLAAF = 10;</code>
       * @return The nCIHLNFLAAF.
       */
      @java.lang.Override
      public int getNCIHLNFLAAF() {
        return nCIHLNFLAAF_;
      }
      /**
       * <code>uint32 NCIHLNFLAAF = 10;</code>
       * @param value The nCIHLNFLAAF to set.
       * @return This builder for chaining.
       */
      public Builder setNCIHLNFLAAF(int value) {
        
        nCIHLNFLAAF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NCIHLNFLAAF = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearNCIHLNFLAAF() {
        
        nCIHLNFLAAF_ = 0;
        onChanged();
        return this;
      }

      private float pFNLKOMLOIO_ ;
      /**
       * <code>float PFNLKOMLOIO = 4;</code>
       * @return The pFNLKOMLOIO.
       */
      @java.lang.Override
      public float getPFNLKOMLOIO() {
        return pFNLKOMLOIO_;
      }
      /**
       * <code>float PFNLKOMLOIO = 4;</code>
       * @param value The pFNLKOMLOIO to set.
       * @return This builder for chaining.
       */
      public Builder setPFNLKOMLOIO(float value) {
        
        pFNLKOMLOIO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float PFNLKOMLOIO = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPFNLKOMLOIO() {
        
        pFNLKOMLOIO_ = 0F;
        onChanged();
        return this;
      }

      private float jLEGJBGOHHP_ ;
      /**
       * <code>float JLEGJBGOHHP = 2;</code>
       * @return The jLEGJBGOHHP.
       */
      @java.lang.Override
      public float getJLEGJBGOHHP() {
        return jLEGJBGOHHP_;
      }
      /**
       * <code>float JLEGJBGOHHP = 2;</code>
       * @param value The jLEGJBGOHHP to set.
       * @return This builder for chaining.
       */
      public Builder setJLEGJBGOHHP(float value) {
        
        jLEGJBGOHHP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float JLEGJBGOHHP = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearJLEGJBGOHHP() {
        
        jLEGJBGOHHP_ = 0F;
        onChanged();
        return this;
      }

      private int lDDDDFHEMBA_ ;
      /**
       * <code>uint32 LDDDDFHEMBA = 3;</code>
       * @return The lDDDDFHEMBA.
       */
      @java.lang.Override
      public int getLDDDDFHEMBA() {
        return lDDDDFHEMBA_;
      }
      /**
       * <code>uint32 LDDDDFHEMBA = 3;</code>
       * @param value The lDDDDFHEMBA to set.
       * @return This builder for chaining.
       */
      public Builder setLDDDDFHEMBA(int value) {
        
        lDDDDFHEMBA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LDDDDFHEMBA = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLDDDDFHEMBA() {
        
        lDDDDFHEMBA_ = 0;
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


      // @@protoc_insertion_point(builder_scope:KPDGACKMNJA)
    }

    // @@protoc_insertion_point(class_scope:KPDGACKMNJA)
    private static final emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA();
    }

    public static emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KPDGACKMNJA>
        PARSER = new com.google.protobuf.AbstractParser<KPDGACKMNJA>() {
      @java.lang.Override
      public KPDGACKMNJA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KPDGACKMNJA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KPDGACKMNJA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KPDGACKMNJA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.KPDGACKMNJAOuterClass.KPDGACKMNJA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KPDGACKMNJA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KPDGACKMNJA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KPDGACKMNJA.proto\"\213\001\n\013KPDGACKMNJA\022\023\n\013O" +
      "GEJIAIJMDB\030\016 \001(\002\022\023\n\013AKLACKOIKOE\030\007 \001(\002\022\023\n" +
      "\013NCIHLNFLAAF\030\n \001(\r\022\023\n\013PFNLKOMLOIO\030\004 \001(\002\022" +
      "\023\n\013JLEGJBGOHHP\030\002 \001(\002\022\023\n\013LDDDDFHEMBA\030\003 \001(" +
      "\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KPDGACKMNJA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KPDGACKMNJA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KPDGACKMNJA_descriptor,
        new java.lang.String[] { "OGEJIAIJMDB", "AKLACKOIKOE", "NCIHLNFLAAF", "PFNLKOMLOIO", "JLEGJBGOHHP", "LDDDDFHEMBA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
