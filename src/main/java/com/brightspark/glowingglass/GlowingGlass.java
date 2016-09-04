package com.brightspark.glowingglass;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCloth;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

@Mod(modid = GlowingGlass.MOD_ID, name = GlowingGlass.MOD_NAME, version = GlowingGlass.VERSION)
public class GlowingGlass
{
    public static final String MOD_ID = "GlowingGlass";
    public static final String MOD_NAME = "Glowing Glass";
    public static final String VERSION = "1.7.10-1.1";

    @Mod.Instance(MOD_ID)
    public static GlowingGlass instance;

    public static final CreativeTabs GG_TAB = new CreativeTabs(MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return new ItemStack(Blocks.stained_glass).getItem();
        }

        //Sets the metadata of the item to be displayed
        @Override
        public int func_151243_f()
        {
            return 11;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return MOD_NAME;
        }
    };

    //Blocks
    public static Block blockGlowingGlass = new BlockGlass(Material.glass, false).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("glowingGlass").setBlockTextureName("glass").setLightLevel(1.0f).setCreativeTab(GG_TAB);
    public static Block blockGlowingStainedGlass = new BlockStainedGlass(Material.glass).setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("glowingStainedGlass").setBlockTextureName("glass").setLightLevel(1.0f).setCreativeTab(GG_TAB);
    public static Block blockGlowingGlassPane = new BlockGGPane().setBlockName("glowingGlassPane");
    public static Block blockGlowingStainedGlassPane = new BlockStainedGlassPane().setHardness(0.3F).setStepSound(Block.soundTypeGlass).setBlockName("glowingStainedGlassPane").setBlockTextureName("glass").setLightLevel(1.0f).setCreativeTab(GG_TAB);

    //Unlocalised names list
    //public static String[] unlocNames = {"tile.dirt"};

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Block/Item Registry
        GameRegistry.registerBlock(blockGlowingGlass, "glowingGlass");
        GameRegistry.registerBlock(blockGlowingStainedGlass, ItemBlockGGStained.class, "glowingStainedGlass");
        GameRegistry.registerBlock(blockGlowingGlassPane, "glowingGlassPane");
        GameRegistry.registerBlock(blockGlowingStainedGlassPane, ItemBlockGGStainedPane.class, "glowingStainedGlassPane");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Recipes
        GameRegistry.addRecipe(new ItemStack(blockGlowingGlass), " x ", "xgx", " x ", 'x', Items.glowstone_dust, 'g', Blocks.glass);
        for(int i = 0; i <= 15; ++i)
        {
            GameRegistry.addRecipe(new ItemStack(blockGlowingStainedGlass, 1, i), " x ", "xgx", " x ", 'x', Items.glowstone_dust, 'g', new ItemStack(Blocks.stained_glass, 1, i));
            GameRegistry.addRecipe(new ItemStack(blockGlowingStainedGlassPane, 16, i), "xxx", "xxx", 'x', new ItemStack(blockGlowingStainedGlass, 1, i));
        }

        //Test code:
        /*
        ArrayList<Block> blocks = new ArrayList<Block>();
        for(String s : unlocNames)
        {
            Block thisBlock = GameRegistry.findBlock("minecraft", s);
        }
        */
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
