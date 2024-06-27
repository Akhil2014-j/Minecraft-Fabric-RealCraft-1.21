package net.akhil.realcraft.item;

import net.fabricmc.fabric.api.item.v1.*;
import net.akhil.realcraft.RealCraft;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems{
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(RealCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RealCraft.LOGGER.info("Registering Mod Items for " + RealCraft.MOD_ID);
        //Fix under

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup)
    }
}
