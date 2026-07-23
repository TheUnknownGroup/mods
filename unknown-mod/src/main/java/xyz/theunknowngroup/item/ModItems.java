package xyz.theunknowngroup.item;

import net.minecraft.world.item.Item;
import xyz.theunknowngroup.register.ItemR;

import static com.mojang.text2speech.Narrator.LOGGER;
import static xyz.theunknowngroup.UnknownMod.MOD_ID;
import static xyz.theunknowngroup.UnknownMod.MOD_NAME;

public class ModItems {
    public static final Item UNKNOWN_ITEM = ItemR.registerItem(MOD_ID, "unknown_item",
            Item::new, new Item.Properties().stacksTo(1));

    public static void initialize() {
        LOGGER.info("[{}] Registering & initializing mod items for {}", MOD_NAME, MOD_ID);
    }
}
