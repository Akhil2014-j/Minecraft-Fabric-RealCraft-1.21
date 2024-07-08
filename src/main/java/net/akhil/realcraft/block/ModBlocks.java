package net.akhil.realcraft.block;

import net.akhil.realcraft.RealCraft;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static Block register(Block block, String name,  boolean shouldRegisterItem) {
        Identifier id = Identifier.of(RealCraft.MOD_ID, name);

        if(shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final Block RUBY_BLOCK = register(new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(5.0f, 6.0f)), "ruby_block", true);
    public static final Block SAPPHIRE_BLOCK = register(new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(5.0f, 6.0f)), "sapphire_block", true);

    public static void initialize() {}
}
