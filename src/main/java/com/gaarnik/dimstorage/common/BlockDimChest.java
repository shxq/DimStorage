package com.gaarnik.dimstorage.common;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.gaarnik.dimstorage.DimStorage;
import com.gaarnik.dimstorage.DimStorageGUIHandler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDimChest extends BlockContainer {
	// ****************************************************************
	
	// ****************************************************************

	// ****************************************************************
	public BlockDimChest(int id) {
		super(id, Material.rock);
		
		this.setHardness(20F);
		this.setResistance(100F);
		this.setStepSound(soundStoneFootstep);
		
		this.setCreativeTab(DimStorage.tabDimStorage);
	}

	// ****************************************************************
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int idk, float what, float these, float are) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

		if (tileEntity == null || player.isSneaking())
			return false;

		player.openGui(DimStorage.instance, DimStorageGUIHandler.GUI_DIMCHEST, world, x, y, z);

		return true;
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
		int dir = MathHelper.floor_double((double)((player.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, dir, 0);
	}

	// ****************************************************************
	@SideOnly(Side.CLIENT)
	@Override
	public boolean shouldSideBeRendered(IBlockAccess par1iBlockAccess, int par2, int par3, int par4, int par5) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	// ****************************************************************

	// ****************************************************************
	@Override
	public TileEntity createNewTileEntity(World world) { return new TEDimChest(); }

}
