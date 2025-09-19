package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.PFredbearBlockModel;
import org.fsp.fsutil.entity.PFredbearTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class PFredbearTileRenderer extends GeoBlockRenderer<PFredbearTileEntity> {
    public PFredbearTileRenderer() {
        super(new PFredbearBlockModel());
    }

    @Override
    public RenderType getRenderType(PFredbearTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
