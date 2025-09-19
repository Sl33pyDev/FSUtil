package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.VEclispeDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class VEclispeDisplayModel extends GeoModel<VEclispeDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(VEclispeDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(VEclispeDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/eclipse.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VEclispeDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/glameclipseplush.png");
    }
}