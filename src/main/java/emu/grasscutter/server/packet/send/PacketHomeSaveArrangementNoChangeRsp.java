package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass;

public class PacketHomeSaveArrangementNoChangeRsp extends BasePacket {
    public PacketHomeSaveArrangementNoChangeRsp(int sceneId) {
        super(PacketOpcodes.HomeSaveArrangementNoChangeRsp);

        this.setData(HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp.newBuilder()
            .setSceneId(sceneId));
    }
}
