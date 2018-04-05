package com.bioxx.tfc.WorldGen.GenLayers.DataLayers.Rain;

import com.bioxx.tfc.WorldGen.GenLayers.GenLayerTFC;

public class GenLayerRainInit extends GenLayerTFC
{
	public GenLayerRainInit(long par1)
	{
		super(par1);
	}

	/**
	 * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
	 * amounts, or biomeList[] indices based on the particular GenLayer subclass.
	 */
	@Override
	public int[] getInts(int par1, int par2, int maxX, int maxZ)
	{
		int[] outCache = new int[maxX * maxZ];

		for (int z = 0; z < maxZ; ++z)
		{
			for (int x = 0; x < maxX; ++x)
			{
				this.initChunkSeed(par1 + x, par2 + z);
				int out = GenRainLayerTFC.DRY + this.nextInt(6);

				if(out == GenRainLayerTFC.DRY && this.nextInt(12) == 0)
					out--;
				if(out == GenRainLayerTFC.WET && this.nextInt(12) == 0)
					out++;

				outCache[x + z * maxX] = out;
			}
		}

		return outCache;
	}
}
