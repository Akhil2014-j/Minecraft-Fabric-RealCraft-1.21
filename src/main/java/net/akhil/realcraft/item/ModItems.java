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
    public static final Item RUBY = new Item(new Item.Settings());
    public static final Item SAPPHIRE = new Item(new Item.Settings());


    public static Item registerItem() {
        Registry.register(Registries.ITEM, Identifier.of("realcraft", "ruby"), RUBY);
        return Registry.register(Registries.ITEM, Identifier.of("realcraft", "sapphire"), SAPPHIRE);
    }


    public static void registerModItems() {
        RealCraft.LOGGER.info("Registering Mod Items for " + RealCraft.MOD_ID);

    }
}
