package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.PSpringBonnieDisplayItem;
import org.fsp.fsutil.item.custom.SpringBonnieDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class PSpringBonnieDisplayModel extends GeoModel<PSpringBonnieDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(PSpringBonnieDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PSpringBonnieDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/springbonnie.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PSpringBonnieDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/pspringbonnieplush.png");
    }
}

