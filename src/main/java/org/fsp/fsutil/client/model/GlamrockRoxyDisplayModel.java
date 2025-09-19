package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.item.custom.GlamrockRoxyDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class GlamrockRoxyDisplayModel extends GeoModel<GlamrockRoxyDisplayItem> {
    @Override
    public ResourceLocation getAnimationResource(GlamrockRoxyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(GlamrockRoxyDisplayItem animatable) {
        return new ResourceLocation("fsutil", "geo/glamrockroxy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GlamrockRoxyDisplayItem entity) {
        return new ResourceLocation("fsutil", "textures/block/glamroxyplush.png");
    }
}

