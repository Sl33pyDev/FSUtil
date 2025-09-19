package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.BonnieBlockModel;
import org.fsp.fsutil.client.model.Sl33pyBlockModel;
import org.fsp.fsutil.entity.BonnieTileEntity;
import org.fsp.fsutil.entity.Sl33pyTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BonnieTileRenderer extends GeoBlockRenderer<BonnieTileEntity> {
    public BonnieTileRenderer() {
        super(new BonnieBlockModel());
    }

    @Override
    public RenderType getRenderType(BonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
