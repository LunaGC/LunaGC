// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSkillHpChangeType.proto

package emu.grasscutter.net.proto;

public final class GCGSkillHpChangeTypeOuterClass {
  private GCGSkillHpChangeTypeOuterClass() {}
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
   * Obf: EIJGIMEOODA
   * </pre>
   *
   * Protobuf enum {@code GCGSkillHpChangeType}
   */
  public enum GCGSkillHpChangeType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GCG_SKILL_HP_CHANGE_NONE = 0;</code>
     */
    GCG_SKILL_HP_CHANGE_NONE(0),
    /**
     * <code>GCG_SKILL_HP_CHANGE_DAMAGE = 1;</code>
     */
    GCG_SKILL_HP_CHANGE_DAMAGE(1),
    /**
     * <code>GCG_SKILL_HP_CHANGE_HEAL = 2;</code>
     */
    GCG_SKILL_HP_CHANGE_HEAL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GCG_SKILL_HP_CHANGE_NONE = 0;</code>
     */
    public static final int GCG_SKILL_HP_CHANGE_NONE_VALUE = 0;
    /**
     * <code>GCG_SKILL_HP_CHANGE_DAMAGE = 1;</code>
     */
    public static final int GCG_SKILL_HP_CHANGE_DAMAGE_VALUE = 1;
    /**
     * <code>GCG_SKILL_HP_CHANGE_HEAL = 2;</code>
     */
    public static final int GCG_SKILL_HP_CHANGE_HEAL_VALUE = 2;


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
    public static GCGSkillHpChangeType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GCGSkillHpChangeType forNumber(int value) {
      switch (value) {
        case 0: return GCG_SKILL_HP_CHANGE_NONE;
        case 1: return GCG_SKILL_HP_CHANGE_DAMAGE;
        case 2: return GCG_SKILL_HP_CHANGE_HEAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GCGSkillHpChangeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GCGSkillHpChangeType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCGSkillHpChangeType>() {
            public GCGSkillHpChangeType findValueByNumber(int number) {
              return GCGSkillHpChangeType.forNumber(number);
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
      return emu.grasscutter.net.proto.GCGSkillHpChangeTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GCGSkillHpChangeType[] VALUES = values();

    public static GCGSkillHpChangeType valueOf(
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

    private GCGSkillHpChangeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GCGSkillHpChangeType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGSkillHpChangeType.proto*r\n\024GCGSkill" +
      "HpChangeType\022\034\n\030GCG_SKILL_HP_CHANGE_NONE" +
      "\020\000\022\036\n\032GCG_SKILL_HP_CHANGE_DAMAGE\020\001\022\034\n\030GC" +
      "G_SKILL_HP_CHANGE_HEAL\020\002B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
