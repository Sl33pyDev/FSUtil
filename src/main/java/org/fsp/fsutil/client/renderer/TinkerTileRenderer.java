package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.TinkerBlockModel;
import org.fsp.fsutil.entity.TinkerTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;


public class TinkerTileRenderer extends GeoBlockRenderer<TinkerTileEntity> {
    public TinkerTileRenderer() {
        super(new TinkerBlockModel());
    }

    @Override
    public RenderType getRenderType(TinkerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
