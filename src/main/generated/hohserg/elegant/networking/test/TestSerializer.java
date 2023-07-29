package hohserg.elegant.networking.test;

import hohserg.elegant.networking.impl.ISerializer;
import hohserg.elegant.networking.impl.SerializerMark;
import io.netty.buffer.ByteBuf;

@SerializerMark(
    packetClass = hohserg.elegant.networking.test.Test.class
)
public class TestSerializer implements ISerializer<Test> {
  public void serialize(Test value, ByteBuf acc) {
    serialize_Test_Generic(value, acc);
  }

  public Test unserialize(ByteBuf buf) {
    return unserialize_Test_Generic(buf);
  }

  void serialize_Test_Generic(Test value, ByteBuf acc) {
    serialize_Test_Concretic(value, acc);
  }

  Test unserialize_Test_Generic(ByteBuf buf) {
    return unserialize_Test_Concretic(buf);
  }

  void serialize_Test_Concretic(Test value, ByteBuf acc) {
    serialize_Int_Generic(value.a, acc);
    serialize_Boolean_Generic(value.lol, acc);
    serialize_Boolean_Generic(value.kek, acc);
    serialize_Boolean_Generic(value.isBruh, acc);
  }

  Test unserialize_Test_Concretic(ByteBuf buf) {
    Test value = new Test();
    value.a = unserialize_Int_Generic(buf);
    value.lol = unserialize_Boolean_Generic(buf);
    value.kek = unserialize_Boolean_Generic(buf);
    value.isBruh = unserialize_Boolean_Generic(buf);
    return value;
  }
}
