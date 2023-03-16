package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.PlayerProperty;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.BuyResinRspOuterClass;
import emu.grasscutter.net.proto.RetcodeOuterClass;

public class PacketBuyResinRsp extends BasePacket {
    public PacketBuyResinRsp(Player player, boolean bought) {
        super(PacketOpcodes.BuyResinRsp);

        var rsp = BuyResinRspOuterClass.BuyResinRsp.newBuilder()
            .setCurValue(player.getProperty(PlayerProperty.PROP_PLAYER_RESIN));

        rsp.setRetcode(bought ? 0 : RetcodeOuterClass.Retcode.RET_RESIN_BOUGHT_COUNT_EXCEEDED_VALUE);

        this.setData(rsp.build());
    }
}
