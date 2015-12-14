package com.brightspark.glowingglass;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GGCreativeTab
{
    public static final CreativeTabs GG_TAB = new CreativeTabs(Reference.MOD_ID)
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
            return Reference.MOD_NAME;
        }
    };
}
