package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.HelpyBlockModel;
import org.fsp.fsutil.entity.HelpyTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class HelpyTileRenderer extends GeoBlockRenderer<HelpyTileEntity> {
    public HelpyTileRenderer() {
        super(new HelpyBlockModel());
    }

    @Override
    public RenderType getRenderType(HelpyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
