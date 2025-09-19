package org.fsp.fsutil.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.fsp.fsutil.item.ModItems;

public class FazWrenchItem extends Item {
    public FazWrenchItem() {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        // Only trigger if player is holding shift
        if (!world.isClientSide && player.isShiftKeyDown()) {
            ItemStack newStack = new ItemStack(ModItems.CLOSED_FAZ_WRENCH.get());
            newStack.setCount(stack.getCount()); // Preserve stack size
            player.setItemInHand(hand, newStack);
            return InteractionResultHolder.success(newStack);
        }

        // Do nothing if not sneaking
        return InteractionResultHolder.pass(stack);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return false; // No enchantment glint
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.NONE; // No use animation
    }
}
