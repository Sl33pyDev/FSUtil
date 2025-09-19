package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.Sl33pyDisplayItem;
import org.fsp.fsutil.item.custom.TinkerDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class TinkerDisplayModel extends GeoModel<TinkerDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(TinkerDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(TinkerDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/tinker.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TinkerDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/tinker.png");
    }
}

