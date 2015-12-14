package com.brightspark.glowingglass;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class GGBlocks
{
    public static Block blockGlass = new BlockGG();
    public static Block blockStainedGlass = new BlockGGStained();

    public static void init()
    {
        GameRegistry.registerBlock(blockGlass, Reference.BLOCK_GLASS);
        GameRegistry.registerBlock(blockStainedGlass, Reference.BLOCK_STAINED_GLASS);
    }
}
