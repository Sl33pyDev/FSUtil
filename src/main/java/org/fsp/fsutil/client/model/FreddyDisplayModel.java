package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.FTFreddyDisplayItem;
import org.fsp.fsutil.item.custom.FreddyDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class FreddyDisplayModel extends GeoModel<FreddyDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(FreddyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(FreddyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/freddy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FreddyDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/freddyplush.png");
    }
}

