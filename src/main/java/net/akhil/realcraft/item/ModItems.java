package net.akhil.realcraft.item;

import net.akhil.realcraft.RealCraft;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RealCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RealCraft.LOGGER.info("Registering Mod Items for " + RealCraft.MOD_ID);
    }
}
