package com.brightspark.glowingglass;

import net.minecraft.block.Block;
import net.minecraft.item.ItemCloth;

public class ItemBlockGGStainedPane extends ItemCloth
{
    public ItemBlockGGStainedPane(Block block)
    {
        super(block);
        setUnlocalizedName(Reference.BLOCK_STAINED_GLASS_PANE);
    }
}
