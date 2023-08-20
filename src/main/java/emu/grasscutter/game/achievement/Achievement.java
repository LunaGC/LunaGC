package emu.grasscutter.game.achievement;

import dev.morphia.annotations.Entity;
import emu.grasscutter.net.proto.AchievementOuterClass;
import emu.grasscutter.net.proto.StatusOuterClass;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Achievement {
    @Setter
    @Deprecated
    /**
     * @deprecated please use @{@link emu.grasscutter.game.achievement.Achievement.achievementStatus}
     *
     */
    private StatusOuterClass.Status status;
    @Setter
    private AchievementStatus achievementStatus;
    private int id;
    private int totalProgress;
    @Setter
    private int curProgress;
    @Setter
    private int finishTimestampSec;

    public Achievement(
        AchievementStatus achievementStatus,
        int id,
        int totalProgress,
        int curProgress,
        int finishTimestampSec) {
        this.status = StatusOuterClass.Status.forNumber(achievementStatus.getNum());
        this.achievementStatus = achievementStatus;
        this.id = id;
        this.totalProgress = totalProgress;
        this.curProgress = curProgress;
        this.finishTimestampSec = finishTimestampSec;
    }

    public AchievementOuterClass.Achievement toProto() {
        this.fixData();

        return AchievementOuterClass.Achievement.newBuilder()
            .setStatus(this.getAchievementStatus().toProto())
            .setId(this.getId())
            .setTotalProgress(this.getTotalProgress())
            .setCurProgress(this.getCurProgress())
            .setFinishTimestamp(this.getFinishTimestampSec())
            .build();
    }

    private void fixData() {
        if (this.achievementStatus == null) {
            this.achievementStatus = AchievementStatus.forNumber(this.status.getNumber());
        }
    }
}
