package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.PSpringBonnieBlockModel;
import org.fsp.fsutil.client.model.SpringBonnieBlockModel;
import org.fsp.fsutil.entity.PSpringBonnieTileEntity;
import org.fsp.fsutil.entity.SpringBonnieTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class PSpringBonnieTileRenderer extends GeoBlockRenderer<PSpringBonnieTileEntity> {
    public PSpringBonnieTileRenderer() {
        super(new PSpringBonnieBlockModel());
    }

    @Override
    public RenderType getRenderType(PSpringBonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
