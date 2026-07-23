package xyz.theunknowngroup.register;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ItemR {
    public static <T extends Item> T registerItem(String modId, String name, Function<Item.Properties, T> fac, Item.Properties item) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(modId, name));
        T items = fac.apply(item.setId(key));
        Registry.register(BuiltInRegistries.ITEM, key, items);
        return items;
    }
}
