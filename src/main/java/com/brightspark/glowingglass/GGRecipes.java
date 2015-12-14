package com.brightspark.glowingglass;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GGRecipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(GGBlocks.blockGlass), new Object[]{" x ", "xgx", " x ", 'x', Items.glowstone_dust, 'g', Blocks.glass});

        for(int i = 0; i <= 15; ++i)
        {
            //GameRegistry.addRecipe(new ItemStack(GGBlocks.blockGlass), new Object[]{" x ", "xgx", " x ", 'x', Items.glowstone_dust, 'g', new ItemStack(Blocks.stained_glass, 1, i)});
        }
    }
}
