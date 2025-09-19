package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.VSpotDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class VSpotDisplayModel extends GeoModel<VSpotDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(VSpotDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(VSpotDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/spot.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VSpotDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/vspottxt.png");
    }
}

