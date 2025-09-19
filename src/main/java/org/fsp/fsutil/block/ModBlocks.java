package org.fsp.fsutil.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.fsp.fsutil.Fsutil;
import org.fsp.fsutil.block.custom.*;

public class ModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Fsutil.MOD_ID);
    public static final RegistryObject<Block> V_SPOT = REGISTRY.register("v_spot", () -> new VSpotBlock());
    public static final RegistryObject<Block> AR_I = REGISTRY.register("ar_i", () -> new ArInhibitorBlock());
    public static final RegistryObject<Block> SL33PY = REGISTRY.register("sl33py", () -> new Sl33pyBlock());
    public static final RegistryObject<Block> TINKER = REGISTRY.register("tinker", () -> new TinkerBlock());
    public static final RegistryObject<Block> FT_FREDDY = REGISTRY.register("ft_freddy", () -> new FTFreddyBlock());
    public static final RegistryObject<Block> P_FREDBEAR = REGISTRY.register("p_fredbear", () -> new PFredbearBlock());
    public static final RegistryObject<Block> FREDBEAR = REGISTRY.register("fredbear", () -> new FredbearBlock());
    public static final RegistryObject<Block> HELPY = REGISTRY.register("helpy", () -> new HelpyBlock());
    public static final RegistryObject<Block> FREDDY = REGISTRY.register("freddy", () -> new FreddyBlock());
    public static final RegistryObject<Block> GLAMROCK_CHICA = REGISTRY.register("glamrock_chica", () -> new GlamrockChicaBlock());
    public static final RegistryObject<Block> GLAMROCK_ROXY = REGISTRY.register("glamrock_roxy", () -> new GlamrockRoxyBlock());
    public static final RegistryObject<Block> FT_FOXY = REGISTRY.register("ft_foxy", () -> new FTFoxyBlock());
    public static final RegistryObject<Block> BONNIE = REGISTRY.register("bonnie", () -> new BonnieBlock());
    public static final RegistryObject<Block> SPRING_BONNIE = REGISTRY.register("spring_bonnie", () -> new SpringBonnieBlock());
    public static final RegistryObject<Block> P_SPRING_BONNIE = REGISTRY.register("p_spring_bonnie", () -> new PSpringBonnieBlock());
    public static final RegistryObject<Block> CURTAIN_DOOR = REGISTRY.register("curtain_door", () -> new CurtainDoorBlock());
    public static final RegistryObject<Block> V_ECLISPE = REGISTRY.register("v_eclispe", () -> new VEclispeBlock());
    public static final RegistryObject<Block> SL33PY_ARM = REGISTRY.register("sl33py_arm", () -> new Sl33pyArmBlock());
    public static final RegistryObject<Block> FREDBEARS_FLOOR_CARPET = REGISTRY.register("fredbears_floor_carpet", () -> new FredbearsFloorCarpetBlock());    public static final RegistryObject<Block> CONFETTI_FREDBEAR_FLOORS = REGISTRY.register("confetti_fredbear_floors", () -> new ConfettiFredbearFloorsBlock());
    public static final RegistryObject<Block> TILED_BLACK_BRICK_WALL = REGISTRY.register("tiled_black_brick_wall", () -> new TiledBlackBrickWallBlock());
    public static final RegistryObject<Block> TILED_BLACKFACADE_WALL = REGISTRY.register("tiled_blackfacade_wall", () -> new TiledBlackfacadeWallBlock());
    public static final RegistryObject<Block> BLACKFACADEWALL = REGISTRY.register("blackfacadewall", () -> new BlackfacadewallBlock());
    public static final RegistryObject<Block> REWRITTEN_FREADBEAR_CARPET = REGISTRY.register("rewritten_freadbear_wall", () -> new RewrittenFreadbearCarpetBlock());

}
