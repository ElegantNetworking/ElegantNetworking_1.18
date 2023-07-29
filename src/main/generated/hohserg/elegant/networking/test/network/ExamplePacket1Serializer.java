package hohserg.elegant.networking.test.network;

import hohserg.elegant.networking.impl.ISerializer;
import hohserg.elegant.networking.impl.SerializerMark;
import io.netty.buffer.ByteBuf;

@SerializerMark(
    packetClass = hohserg.elegant.networking.test.network.ExamplePacket1.class
)
public class ExamplePacket1Serializer implements ISerializer<ExamplePacket1> {
  public void serialize(ExamplePacket1 value, ByteBuf acc) {
    serialize_ExamplePacket1_Generic(value, acc);
  }

  public ExamplePacket1 unserialize(ByteBuf buf) {
    return unserialize_ExamplePacket1_Generic(buf);
  }

  void serialize_ExamplePacket1_Generic(ExamplePacket1 value, ByteBuf acc) {
    serialize_ExamplePacket1_Concretic(value, acc);
  }

  ExamplePacket1 unserialize_ExamplePacket1_Generic(ByteBuf buf) {
    return unserialize_ExamplePacket1_Concretic(buf);
  }

  void serialize_ExamplePacket1_Concretic(ExamplePacket1 value, ByteBuf acc) {
    serialize_Int_Generic(value.keyCode, acc);
  }

  ExamplePacket1 unserialize_ExamplePacket1_Concretic(ByteBuf buf) {
    ExamplePacket1 value = new ExamplePacket1(unserialize_Int_Generic(buf));
    return value;
  }
}
