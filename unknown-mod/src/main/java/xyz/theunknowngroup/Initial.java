package xyz.theunknowngroup;

import xyz.theunknowngroup.block.ModBlocks;
import xyz.theunknowngroup.item.ModItemGroups;
import xyz.theunknowngroup.item.ModItems;

public class Initial {
    public static void initializeClasses() {
        ModBlocks.initialize();
        ModItems.initialize();
        ModItemGroups.initialize();
    }
}
