package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.FTFreddyDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class FTFreddyDisplayModel extends GeoModel<FTFreddyDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(FTFreddyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(FTFreddyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/ftfreddy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FTFreddyDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/ftfreddyplush.png");
    }
}

