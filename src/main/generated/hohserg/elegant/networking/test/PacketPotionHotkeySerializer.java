package hohserg.elegant.networking.test;

import hohserg.elegant.networking.impl.ISerializer;
import hohserg.elegant.networking.impl.SerializerMark;
import io.netty.buffer.ByteBuf;

@SerializerMark(
    packetClass = hohserg.elegant.networking.test.PacketPotionHotkey.class
)
public class PacketPotionHotkeySerializer implements ISerializer<PacketPotionHotkey> {
  public void serialize(PacketPotionHotkey value, ByteBuf acc) {
    serialize_PacketPotionHotkey_Generic(value, acc);
  }

  public PacketPotionHotkey unserialize(ByteBuf buf) {
    return unserialize_PacketPotionHotkey_Generic(buf);
  }

  void serialize_PacketPotionHotkey_Generic(PacketPotionHotkey value, ByteBuf acc) {
    serialize_PacketPotionHotkey_Concretic(value, acc);
  }

  PacketPotionHotkey unserialize_PacketPotionHotkey_Generic(ByteBuf buf) {
    return unserialize_PacketPotionHotkey_Concretic(buf);
  }

  void serialize_PacketPotionHotkey_Concretic(PacketPotionHotkey value, ByteBuf acc) {
    serialize_Int_Generic(value.getPotionHotSlot(), acc);
  }

  PacketPotionHotkey unserialize_PacketPotionHotkey_Concretic(ByteBuf buf) {
    PacketPotionHotkey value = new PacketPotionHotkey(unserialize_Int_Generic(buf));
    return value;
  }
}
