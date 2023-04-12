// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForgeQueueManipulateType.proto

package emu.grasscutter.net.proto;

public final class ForgeQueueManipulateTypeOuterClass {
  private ForgeQueueManipulateTypeOuterClass() {}
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
   * Name: EOMPENELAEF
   * </pre>
   *
   * Protobuf enum {@code ForgeQueueManipulateType}
   */
  public enum ForgeQueueManipulateType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT = 0;</code>
     */
    FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT(0),
    /**
     * <code>FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE = 1;</code>
     */
    FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT = 0;</code>
     */
    public static final int FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT_VALUE = 0;
    /**
     * <code>FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE = 1;</code>
     */
    public static final int FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE_VALUE = 1;


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
    public static ForgeQueueManipulateType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ForgeQueueManipulateType forNumber(int value) {
      switch (value) {
        case 0: return FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT;
        case 1: return FORGE_QUEUE_MANIPULATE_TYPE_STOP_FORGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ForgeQueueManipulateType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ForgeQueueManipulateType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ForgeQueueManipulateType>() {
            public ForgeQueueManipulateType findValueByNumber(int number) {
              return ForgeQueueManipulateType.forNumber(number);
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
      return emu.grasscutter.net.proto.ForgeQueueManipulateTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ForgeQueueManipulateType[] VALUES = values();

    public static ForgeQueueManipulateType valueOf(
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

    private ForgeQueueManipulateType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ForgeQueueManipulateType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036ForgeQueueManipulateType.proto*v\n\030Forg" +
      "eQueueManipulateType\022.\n*FORGE_QUEUE_MANI" +
      "PULATE_TYPE_RECEIVE_OUTPUT\020\000\022*\n&FORGE_QU" +
      "EUE_MANIPULATE_TYPE_STOP_FORGE\020\001B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
