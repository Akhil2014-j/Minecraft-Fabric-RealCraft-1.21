package net.akhil.realcraft.item;


import net.akhil.realcraft.RealCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems{
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(RealCraft.MOD_ID, id);

        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }

    public static final Item RUBY = register(new Item(new Item.Settings()), "ruby");
    public static final Item SAPPHIRE = register(new Item(new Item.Settings()), "sapphire");


    public static void initialize() {
        // Items in Item Groups
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.RUBY));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.SAPPHIRE));
    }
}

// Item Groups
