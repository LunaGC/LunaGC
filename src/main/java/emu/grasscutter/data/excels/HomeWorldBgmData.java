package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"HomeWorldBgmExcelConfigData.json"})
public class HomeWorldBgmData extends GameResource {
    @SerializedName(value = "homeBgmId", alternate = {"MJJENLEBKEF", "KHCOCKKLNGA"})
    private int homeBgmId;
    @SerializedName(value = "isDefaultUnlock", alternate = "DMAFAJNKPME")
    private boolean isDefaultUnlock;
    private boolean ALNPIEOANEF;
    private boolean FOKADLPKMDC;
    private int cityId;
    private int sortOrder;
    private String FKPMAKMFAMN;
    @SerializedName(value = "bgmNameTextMapHash", alternate = {"LMLNBMJFFML", "FJACDCGLBHD"})
    private long bgmNameTextMapHash;

    @Override
    public int getId() {
        return this.homeBgmId;
    }
}
