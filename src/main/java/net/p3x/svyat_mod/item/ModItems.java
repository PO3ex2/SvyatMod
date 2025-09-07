package net.p3x.svyat_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.p3x.svyat_mod.SvyatMod;

public class ModItems {
    public static final Item FAT = registerItem("fat", new Item(new Item.Settings()));
    public static final Item CRYSTALLIZED_FAT = registerItem("crystallized_fat", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SvyatMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        SvyatMod.LOGGER.info("Registering Mod Items for: " + SvyatMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FAT);
            entries.add(CRYSTALLIZED_FAT);
        });
    }
}
