package com.brightspark.glowingglass;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

/**
 * This class is necessary to get around the protected constructor in BlockPane
 */
public class BlockGGPane extends BlockPane
{
    public BlockGGPane()
    {
        super("glass", "glass_pane_top", Material.glass, false);
        setHardness(0.3F);
        setStepSound(Block.soundTypeGlass);
        setBlockName(Reference.BLOCK_GLASS_PANE);
        setLightLevel(1.0f);
        setCreativeTab(GGCreativeTab.GG_TAB);
    }
}
