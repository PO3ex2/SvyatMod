package net.p3x.svyat_mod.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.p3x.svyat_mod.block.ModBlocks;
import java.util.Map;

public class FatItem extends Item {

    private static final Map<Block, Block> FAT_MAP =
            Map.of(
                    ModBlocks.CRYSTALLIZED_FAT_BLOCK, ModBlocks.FAT_BLOCK
            );

    public FatItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(FAT_MAP.containsKey(clickedBlock)) {
            if (!world.isClient()) {
                world.setBlockState(context.getBlockPos(), FAT_MAP.get(clickedBlock).getDefaultState());

                context.getStack().decrement(1);

                world.playSound(null, context.getBlockPos(), SoundEvents.ITEM_HONEYCOMB_WAX_ON, SoundCategory.BLOCKS);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.FAIL;
    }
}
