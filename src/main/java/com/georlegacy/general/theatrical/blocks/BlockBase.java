package com.georlegacy.general.theatrical.blocks;

import com.georlegacy.general.theatrical.TheatricalMain;
import com.georlegacy.general.theatrical.entities.core.IHasModel;
import com.georlegacy.general.theatrical.init.TheatricalBlocks;
import com.georlegacy.general.theatrical.tabs.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockBase extends Block implements IHasModel {

  public BlockBase(String name) {
    super(Material.ROCK);
    setUnlocalizedName(name);
    setCreativeTab(CreativeTabs.mainTab);
    setRegistryName(name);

    TheatricalBlocks.BLOCKS.add(this);
  }


  @Override
  public void registerModels() {
    TheatricalMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
  }
}
