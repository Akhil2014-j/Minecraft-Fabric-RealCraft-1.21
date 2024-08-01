package net.akhil.realcraft.item;


import net.akhil.realcraft.RealCraft;
import net.akhil.realcraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;


public class ModItems{

    public static final RegistryKey<ItemGroup> MOD_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(RealCraft.MOD_ID, "item_group"));
    public static final ItemGroup REALCRAFT = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.RUBY))
            .displayName(Text.translatable("itemGroup.realcraft"))
            .build();

    public static Item register(Item item, String id) {



        Identifier itemID = Identifier.of(RealCraft.MOD_ID, id);

        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        Registry.register(Registries.ITEM_GROUP, MOD_ITEM_GROUP_KEY, REALCRAFT);

        return registeredItem;
    }

    public static final Item RUBY = register(new Item(new Item.Settings()), "ruby");
    public static final Item SAPPHIRE = register(new Item(new Item.Settings()), "sapphire");
    public static final Item BURNT_OUT_TORCH = register((BlockItem) (new VerticallyAttachableBlockItem(ModBlocks.BURNT_OUT_TORCH, ModBlocks.BURNT_OUT_WALL_TORCH,  new Item.Settings(), Direction.DOWN)), "burnt_out_torch_item");


    public static void initialize() {
        // Items in Item Groups
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.RUBY));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.SAPPHIRE));

        ItemGroupEvents.modifyEntriesEvent(MOD_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.RUBY);
            itemGroup.add(ModItems.SAPPHIRE);
            itemGroup.add(ModBlocks.RUBY_BLOCK);
            itemGroup.add(ModBlocks.SAPPHIRE_BLOCK);
            itemGroup.add(ModBlocks.RUBY_ORE);
            itemGroup.add(ModBlocks.SAPPHIRE_ORE);
            itemGroup.add(ModBlocks.BURNT_OUT_TORCH);
        });
    }


}
