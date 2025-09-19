package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.BonnieDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class BonnieDisplayModel extends GeoModel<BonnieDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(BonnieDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(BonnieDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/bonnie.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BonnieDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/bonnieplush.png");
    }
}

