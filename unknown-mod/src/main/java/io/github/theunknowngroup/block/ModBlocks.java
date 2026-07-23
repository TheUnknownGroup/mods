package io.github.theunknowngroup.block;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import io.github.theunknowngroup.register.BlockR;

import static com.mojang.text2speech.Narrator.LOGGER;
import static io.github.theunknowngroup.UnknownMod.MOD_ID;
import static io.github.theunknowngroup.UnknownMod.MOD_NAME;

public class ModBlocks {
    public static final Block UNKNOWN_BLOCK = BlockR.registerBlock(MOD_ID,
            "unknown_block", Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE), new Item.Properties().stacksTo(64));

    public static void initialize() {
        LOGGER.info("[{}] Registering mod blocks for {}", MOD_NAME, MOD_ID);
    }
}
