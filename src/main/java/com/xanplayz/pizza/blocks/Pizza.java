package com.xanplayz.pizza.blocks;

import com.xanplayz.pizza.BlockInit;
import com.xanplayz.pizza.IHasModel;
import com.xanplayz.pizza.ItemInit;
import com.xanplayz.pizza.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class Pizza extends Block implements IHasModel{
	
	public Pizza(String name, Material material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(3f);
        setHarvestLevel("pickaxe", 1);




        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}

