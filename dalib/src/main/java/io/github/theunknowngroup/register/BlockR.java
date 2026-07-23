package io.github.theunknowngroup.register;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jspecify.annotations.NonNull;

import java.util.function.Function;

public class BlockR {
    public static <T extends Block> @NonNull T registerBlock(String modId, String name, Function<BlockBehaviour.Properties, T> fac, BlockBehaviour.Properties block, Item.Properties item) {
        ResourceKey<Block> key1 = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(modId, name));
        ResourceKey<Item> key2 = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(modId, name));

        T blocks = fac.apply(block.setId(key1));

        registerBlockItem(key2, blocks, item);
        return Registry.register(BuiltInRegistries.BLOCK, key1, blocks);
    }
    public static BlockItem registerBlockItem(ResourceKey<Item> key2, Block blocks, Item.Properties item) {
        BlockItem blockItem = new BlockItem(blocks, item.setId(key2));
        return Registry.register(BuiltInRegistries.ITEM, key2, blockItem);
    }
}
