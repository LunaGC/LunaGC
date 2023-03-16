package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = "ProductIdConfigData.json")
public class ProductIdData extends GameResource {
    String productId;
    int configId;
    boolean isInternal;
    String entitlementId;
    String HFBCHMMGGHI;
    String[] KAHONNGIIAC;

    @Override
    public int getId() {
        return this.productId.hashCode();
    }

    public boolean isNotInternal() {
        return !this.isInternal;
    }
}
