package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import org.fsp.fsutil.client.model.Sl33pyBlockModel;
import org.fsp.fsutil.entity.Sl33pyTileEntity;
import org.fsp.fsutil.entity.VSpotTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

import static org.fsp.fsutil.Fsutil.MOD_ID;


public class Sl33pyTileRenderer extends GeoBlockRenderer<Sl33pyTileEntity> {
    public Sl33pyTileRenderer() {
        super(new Sl33pyBlockModel());
    }

    @Override
    public RenderType getRenderType(Sl33pyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
