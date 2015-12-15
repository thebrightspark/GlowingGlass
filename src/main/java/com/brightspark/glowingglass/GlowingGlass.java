package com.brightspark.glowingglass;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.*;
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
    public static Block blockGlowingStainedGlass = new BlockStainedGlass(Material.glass).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName(Reference.BLOCK_STAINED_GLASS).setBlockTextureName("glass").setLightLevel(1.0f).setCreativeTab(GGCreativeTab.GG_TAB);
    public static Block blockGlowingGlassPane = new BlockGGPane();
    public static Block blockGlowingStainedGlassPane = new BlockStainedGlassPane().setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName(Reference.BLOCK_STAINED_GLASS_PANE).setBlockTextureName("glass").setLightLevel(1.0f).setCreativeTab(GGCreativeTab.GG_TAB);


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Block/Item Registry
        GameRegistry.registerBlock(blockGlowingGlass, Reference.BLOCK_GLASS);
        GameRegistry.registerBlock(blockGlowingStainedGlass, ItemBlockGGStained.class, Reference.BLOCK_STAINED_GLASS);
        GameRegistry.registerBlock(blockGlowingGlassPane, Reference.BLOCK_GLASS_PANE);
        GameRegistry.registerBlock(blockGlowingStainedGlassPane, ItemBlockGGStainedPane.class, Reference.BLOCK_STAINED_GLASS_PANE);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Recipes
        GameRegistry.addRecipe(new ItemStack(blockGlowingGlass), new Object[]{" x ", "xgx", " x ", 'x', Items.glowstone_dust, 'g', Blocks.glass});
        for(int i = 0; i <= 15; ++i)
        {
            GameRegistry.addRecipe(new ItemStack(blockGlowingStainedGlass, 1, i), new Object[]{" x ", "xgx", " x ", 'x', Items.glowstone_dust, 'g', new ItemStack(Blocks.stained_glass, 1, i)});
            GameRegistry.addRecipe(new ItemStack(blockGlowingStainedGlassPane, 16, i), new Object[]{"xxx", "xxx", 'x', new ItemStack(blockGlowingStainedGlass, 1, i)});
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
