package hohserg.elegant.networking.test.network;

import hohserg.elegant.networking.impl.ISerializer;
import hohserg.elegant.networking.impl.SerializerMark;
import io.netty.buffer.ByteBuf;

@SerializerMark(
    packetClass = hohserg.elegant.networking.test.network.ExamplePacket2.class
)
public class ExamplePacket2Serializer implements ISerializer<ExamplePacket2> {
  public void serialize(ExamplePacket2 value, ByteBuf acc) {
    serialize_ExamplePacket2_Generic(value, acc);
  }

  public ExamplePacket2 unserialize(ByteBuf buf) {
    return unserialize_ExamplePacket2_Generic(buf);
  }

  void serialize_ExamplePacket2_Generic(ExamplePacket2 value, ByteBuf acc) {
    serialize_ExamplePacket2_Concretic(value, acc);
  }

  ExamplePacket2 unserialize_ExamplePacket2_Generic(ByteBuf buf) {
    return unserialize_ExamplePacket2_Concretic(buf);
  }

  void serialize_ExamplePacket2_Concretic(ExamplePacket2 value, ByteBuf acc) {
    serialize_Int_Generic(value.randomInt, acc);
  }

  ExamplePacket2 unserialize_ExamplePacket2_Concretic(ByteBuf buf) {
    ExamplePacket2 value = new ExamplePacket2(unserialize_Int_Generic(buf));
    return value;
  }
}
