package com.op.opcore;

import com.op.opcore.common.CommonProxy;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
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
    @SidedProxy(serverSide = "com.op.opcore.common.CommonProxy",
            clientSide = "com.op.opcore.client.ClientProxy")
    public static CommonProxy proxy;

    /**
     * 实例化mod主类
     */
    @Mod.Instance(MODID)
    public static OriginOfPlanet instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        proxy.init(event);
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
