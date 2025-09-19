package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.Sl33pyArmTileEntity;
import org.fsp.fsutil.item.custom.Sl33pyArmDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class Sl33pyArmBlockModel extends GeoModel<Sl33pyArmTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(Sl33pyArmTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/dead.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(Sl33pyArmTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/sl33pyarm.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Sl33pyArmTileEntity entity) {
        return new ResourceLocation("fsutil", "textures/block/sl33pyarm.png");
    }
}