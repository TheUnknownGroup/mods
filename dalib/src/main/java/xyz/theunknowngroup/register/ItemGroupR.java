package xyz.theunknowngroup.register;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ItemGroupR {
    private final String modId;
    private final String name;
    private Supplier<ItemStack> icon;
    private Component title;
    private final List<Consumer<CreativeModeTab.Output>> entries1 = new ArrayList<>();
    private ResourceKey<CreativeModeTab> after;
    public ItemGroupR(String modId, String name) {
        this.modId = modId;
        this.name = name;
    }
    public static ItemGroupR builder(String modId, String name) {
        return new ItemGroupR(modId, name);
    }
    public ItemGroupR icon(Supplier<ItemStack> icon) {
        this.icon = icon;
        return this;
    }
    public ItemGroupR title(Component title) {
        this.title = title;
        return this;
    }
    public ItemGroupR entries(Consumer<CreativeModeTab.Output> entries) {
        this.entries1.add(entries);
        return this;
    }
    private ItemGroupR after(ResourceKey<CreativeModeTab> other) {
        this.after = other;
        return this;
    }
    public CreativeModeTab build() {
        ResourceKey<CreativeModeTab> key = ResourceKey.create(
                Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(modId, name)
        );
        CreativeModeTab.Builder fabricBuilder = FabricItemGroup.builder()
                .title(title)
                .icon(icon)
                .displayItems((_, out) -> entries1.forEach(p -> p.accept(out)));

        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, fabricBuilder.build());
    }
}
