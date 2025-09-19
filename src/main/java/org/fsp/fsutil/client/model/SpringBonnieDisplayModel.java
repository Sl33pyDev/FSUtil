package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.BonnieDisplayItem;
import org.fsp.fsutil.item.custom.SpringBonnieDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class SpringBonnieDisplayModel extends GeoModel<SpringBonnieDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(SpringBonnieDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(SpringBonnieDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/springbonnie.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SpringBonnieDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/springbonnieplush.png");
    }
}

