// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CPBMIAMDLPE.proto

package emu.grasscutter.net.proto;

public final class CPBMIAMDLPEOuterClass {
  private CPBMIAMDLPEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Name: CPBMIAMDLPE
   * </pre>
   *
   * Protobuf enum {@code CPBMIAMDLPE}
   */
  public enum CPBMIAMDLPE
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CPBMIAMDLPE_LFCBMJINCBF = 0;</code>
     */
    CPBMIAMDLPE_LFCBMJINCBF(0),
    /**
     * <code>CPBMIAMDLPE_GMAKOJPAOJC = 1;</code>
     */
    CPBMIAMDLPE_GMAKOJPAOJC(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CPBMIAMDLPE_LFCBMJINCBF = 0;</code>
     */
    public static final int CPBMIAMDLPE_LFCBMJINCBF_VALUE = 0;
    /**
     * <code>CPBMIAMDLPE_GMAKOJPAOJC = 1;</code>
     */
    public static final int CPBMIAMDLPE_GMAKOJPAOJC_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CPBMIAMDLPE valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CPBMIAMDLPE forNumber(int value) {
      switch (value) {
        case 0: return CPBMIAMDLPE_LFCBMJINCBF;
        case 1: return CPBMIAMDLPE_GMAKOJPAOJC;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CPBMIAMDLPE>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CPBMIAMDLPE> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CPBMIAMDLPE>() {
            public CPBMIAMDLPE findValueByNumber(int number) {
              return CPBMIAMDLPE.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CPBMIAMDLPEOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CPBMIAMDLPE[] VALUES = values();

    public static CPBMIAMDLPE valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CPBMIAMDLPE(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CPBMIAMDLPE)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CPBMIAMDLPE.proto*G\n\013CPBMIAMDLPE\022\033\n\027CP" +
      "BMIAMDLPE_LFCBMJINCBF\020\000\022\033\n\027CPBMIAMDLPE_G" +
      "MAKOJPAOJC\020\001B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
