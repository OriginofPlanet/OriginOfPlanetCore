package com.OOPC.originOfPlanet;

import com.OOPC.originOfPlanet.common.CommonProxy;
import cpw.mods.fml.common.SidedProxy;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = OriginOfPlanet.MODID, version = OriginOfPlanet.VERSION)
public class OriginOfPlanet {
//    modID
    public static final String MODID = "oopc";
//    mod版本
    public static final String VERSION = "1.0";
//    mod名称
    public static final String modName = "Origin Of Planet";
//    mod开发者名单
//    public List authorList = new ArrayList();

    /**
     * 实例化代理
     */
    @SidedProxy(serverSide = "com.OOPC.originOfPlanet.common.CommonProxy",
            clientSide = "com.OOPC.originOfPlanet.client.ClientProxy")
    public static CommonProxy proxy;

    /**
     * 实例化mod主类
     */
    @Mod.Instance(MODID)
    public static OriginOfPlanet instance;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
