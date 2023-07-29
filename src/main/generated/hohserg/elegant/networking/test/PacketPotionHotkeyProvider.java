package hohserg.elegant.networking.test;

import hohserg.elegant.networking.api.IByteBufSerializable;
import hohserg.elegant.networking.impl.IPacketProvider;
import hohserg.elegant.networking.impl.PacketProviderMark;
import java.lang.Class;
import java.lang.String;

@PacketProviderMark
public class PacketPotionHotkeyProvider implements IPacketProvider {
  public Class<? extends IByteBufSerializable> getPacketClass() {
    return hohserg.elegant.networking.test.PacketPotionHotkey.class;
  }

  public String modid() {
    return "elegant_networking";
  }
}
