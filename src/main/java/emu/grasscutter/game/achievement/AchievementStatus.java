package emu.grasscutter.game.achievement;

import emu.grasscutter.net.proto.AchievementOuterClass;
import lombok.Getter;

import java.util.Arrays;

public enum AchievementStatus {
    INVALID(AchievementOuterClass.Achievement.KNKEIELCCDB.OPFLKOJMOIG_Invalid_VALUE),
    UNFINISHED(AchievementOuterClass.Achievement.KNKEIELCCDB.OPFLKOJMOIG_Unfinished_VALUE),
    FINISHED(AchievementOuterClass.Achievement.KNKEIELCCDB.OPFLKOJMOIG_Finished_VALUE),
    REWARD_TAKEN(AchievementOuterClass.Achievement.KNKEIELCCDB.OPFLKOJMOIG_RewardTaken_VALUE);

    @Getter
    private final int num;

    AchievementStatus(int num) {
        this.num = num;
    }

    public static AchievementStatus forNumber(int num) {
        return Arrays.stream(values()).filter(achievementStatus -> achievementStatus.num == num).findFirst().orElse(INVALID);
    }

    public AchievementOuterClass.Achievement.KNKEIELCCDB toProto() {
        return AchievementOuterClass.Achievement.KNKEIELCCDB.forNumber(this.num);
    }
}
