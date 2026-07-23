package io.github.theunknowngroup.item;

import net.minecraft.world.item.Item;
import io.github.theunknowngroup.register.ItemR;

import static com.mojang.text2speech.Narrator.LOGGER;
import static io.github.theunknowngroup.UnknownMod.MOD_ID;
import static io.github.theunknowngroup.UnknownMod.MOD_NAME;

public class ModItems {
    public static final Item UNKNOWN_ITEM = ItemR.registerItem(MOD_ID, "unknown_item",
            Item::new, new Item.Properties().stacksTo(1));

    public static void initialize() {
        LOGGER.info("[{}] Registering & initializing mod items for {}", MOD_NAME, MOD_ID);
    }
}
