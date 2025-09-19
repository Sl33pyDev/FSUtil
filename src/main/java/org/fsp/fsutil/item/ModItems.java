package org.fsp.fsutil.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import org.fsp.fsutil.block.ModBlocks;
import org.fsp.fsutil.item.custom.*;
import org.fsp.fsutil.Fsutil;

public class ModItems {

    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Fsutil.MOD_ID);
    public static final RegistryObject<Item> AR_I = REGISTRY.register("ar_i",
            () -> new ArInhibitorDisplayItem(ModBlocks.AR_I.get(), new Properties().stacksTo(1)));
    public static final RegistryObject<Item> SL33PY = REGISTRY.register(ModBlocks.SL33PY.getId().getPath(), () -> new Sl33pyDisplayItem(ModBlocks.SL33PY.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TINKER = REGISTRY.register(ModBlocks.TINKER.getId().getPath(), () -> new TinkerDisplayItem(ModBlocks.TINKER.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BONNIE = REGISTRY.register(ModBlocks.BONNIE.getId().getPath(), () -> new BonnieDisplayItem(ModBlocks.BONNIE.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SPRING_BONNIE = REGISTRY.register(ModBlocks.SPRING_BONNIE.getId().getPath(), () -> new SpringBonnieDisplayItem(ModBlocks.SPRING_BONNIE.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> P_SPRING_BONNIE = REGISTRY.register(ModBlocks.P_SPRING_BONNIE.getId().getPath(), () -> new PSpringBonnieDisplayItem(ModBlocks.P_SPRING_BONNIE.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> P_FREDBEAR = REGISTRY.register(ModBlocks.P_FREDBEAR.getId().getPath(), () -> new PFredbearDisplayItem(ModBlocks.P_FREDBEAR.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FREDBEAR = REGISTRY.register(ModBlocks.FREDBEAR.getId().getPath(), () -> new FredbearDisplayItem(ModBlocks.FREDBEAR.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HELPY = REGISTRY.register(ModBlocks.HELPY.getId().getPath(), () -> new HelpyDisplayItem(ModBlocks.HELPY.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FT_FREDDY = REGISTRY.register(ModBlocks.FT_FREDDY.getId().getPath(), () -> new FTFreddyDisplayItem(ModBlocks.FT_FREDDY.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FT_FOXY = REGISTRY.register(ModBlocks.FT_FOXY.getId().getPath(), () -> new FTFoxyDisplayItem(ModBlocks.FT_FOXY.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FREDDY = REGISTRY.register(ModBlocks.FREDDY.getId().getPath(), () -> new FreddyDisplayItem(ModBlocks.FREDDY.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GLAMROCK_CHICA = REGISTRY.register(ModBlocks.GLAMROCK_CHICA.getId().getPath(), () -> new GlamrockChicaDisplayItem(ModBlocks.GLAMROCK_CHICA.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GLAMROCK_ROXY = REGISTRY.register(ModBlocks.GLAMROCK_ROXY.getId().getPath(), () -> new GlamrockRoxyDisplayItem(ModBlocks.GLAMROCK_ROXY.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SCISSORS = REGISTRY.register("scissors", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> V_SPOT = REGISTRY.register(ModBlocks.V_SPOT.getId().getPath(), () -> new VSpotDisplayItem(ModBlocks.V_SPOT.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CURTAIN_DOOR = block(ModBlocks.CURTAIN_DOOR);
    public static final RegistryObject<Item> V_ECLISPE = REGISTRY.register(ModBlocks.V_ECLISPE.getId().getPath(), () -> new VEclispeDisplayItem(ModBlocks.V_ECLISPE.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> Sl33PY_ARM = REGISTRY.register(ModBlocks.SL33PY_ARM.getId().getPath(), () -> new Sl33pyArmDisplayItem(ModBlocks.SL33PY_ARM.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FREDBEARS_FLOOR_CARPET = block(ModBlocks.FREDBEARS_FLOOR_CARPET);
    public static final RegistryObject<Item> CONFETTI_FREDBEAR_FLOORS = block(ModBlocks.CONFETTI_FREDBEAR_FLOORS);
    public static final RegistryObject<Item> TILED_BLACK_BRICK_WALL = block(ModBlocks.TILED_BLACK_BRICK_WALL);
    public static final RegistryObject<Item> TILED_BLACKFACADE_WALL = block(ModBlocks.TILED_BLACKFACADE_WALL);
    public static final RegistryObject<Item> BLACKFACADEWALL = block(ModBlocks.BLACKFACADEWALL);
    public static final RegistryObject<Item> REWRITTEN_FREADBEAR_CARPET = block(ModBlocks.REWRITTEN_FREADBEAR_CARPET);
    public static final RegistryObject<Item> CLOSED_FAZ_WRENCH = REGISTRY.register("closed_faz_wrench", () -> new ClosedFazWrenchItem());
    public static final RegistryObject<Item> FAZ_WRENCH = REGISTRY.register("faz_wrench", () -> new FazWrenchItem());
    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }

}
