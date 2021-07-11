// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_message.proto

package stubs;

public interface LaptopOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Laptop)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string brand = 2;</code>
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   * <code>string brand = 2;</code>
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.CPU cpu = 4;</code>
   * @return Whether the cpu field is set.
   */
  boolean hasCpu();
  /**
   * <code>.CPU cpu = 4;</code>
   * @return The cpu.
   */
  stubs.CPU getCpu();
  /**
   * <code>.CPU cpu = 4;</code>
   */
  stubs.CPUOrBuilder getCpuOrBuilder();

  /**
   * <code>.Memory ram = 5;</code>
   * @return Whether the ram field is set.
   */
  boolean hasRam();
  /**
   * <code>.Memory ram = 5;</code>
   * @return The ram.
   */
  stubs.Memory getRam();
  /**
   * <code>.Memory ram = 5;</code>
   */
  stubs.MemoryOrBuilder getRamOrBuilder();

  /**
   * <code>repeated .GPU gpus = 6;</code>
   */
  java.util.List<stubs.GPU> 
      getGpusList();
  /**
   * <code>repeated .GPU gpus = 6;</code>
   */
  stubs.GPU getGpus(int index);
  /**
   * <code>repeated .GPU gpus = 6;</code>
   */
  int getGpusCount();
  /**
   * <code>repeated .GPU gpus = 6;</code>
   */
  java.util.List<? extends stubs.GPUOrBuilder> 
      getGpusOrBuilderList();
  /**
   * <code>repeated .GPU gpus = 6;</code>
   */
  stubs.GPUOrBuilder getGpusOrBuilder(
      int index);

  /**
   * <code>repeated .Storage storages = 7;</code>
   */
  java.util.List<stubs.Storage> 
      getStoragesList();
  /**
   * <code>repeated .Storage storages = 7;</code>
   */
  stubs.Storage getStorages(int index);
  /**
   * <code>repeated .Storage storages = 7;</code>
   */
  int getStoragesCount();
  /**
   * <code>repeated .Storage storages = 7;</code>
   */
  java.util.List<? extends stubs.StorageOrBuilder> 
      getStoragesOrBuilderList();
  /**
   * <code>repeated .Storage storages = 7;</code>
   */
  stubs.StorageOrBuilder getStoragesOrBuilder(
      int index);

  /**
   * <code>.Screen screen = 8;</code>
   * @return Whether the screen field is set.
   */
  boolean hasScreen();
  /**
   * <code>.Screen screen = 8;</code>
   * @return The screen.
   */
  stubs.Screen getScreen();
  /**
   * <code>.Screen screen = 8;</code>
   */
  stubs.ScreenOrBuilder getScreenOrBuilder();

  /**
   * <code>.Keyboard keyboard = 9;</code>
   * @return Whether the keyboard field is set.
   */
  boolean hasKeyboard();
  /**
   * <code>.Keyboard keyboard = 9;</code>
   * @return The keyboard.
   */
  stubs.Keyboard getKeyboard();
  /**
   * <code>.Keyboard keyboard = 9;</code>
   */
  stubs.KeyboardOrBuilder getKeyboardOrBuilder();

  /**
   * <code>double weight_kg = 10;</code>
   * @return The weightKg.
   */
  double getWeightKg();

  /**
   * <code>double weight_lb = 11;</code>
   * @return The weightLb.
   */
  double getWeightLb();

  /**
   * <code>double price_usd = 12;</code>
   * @return The priceUsd.
   */
  double getPriceUsd();

  /**
   * <code>uint32 release_year = 13;</code>
   * @return The releaseYear.
   */
  int getReleaseYear();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 14;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 14;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  public stubs.Laptop.WeightCase getWeightCase();
}