package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.BonnieTileEntity;
import org.fsp.fsutil.entity.SpringBonnieTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class SpringBonnieBlockModel extends GeoModel<SpringBonnieTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(SpringBonnieTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(SpringBonnieTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/springbonnie.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SpringBonnieTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/springbonnieplush.png");
    }
}
