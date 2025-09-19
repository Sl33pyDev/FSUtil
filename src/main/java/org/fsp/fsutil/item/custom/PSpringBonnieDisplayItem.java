package org.fsp.fsutil.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.fsp.fsutil.client.renderer.PSpringBonnieDisplayItemRenderer;
import org.fsp.fsutil.client.renderer.SpringBonnieDisplayItemRenderer;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public class PSpringBonnieDisplayItem extends BlockItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public PSpringBonnieDisplayItem(Block block, Properties settings) {
        super(block, settings);
    }

    private PlayState predicate(AnimationState event) {
        return PlayState.CONTINUE;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IClientItemExtensions() {
            private final BlockEntityWithoutLevelRenderer renderer = new PSpringBonnieDisplayItemRenderer();

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar data) {
        data.add(new AnimationController(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
        if (!stack.hasTag() || !stack.getTag().contains("display")) {
            CompoundTag display = new CompoundTag();
            display.putString("Name", Component.Serializer.toJson(
                    Component.empty()
                            .append(Component.literal("Psychic ").withStyle(style -> style.withItalic(false)))
                            .append(Component.literal("SpringBonnie").withStyle(style -> style.withColor(TextColor.fromRgb(0xc39860)).withItalic(false)))
            ));
            ListTag loreList = new ListTag();
            loreList.add(StringTag.valueOf(Component.Serializer.toJson(
                    Component.literal("A Plushie Sewn By Jacob").withStyle(style -> style.withColor(ChatFormatting.DARK_RED).withItalic(false))
            )));
            display.put("Lore", loreList);
            stack.getOrCreateTag().put("display", display);
        }
        super.inventoryTick(stack, level, entity, slot, selected);
    }
}