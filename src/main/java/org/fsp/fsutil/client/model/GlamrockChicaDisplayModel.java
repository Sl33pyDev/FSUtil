package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.FreddyDisplayItem;
import org.fsp.fsutil.item.custom.GlamrockChicaDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class GlamrockChicaDisplayModel extends GeoModel<GlamrockChicaDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(GlamrockChicaDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(GlamrockChicaDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/glamrockchica.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GlamrockChicaDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/glamchicaplush.png");
    }
}

