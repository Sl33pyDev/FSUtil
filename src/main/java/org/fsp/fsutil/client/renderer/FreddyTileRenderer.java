package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.FreddyBlockModel;
import org.fsp.fsutil.entity.FreddyTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class FreddyTileRenderer extends GeoBlockRenderer<FreddyTileEntity> {
    public FreddyTileRenderer() {
        super(new FreddyBlockModel());
    }

    @Override
    public RenderType getRenderType(FreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
