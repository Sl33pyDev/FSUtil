package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.FTFreddyBlockModel;
import org.fsp.fsutil.entity.FTFreddyTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class FTFreddyTileRenderer extends GeoBlockRenderer<FTFreddyTileEntity> {
    public FTFreddyTileRenderer() {
        super(new FTFreddyBlockModel());
    }

    @Override
    public RenderType getRenderType(FTFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
