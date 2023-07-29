package hohserg.elegant.networking.test.network;

import hohserg.elegant.networking.api.IByteBufSerializable;
import hohserg.elegant.networking.impl.IPacketProvider;
import hohserg.elegant.networking.impl.PacketProviderMark;
import java.lang.Class;
import java.lang.String;

@PacketProviderMark
public class ExamplePacket1Provider implements IPacketProvider {
  public Class<? extends IByteBufSerializable> getPacketClass() {
    return hohserg.elegant.networking.test.network.ExamplePacket1.class;
  }

  public String modid() {
    return "elegant_networking";
  }
}
