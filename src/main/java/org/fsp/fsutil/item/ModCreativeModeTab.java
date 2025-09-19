package org.fsp.fsutil.item;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import org.fsp.fsutil.Fsutil;
import org.fsp.fsutil.block.ModBlocks;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Fsutil.MOD_ID);
    private static ItemStack styledPlush(ItemStack base, Component name, Component lore) {
        CompoundTag display = new CompoundTag();
        display.putString("Name", Component.Serializer.toJson(name));
        ListTag loreList = new ListTag();
        loreList.add(StringTag.valueOf(Component.Serializer.toJson(lore)));
        display.put("Lore", loreList);
        base.getOrCreateTag().put("display", display);
        return base;
    }

    public static final RegistryObject<CreativeModeTab> FS_BLOCKS = REGISTRY.register("fsutil_blocks",
            () -> CreativeModeTab.builder().title(Component.translatable("item_group.fsutil.fsutil_blocks")).icon(() -> new ItemStack(ModBlocks.FREDBEARS_FLOOR_CARPET.get())).displayItems((parameters, tabData) -> {
                tabData.accept(ModBlocks.REWRITTEN_FREADBEAR_CARPET.get().asItem());
                tabData.accept(ModBlocks.FREDBEARS_FLOOR_CARPET.get().asItem());
                tabData.accept(ModBlocks.CONFETTI_FREDBEAR_FLOORS.get().asItem());
                tabData.accept(ModBlocks.TILED_BLACK_BRICK_WALL.get().asItem());
                tabData.accept(ModBlocks.TILED_BLACKFACADE_WALL.get().asItem());
                tabData.accept(ModBlocks.BLACKFACADEWALL.get().asItem());
                tabData.accept(ModBlocks.CURTAIN_DOOR.get().asItem());
            }).build());
    public static final RegistryObject<CreativeModeTab> FS_PLUSHIES = REGISTRY.register("fsutil_plushies",
            () -> CreativeModeTab.builder().title(Component.translatable("item_group.fsutil.fsutil_plushies")).icon(() -> new ItemStack(ModBlocks.V_SPOT.get())).displayItems((parameters, tabData) -> {
                tabData.accept(ModBlocks.V_SPOT.get().asItem());
                tabData.accept(ModBlocks.BONNIE.get().asItem());
                tabData.accept(ModBlocks.SPRING_BONNIE.get().asItem());
                tabData.accept(ModBlocks.P_SPRING_BONNIE.get().asItem());
                tabData.accept(ModBlocks.V_ECLISPE.get().asItem());
                tabData.accept(ModBlocks.SL33PY.get().asItem());
                tabData.accept(ModBlocks.TINKER.get().asItem());
                tabData.accept(ModBlocks.FT_FREDDY.get().asItem());
                tabData.accept(ModBlocks.FREDDY.get().asItem());
                tabData.accept(ModBlocks.FT_FOXY.get().asItem());
                tabData.accept(ModBlocks.GLAMROCK_CHICA.get().asItem());
                tabData.accept(ModBlocks.GLAMROCK_ROXY.get().asItem());
                tabData.accept(ModBlocks.P_FREDBEAR.get().asItem());
                tabData.accept(ModBlocks.FREDBEAR.get().asItem());
                tabData.accept(ModBlocks.HELPY.get().asItem());
            }).withTabsBefore(FS_BLOCKS.getId()).build());
    public static final RegistryObject<CreativeModeTab> FS_UTILIES = REGISTRY.register("fsutil_utilities",
            () -> CreativeModeTab.builder().title(Component.translatable("item_group.fsutil.fsutil_utilities")).icon(() -> new ItemStack(ModItems.FAZ_WRENCH.get())).displayItems((parameters, tabData) -> {
                tabData.accept(ModBlocks.AR_I.get().asItem());
                tabData.accept(ModItems.SCISSORS.get().asItem());
                tabData.accept(ModItems.FAZ_WRENCH.get().asItem());
                tabData.accept(ModItems.CLOSED_FAZ_WRENCH.get().asItem());
            }).withTabsBefore(FS_PLUSHIES.getId()).build());

}
