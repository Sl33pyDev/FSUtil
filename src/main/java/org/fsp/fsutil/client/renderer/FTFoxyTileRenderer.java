package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.FTFoxyBlockModel;
import org.fsp.fsutil.entity.FTFoxyTileEntity;
import org.fsp.fsutil.entity.FTFoxyTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class FTFoxyTileRenderer extends GeoBlockRenderer<FTFoxyTileEntity> {
    public FTFoxyTileRenderer() {
        super(new FTFoxyBlockModel());
    }

    @Override
    public RenderType getRenderType(FTFoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
