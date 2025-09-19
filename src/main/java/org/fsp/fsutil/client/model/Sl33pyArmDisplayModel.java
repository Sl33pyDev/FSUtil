package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.Sl33pyArmDisplayItem;
import org.fsp.fsutil.item.custom.Sl33pyDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class Sl33pyArmDisplayModel extends GeoModel<Sl33pyArmDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(Sl33pyArmDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/dead.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(Sl33pyArmDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/sl33pyarm.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Sl33pyArmDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/sl33pyarm.png");
    }
}