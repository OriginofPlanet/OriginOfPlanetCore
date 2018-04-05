package com.bioxx.tfc.WorldGen.GenLayers.DataLayers.Stability;

import com.bioxx.tfc.WorldGen.DataLayer;
import com.bioxx.tfc.WorldGen.GenLayers.GenLayerTFC;

public class GenLayerStabilityInit extends GenLayerTFC
{
	public GenLayerStabilityInit(long par1)
	{
		super(par1);
	}

	@Override
	public int[] getInts(int par1, int par2, int maxX, int maxZ)
	{
		int[] cache = new int[maxX * maxZ];

		for (int z = 0; z < maxZ; ++z)
		{
			for (int x = 0; x < maxX; ++x)
			{
				this.initChunkSeed(par1 + x, par2 + z);
				cache[x + z * maxX] = this.nextInt(3) == 0 ? DataLayer.SEISMIC_UNSTABLE.layerID : DataLayer.SEISMIC_STABLE.layerID;
			}
		}

		return cache;
	}
}
