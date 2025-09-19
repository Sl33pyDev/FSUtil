package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.Sl33pyArmDisplayModel;
import org.fsp.fsutil.client.model.Sl33pyDisplayModel;
import org.fsp.fsutil.item.custom.Sl33pyArmDisplayItem;
import org.fsp.fsutil.item.custom.Sl33pyDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class Sl33pyArmDisplayItemRenderer  extends GeoItemRenderer<Sl33pyArmDisplayItem> {
    public Sl33pyArmDisplayItemRenderer() {
        super(new Sl33pyArmDisplayModel());
    }

    @Override
    public RenderType getRenderType(Sl33pyArmDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}