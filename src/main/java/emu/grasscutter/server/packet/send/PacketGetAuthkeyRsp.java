package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.GetAuthkeyReqOuterClass;
import emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp;
import emu.grasscutter.net.proto.RetcodeOuterClass;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class PacketGetAuthkeyRsp extends BasePacket {

    public PacketGetAuthkeyRsp() {
        super(PacketOpcodes.GetAuthkeyRsp);

        GetAuthkeyRsp proto = GetAuthkeyRsp.newBuilder().setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE).build();

        this.setData(proto);
    }

    public PacketGetAuthkeyRsp(GetAuthkeyReqOuterClass.GetAuthkeyReq req) {
        super(PacketOpcodes.GetAuthkeyRsp);

        var rsp = GetAuthkeyRsp.newBuilder()
            .setBILPDHGPPPO(req.getBILPDHGPPPO())
            .setAuthkey(Base64.getEncoder().encodeToString("May I have seggs with you?".getBytes(StandardCharsets.UTF_8)))
            .setGameBiz("hk4e_global")
            .setFHPGCOBFIOE(req.getFHPGCOBFIOE())
            .setAuthAppid(req.getAuthAppid())
            .build();

        this.setData(rsp);
    }
}
