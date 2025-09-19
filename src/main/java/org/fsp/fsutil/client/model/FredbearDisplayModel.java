package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.FredbearDisplayItem;
import org.fsp.fsutil.item.custom.PFredbearDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class FredbearDisplayModel extends GeoModel<FredbearDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(FredbearDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(FredbearDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/fredbear.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FredbearDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/fredbearplush.png");
    }
}

