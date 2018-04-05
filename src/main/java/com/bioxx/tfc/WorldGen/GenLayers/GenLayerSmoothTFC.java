package com.bioxx.tfc.WorldGen.GenLayers;

import net.minecraft.world.gen.layer.GenLayer;

import com.bioxx.tfc.TerraFirmaCraft;

public class GenLayerSmoothTFC extends GenLayerTFC
{
	public GenLayerSmoothTFC(long par1, GenLayer par3GenLayer)
	{
		super(par1);
		super.parent = (GenLayerTFC) par3GenLayer;
	}

	/**
	 * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
	 * amounts, or biomeList[] indices based on the particular GenLayer subclass.
	 */
	@Override
	public int[] getInts(int par1, int par2, int par3, int par4)
	{
		int var5 = par1 - 1;
		int var6 = par2 - 1;
		int var7 = par3 + 2;
		int var8 = par4 + 2;
		int[] var9 = this.parent.getInts(var5, var6, var7, var8);
		int[] var10 = new int[par3 * par4];

		for (int var11 = 0; var11 < par4; ++var11)
		{
			for (int var12 = 0; var12 < par3; ++var12)
			{
				int var13 = var9[var12 + 0 + (var11 + 1) * var7];
				int var14 = var9[var12 + 2 + (var11 + 1) * var7];
				int var15 = var9[var12 + 1 + (var11 + 0) * var7];
				int var16 = var9[var12 + 1 + (var11 + 2) * var7];
				int var17 = var9[var12 + 1 + (var11 + 1) * var7];

				if (var13 == var14 && var15 == var16)
				{
					this.initChunkSeed(var12 + par1, var11 + par2);
					if (this.nextInt(2) == 0)
						var17 = var13;
					else
						var17 = var15;
				}
				else
				{
					if (var13 == var14)
						var17 = var13;
					if (var15 == var16)
						var17 = var15;
				}
				if(var17 < 0)
					try {
						throw new Exception();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						TerraFirmaCraft.LOG.catching(e);
					}
				var10[var12 + var11 * par3] = var17;
			}
		}
		return var10;
	}
}
