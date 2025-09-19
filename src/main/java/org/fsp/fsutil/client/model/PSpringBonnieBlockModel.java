package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.PSpringBonnieTileEntity;
import org.fsp.fsutil.entity.SpringBonnieTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class PSpringBonnieBlockModel extends GeoModel<PSpringBonnieTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(PSpringBonnieTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PSpringBonnieTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/springbonnie.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PSpringBonnieTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/pspringbonnieplush.png");
    }
}
