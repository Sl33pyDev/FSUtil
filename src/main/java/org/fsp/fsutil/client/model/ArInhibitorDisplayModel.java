package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.ArInhibitorDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class ArInhibitorDisplayModel extends GeoModel<ArInhibitorDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(ArInhibitorDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/ar_inhibitor.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ArInhibitorDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/ar_inhibitor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArInhibitorDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/ar_i_main.png");
    }
}