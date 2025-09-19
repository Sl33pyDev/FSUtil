package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.PFredbearDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class PFredbearDisplayModel extends GeoModel<PFredbearDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(PFredbearDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PFredbearDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/fredbear.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PFredbearDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/pfredbearplush.png");
    }
}

