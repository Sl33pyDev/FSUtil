package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.GlamrockRoxyTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class GlamrockRoxyBlockModel extends GeoModel<GlamrockRoxyTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(GlamrockRoxyTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(GlamrockRoxyTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/glamrockroxy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GlamrockRoxyTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/glamroxyplush.png");
    }
}
