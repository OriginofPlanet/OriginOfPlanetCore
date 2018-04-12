package com.op.opcore.bases;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 一个基本的合金类,可以作为一开始的合金来用
 */
public class BaseAlloy {
//  合金的具体参数及其数值
    private static Map<String, BaseMaterials> parameter;
//  合金所在的科技段
    private Integer times;
//    合金的状态
    private Integer status;

    private boolean canUse = false;

    private BaseMaterials materials = new BaseMaterials();
//  实例化合金时候必须添加的参数
    public BaseAlloy(Integer maxRange, Integer minRang, String parameterName){
        this.materials.addParamter(parameterName, minRang+"-"+maxRange);
    }

    public boolean alloyLock(Integer times){
        if (this.times.equals(times)){
            this.canUse=true;
            return true;
        }
        this.canUse = false;
        return false;
    }

    public static Map<String, BaseMaterials> getParameter() {
        return parameter;
    }

    public static void setParameter(Map<String, BaseMaterials> parameter) {
        BaseAlloy.parameter = parameter;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean isCanUse() {
        return canUse;
    }

    public void setCanUse(boolean canUse) {
        this.canUse = canUse;
    }

    public BaseMaterials getMaterials() {
        return materials;
    }

    public void setMaterials(BaseMaterials materials) {
        this.materials = materials;
    }
}
