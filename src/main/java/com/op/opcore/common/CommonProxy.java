package com.op.opcore.common;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    /**
     * 会在Mod初始化之前触发，主要用于物品/方块/模型等的注册
     *
     * Forge推荐在preInit阶段完成注册方块、物品等等操作
     * @param event
     */
    public void preInit(FMLPreInitializationEvent event){

    }

    /**
     * 会在Mod初始化是触发，主要用于注册合成表/熔炉配方，给其它Mod发送交互信息
     * @param event
     */
    public void init(FMLInitializationEvent event){

    }

    /**
     * 在所有Mod都初始化之后调用，这时候应该接收其他Mod发送的交互信息，并完成对Mod的设置。
     * @param event
     */
    public void postInit(FMLPostInitializationEvent event){

    }
}
