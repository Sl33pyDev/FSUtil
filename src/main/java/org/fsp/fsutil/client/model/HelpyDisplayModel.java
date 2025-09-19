package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.HelpyDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class HelpyDisplayModel extends GeoModel<HelpyDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(HelpyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(HelpyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/helpy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HelpyDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/helpyplush.png");
    }
}

