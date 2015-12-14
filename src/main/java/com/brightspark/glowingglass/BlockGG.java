package com.brightspark.glowingglass;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

public class BlockGG extends BlockGlass
{
    public BlockGG()
    {
        super(Material.glass, false);
        setCreativeTab(GGCreativeTab.GG_TAB);
        setBlockTextureName("glass");
        setBlockName(Reference.BLOCK_GLASS);
        setHardness(0.3F);
        setStepSound(soundTypeGlass);
        setLightLevel(1.0f);
    }
}
