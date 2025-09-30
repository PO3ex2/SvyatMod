package net.p3x.svyat_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.p3x.svyat_mod.SvyatMod;

public class ModItems {
    public static final Item CRYSTALLIZED_FAT = registerItem("crystallized_fat", new Item(new Item.Settings()));
    public static final Item RAW_ODINOKIUM = registerItem("raw_odinokium", new Item(new Item.Settings()));
    public static final Item ODINOKIUM_INGOT = registerItem("odinokium_ingot", new Item(new Item.Settings()));
    public static final Item FINIKI = registerItem("finiki", new Item(new Item.Settings().food(ModFoodComponents.FINIKI)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SvyatMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        SvyatMod.LOGGER.info("Registering Mod Items for: " + SvyatMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CRYSTALLIZED_FAT);
            entries.add(RAW_ODINOKIUM);
            entries.add(ODINOKIUM_INGOT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(FINIKI);
        });
    }
}
