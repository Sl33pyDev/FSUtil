package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import org.fsp.fsutil.client.model.ArInhibitorBlockModel;
import org.fsp.fsutil.client.model.Sl33pyBlockModel;
import org.fsp.fsutil.entity.AR_ITileEntity;
import org.fsp.fsutil.entity.Sl33pyTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

import static org.fsp.fsutil.Fsutil.MOD_ID;


public class ArInhibitorTileRenderer extends GeoBlockRenderer<AR_ITileEntity> {
    public ArInhibitorTileRenderer() {
        super(new ArInhibitorBlockModel());
    }

    @Override
    public RenderType getRenderType(AR_ITileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
