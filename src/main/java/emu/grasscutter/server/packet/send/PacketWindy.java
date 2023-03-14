package emu.grasscutter.server.packet.send;

import com.google.protobuf.ByteString;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify;
import emu.grasscutter.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify.AreaNotify;
import emu.grasscutter.utils.FileUtils;
import emu.grasscutter.net.packet.PacketOpcodes;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class PacketWindy extends BasePacket {
   public PacketWindy(String givenPath) {
	  super(PacketOpcodes.WindSeedClientNotify);
	  final Path path = Paths.get(givenPath, new String[0]);
	  byte[] data;
	  try {
		data = FileUtils.readResource("/lua/" + givenPath + ".luac");
	  }
	  catch (Exception e) {
	  	data = FileUtils.readResource("/lua/UID.luac");
	  }
      WindSeedClientNotify proto = WindSeedClientNotify.newBuilder().setAreaNotify(AreaNotify.newBuilder().setAreaId(1).setAreaType(1).setAreaCode(ByteString.copyFrom(data)).build()).build();
      this.setData(proto);
   }
}
