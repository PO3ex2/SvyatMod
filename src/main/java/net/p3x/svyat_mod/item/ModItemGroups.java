package net.p3x.svyat_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.p3x.svyat_mod.SvyatMod;
import net.p3x.svyat_mod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup SVYAT_MOD_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(SvyatMod.MOD_ID, "svyat_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.FAT))
                    .displayName(Text.translatable("itemgroup.svyatmod.svyat_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FAT);
                        entries.add(ModItems.CRYSTALLIZED_FAT);
                        entries.add(ModBlocks.FAT_BLOCK);
                        entries.add(ModBlocks.CRYSTALLIZED_FAT_BLOCK);
                        entries.add(ModBlocks.ODINOKIUM_ORE);
                        entries.add(ModItems.RAW_ODINOKIUM);
                        entries.add(ModItems.ODINOKIUM_INGOT);
                        entries.add(ModItems.FINIKI);
                    }).build());

    public static void registerItemGroups() {
        SvyatMod.LOGGER.info("Registering Mod Item Groups for: " + SvyatMod.MOD_ID);
    }
}
