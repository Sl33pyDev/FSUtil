package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.BonnieDisplayModel;
import org.fsp.fsutil.client.model.Sl33pyDisplayModel;
import org.fsp.fsutil.item.custom.BonnieDisplayItem;
import org.fsp.fsutil.item.custom.Sl33pyDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BonnieDisplayItemRenderer extends GeoItemRenderer<BonnieDisplayItem> {
    public BonnieDisplayItemRenderer() {
        super(new BonnieDisplayModel());
    }

    @Override
    public RenderType getRenderType(BonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}

