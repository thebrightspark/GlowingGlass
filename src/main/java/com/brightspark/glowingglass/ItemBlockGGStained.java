package com.brightspark.glowingglass;

import net.minecraft.block.Block;
import net.minecraft.item.ItemCloth;

public class ItemBlockGGStained extends ItemCloth
{
    public ItemBlockGGStained(Block block)
    {
        super(block);
        setUnlocalizedName("glowingStainedGlass");
    }
}
