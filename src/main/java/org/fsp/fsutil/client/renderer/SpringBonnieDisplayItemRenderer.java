package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.BonnieDisplayModel;
import org.fsp.fsutil.client.model.SpringBonnieDisplayModel;
import org.fsp.fsutil.item.custom.BonnieDisplayItem;
import org.fsp.fsutil.item.custom.SpringBonnieDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SpringBonnieDisplayItemRenderer extends GeoItemRenderer<SpringBonnieDisplayItem> {
    public SpringBonnieDisplayItemRenderer() {
        super(new SpringBonnieDisplayModel());
    }

    @Override
    public RenderType getRenderType(SpringBonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}

