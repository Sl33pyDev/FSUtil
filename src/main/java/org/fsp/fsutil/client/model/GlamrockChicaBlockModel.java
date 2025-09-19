package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.FreddyTileEntity;
import org.fsp.fsutil.entity.GlamrockChicaTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class GlamrockChicaBlockModel extends GeoModel<GlamrockChicaTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(GlamrockChicaTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(GlamrockChicaTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/glamrockchica.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GlamrockChicaTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/glamchicaplush.png");
    }
}
