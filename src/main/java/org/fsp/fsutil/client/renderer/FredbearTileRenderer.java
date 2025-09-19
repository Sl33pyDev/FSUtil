package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.FredbearBlockModel;
import org.fsp.fsutil.entity.FredbearTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class FredbearTileRenderer extends GeoBlockRenderer<FredbearTileEntity> {
    public FredbearTileRenderer() {
        super(new FredbearBlockModel());
    }

    @Override
    public RenderType getRenderType(FredbearTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
