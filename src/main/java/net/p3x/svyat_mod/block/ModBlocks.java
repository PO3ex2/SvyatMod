package net.p3x.svyat_mod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.p3x.svyat_mod.SvyatMod;
import net.p3x.svyat_mod.block.custom.Fat;
import net.p3x.svyat_mod.block.custom.FatBlock;

public class ModBlocks {

    public static final Block FAT_BLOCK = registerBlock("fat_block",
            new FatBlock(AbstractBlock.Settings.create().strength(1f).burnable().nonOpaque().breakInstantly()
                    .requiresTool().sounds(BlockSoundGroup.HONEY)));

    public static final Block CRYSTALLIZED_FAT_BLOCK = registerBlock("crystallized_fat_block",
            new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block ODINOKIUM_ORE = registerBlock("odinokium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block FAT = registerBlock("fat",
            new Fat(AbstractBlock.Settings.create().strength(1f).burnable().nonOpaque().breakInstantly()
                    .requiresTool().dynamicBounds().sounds(BlockSoundGroup.HONEY)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SvyatMod.MOD_ID, name), block);

    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SvyatMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SvyatMod.LOGGER.info("Registering Mod Blocks for: " + SvyatMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.FAT);
            entries.add(ModBlocks.FAT_BLOCK);
            entries.add(ModBlocks.CRYSTALLIZED_FAT_BLOCK);
            entries.add(ModBlocks.ODINOKIUM_ORE);
        });
    }
}
