package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.BonnieBlockModel;
import org.fsp.fsutil.client.model.SpringBonnieBlockModel;
import org.fsp.fsutil.entity.BonnieTileEntity;
import org.fsp.fsutil.entity.SpringBonnieTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class SpringBonnieTileRenderer extends GeoBlockRenderer<SpringBonnieTileEntity> {
    public SpringBonnieTileRenderer() {
        super(new SpringBonnieBlockModel());
    }

    @Override
    public RenderType getRenderType(SpringBonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
