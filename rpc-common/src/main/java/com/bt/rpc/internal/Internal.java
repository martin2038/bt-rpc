// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal.proto

package com.bt.rpc.internal;

public final class Internal {
  private Internal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bt_rpc_internal_InputProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bt_rpc_internal_InputProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bt_rpc_internal_OutputProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bt_rpc_internal_OutputProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016internal.proto\022\023com.bt.rpc.internal\"^\n" +
      "\nInputProto\022*\n\001e\030\001 \001(\0162\037.com.bt.rpc.inte" +
      "rnal.SerialEnum\022\016\n\004utf8\030\002 \001(\tH\000\022\014\n\002bs\030\003 " +
      "\001(\014H\000B\006\n\004data\"I\n\013OutputProto\022\t\n\001c\030\001 \001(\005\022" +
      "\t\n\001m\030\002 \001(\t\022\016\n\004utf8\030\003 \001(\tH\000\022\014\n\002bs\030\004 \001(\014H\000" +
      "B\006\n\004data*D\n\nSerialEnum\022\010\n\004JSON\020\000\022\013\n\007HESS" +
      "IAN\020\001\022\014\n\010MSG_PACK\020\002\022\010\n\004KRYO\020\003\022\007\n\003PSR\020\004B-" +
      "\n\023com.bt.rpc.internalP\001\252\002\023Com.Bt.Rpc.Int" +
      "ernalb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_bt_rpc_internal_InputProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_bt_rpc_internal_InputProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bt_rpc_internal_InputProto_descriptor,
        new String[] { "E", "Utf8", "Bs", "Data", });
    internal_static_com_bt_rpc_internal_OutputProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_bt_rpc_internal_OutputProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bt_rpc_internal_OutputProto_descriptor,
        new String[] { "C", "M", "Utf8", "Bs", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
