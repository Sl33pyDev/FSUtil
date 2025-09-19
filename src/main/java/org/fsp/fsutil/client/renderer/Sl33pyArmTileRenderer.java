package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.Sl33pyArmBlockModel;
import org.fsp.fsutil.client.model.Sl33pyBlockModel;
import org.fsp.fsutil.entity.Sl33pyArmTileEntity;
import org.fsp.fsutil.entity.Sl33pyTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;


public class Sl33pyArmTileRenderer extends GeoBlockRenderer<Sl33pyArmTileEntity> {
    public Sl33pyArmTileRenderer() {
        super(new Sl33pyArmBlockModel());
    }

    @Override
    public RenderType getRenderType(Sl33pyArmTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
