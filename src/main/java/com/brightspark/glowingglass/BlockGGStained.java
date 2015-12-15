package com.brightspark.glowingglass;

import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.material.Material;

public class BlockGGStained extends BlockStainedGlass
{
    public BlockGGStained()
    {
        super(Material.glass);
        setCreativeTab(GGCreativeTab.GG_TAB);
        setBlockTextureName("glass");
        setBlockName(Reference.BLOCK_STAINED_GLASS);
        setHardness(0.3F);
        setStepSound(soundTypeGlass);
        setLightLevel(1.0f);
    }
}
