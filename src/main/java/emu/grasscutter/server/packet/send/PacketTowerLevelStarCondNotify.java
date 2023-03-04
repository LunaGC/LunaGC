package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData;
import emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify;

public class PacketTowerLevelStarCondNotify extends BasePacket {

	public PacketTowerLevelStarCondNotify(int floorId, int levelIndex) {
		super(PacketOpcodes.TowerLevelStarCondNotify);

		TowerLevelStarCondNotify proto = TowerLevelStarCondNotify.newBuilder()
				.setFloorId(floorId)
				.setLevelIndex(levelIndex)
				.addCondDataList(TowerLevelStarCondData.newBuilder()
						.build())
				.addCondDataList(TowerLevelStarCondData.newBuilder()
						.build())
				.addCondDataList(TowerLevelStarCondData.newBuilder()
						.build())
				.build();

		this.setData(proto);
	}
}
