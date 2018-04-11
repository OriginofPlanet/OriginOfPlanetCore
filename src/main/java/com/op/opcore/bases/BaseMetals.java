package com.op.opcore.bases;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 一个基本的合金类,可以作为一开始的合金来用
 */
public class BaseMetals extends Item {
//  唔......  ID  就这样
    private static final String __METAL = "OOP__000001";
//一个合金可以有多个组成材料   暂时放在list集合里
    private List<BaseMaterials> materials = new ArrayList<BaseMaterials>();
// 合金参数的大概范围
    private static Map<Integer, Integer> parameterRange = new HashMap<Integer, Integer>();
//  合金的具体参数及其数值
    private static Map<String, Map<Integer, Integer>> parameter = new HashMap<String, Map<Integer, Integer>>();

    private static final String STRENGTH = "strength";
    private static final String MELTINGPOINT = "melting point";
    private static final String RESISTANCE = "Resistance";

    static {
        parameterRange.put(0,0);
        parameter.put(STRENGTH, parameterRange);

    }

    public BaseMetals(BaseMaterials material, String parameterName, Integer maxParameterValue, Integer minParameterValue){
        this.materials.add(material);
        parameterRange.put(maxParameterValue, minParameterValue);
        parameter.put(parameterName, parameterRange);
    }

    public void registryMetals(BaseMaterials material, String parameterName, Integer maxParameterValue, Integer minParameterValue){
//        new BaseMetals(material, )
    }

}
