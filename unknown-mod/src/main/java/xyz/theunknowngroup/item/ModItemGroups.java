package xyz.theunknowngroup.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import xyz.theunknowngroup.block.ModBlocks;
import xyz.theunknowngroup.register.ItemGroupR;

import static com.mojang.text2speech.Narrator.LOGGER;
import static xyz.theunknowngroup.UnknownMod.MOD_ID;
import static xyz.theunknowngroup.UnknownMod.MOD_NAME;

public class ModItemGroups {
    public static final CreativeModeTab UNKNOWN = ItemGroupR.builder(MOD_ID, "unknown")
            .icon(() -> new ItemStack(ModItems.UNKNOWN_ITEM))
            .title(Component.literal("Unknown Mod Tab"))
            .entries((out) -> {
                out.accept(ModItems.UNKNOWN_ITEM);
                out.accept(ModBlocks.UNKNOWN_BLOCK);
            })
            .build();

    public static void initialize() {
        LOGGER.info("[{}] Registering & initializing mod item group for {}", MOD_NAME, MOD_ID);
    }
}
