package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.FTFoxyDisplayItem;
import org.fsp.fsutil.item.custom.FTFreddyDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class FTFoxyDisplayModel extends GeoModel<FTFoxyDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(FTFoxyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(FTFoxyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/ftfoxy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FTFoxyDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/ftfoxyplush.png");
    }
}

