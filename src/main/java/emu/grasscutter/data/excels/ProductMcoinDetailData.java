package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.shop.ShopType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = "ProductMcoinDetailConfigData.json")
public class ProductMcoinDetailData extends GameResource {
    long itemNameTextMapHash;
    long primNameTextMapHash;
    int mcoinNum;
    int mcoinNonFirst;
    int mcoinFirst;
    int seqence;
    int configId;
    String priceTier;
    ShopType shopType;

    @Override
    public int getId() {
        return this.configId;
    }
}
