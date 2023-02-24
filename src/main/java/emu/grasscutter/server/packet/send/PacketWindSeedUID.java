package emu.grasscutter.server.packet.send;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify;
import emu.grasscutter.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify.AreaNotify;
import emu.grasscutter.utils.FileUtils;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class PacketWindSeedUID extends BasePacket {
   public PacketWindSeedUID() {
	  super(1114);
	  byte[] data = FileUtils.readResource("/lua/UID.luac");
      WindSeedClientNotify proto = WindSeedClientNotify.newBuilder().setAreaNotify(AreaNotify.newBuilder().setAreaId(1).setAreaType(1).setAreaCode(ByteString.copyFrom(data)).build()).build();
      this.setData((GeneratedMessageV3)proto);
   }
}
