// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage_message.proto

package stubs;

public final class StorageMessage {
  private StorageMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Storage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Storage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025storage_message.proto\032\024memory_massage." +
      "proto\"l\n\007Storage\022\037\n\006driver\030\001 \001(\0162\017.Stora" +
      "ge.Driver\022\027\n\006memory\030\002 \001(\0132\007.Memory\"\'\n\006Dr" +
      "iver\022\013\n\007UNKNOWN\020\000\022\007\n\003HDD\020\001\022\007\n\003SSD\020\002B\t\n\005s" +
      "tubsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          stubs.MemoryMassage.getDescriptor(),
        });
    internal_static_Storage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Storage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Storage_descriptor,
        new java.lang.String[] { "Driver", "Memory", });
    stubs.MemoryMassage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
