package cjminecraft.bitofeverything.blocks;

import cjminecraft.bitofeverything.BitOfEverything;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopperBlock extends Block {

	public BlockCopperBlock(String unlocalizedName) {
		super(Material.rock);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(BitOfEverything.blocks);
	}

}
