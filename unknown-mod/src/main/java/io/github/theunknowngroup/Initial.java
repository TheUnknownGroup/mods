package io.github.theunknowngroup;

import io.github.theunknowngroup.block.ModBlocks;
import io.github.theunknowngroup.item.ModItemGroups;
import io.github.theunknowngroup.item.ModItems;

public class Initial {
    public static void initializeClasses() {
        ModBlocks.initialize();
        ModItems.initialize();
        ModItemGroups.initialize();
    }
}
