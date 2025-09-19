package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.Sl33pyDisplayItem;
import org.fsp.fsutil.item.custom.VSpotDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class Sl33pyDisplayModel extends GeoModel<Sl33pyDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(Sl33pyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(Sl33pyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/sl33py.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Sl33pyDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/sl33py.png");
    }
}

