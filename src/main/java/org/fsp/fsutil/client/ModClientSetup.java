package org.fsp.fsutil.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.fsp.fsutil.Fsutil;
import org.fsp.fsutil.block.ModBlockEntities;
import org.fsp.fsutil.client.renderer.*;

@Mod.EventBusSubscriber(modid = Fsutil.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModClientSetup {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.V_SPOT.get(), context -> new VSpotTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.V_ECLISPE.get(), context -> new VEclispeTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.AR_I.get(), context -> new ArInhibitorTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.SL33PY.get(), context -> new Sl33pyTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.SL33PY_ARM.get(), context -> new Sl33pyArmTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.BONNIE.get(), context -> new BonnieTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.SPRING_BONNIE.get(), context -> new SpringBonnieTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.P_SPRING_BONNIE.get(), context -> new PSpringBonnieTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.FT_FREDDY.get(), context -> new FTFreddyTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.FT_FOXY.get(), context -> new FTFoxyTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.FREDDY.get(), context -> new FreddyTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.GLAMROCK_CHICA.get(), context -> new GlamrockChicaTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.GLAMROCK_ROXY.get(), context -> new GlamrockRoxyTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.FREDBEAR.get(), context -> new FredbearTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.P_FREDBEAR.get(), context -> new PFredbearTileRenderer());
        event.registerBlockEntityRenderer(ModBlockEntities.HELPY.get(), context -> new HelpyTileRenderer());

        event.registerBlockEntityRenderer(ModBlockEntities.TINKER.get(), context -> new TinkerTileRenderer());
    }
}
