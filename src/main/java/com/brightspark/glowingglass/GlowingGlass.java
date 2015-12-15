package com.brightspark.glowingglass;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCloth;
import net.minecraft.item.ItemStack;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class GlowingGlass
{
    @Mod.Instance(Reference.MOD_ID)
    public static GlowingGlass instance;

    //Blocks
    public static Block blockGlowingGlass = new BlockGlass(Material.glass, false).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName(Reference.BLOCK_GLASS).setBlockTextureName("glass").setLightLevel(1.0f).setCreativeTab(GGCreativeTab.GG_TAB);
    public static Block blockGlowingStainedGlass = new BlockGGStained();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Block/Item Registry
        GameRegistry.registerBlock(blockGlowingGlass, Reference.BLOCK_GLASS);
        GameRegistry.registerBlock(blockGlowingStainedGlass, ItemBlockGGStained.class, Reference.BLOCK_STAINED_GLASS);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Recipes
        GameRegistry.addRecipe(new ItemStack(blockGlowingGlass), new Object[]{" x ", "xgx", " x ", 'x', Items.glowstone_dust, 'g', Blocks.glass});
        for(int i = 0; i <= 15; ++i)
        {
            //GameRegistry.addRecipe(new ItemStack(GGBlocks.blockGlowingGlass), new Object[]{" x ", "xgx", " x ", 'x', Items.glowstone_dust, 'g', new ItemStack(Blocks.stained_glass, 1, i)});
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
