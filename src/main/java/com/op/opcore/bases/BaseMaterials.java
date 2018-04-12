package com.op.opcore.bases;

import net.minecraft.item.Item;

import java.util.List;
import java.util.Map;

public class BaseMaterials {
    public String Name;
    public Item MeltedItem;
    public Item Ingot;
    public boolean canUse;
    public List<String> paramters;
    public Map<String, String> range;

    public BaseMaterials() {
    }

    public BaseMaterials(String name) {
        this.canUse = true;
        this.Name = name;
    }

    public BaseMaterials(String name, Item m, Item i) {
        this(name);
        this.MeltedItem = m;
        this.Ingot = i;
    }

    public BaseMaterials(String name, Item meltedItem, Item ingot, List<String> paramters) {
        this(name);
        this.MeltedItem = meltedItem;
        this.Ingot = ingot;
        this.paramters = paramters;
    }

    public BaseMaterials(String name, Item m, Item i, boolean use) {
        this(name);
        this.MeltedItem = m;
        this.Ingot = i;
        this.canUse = use;
    }

    public void addParamter(String paramName, String range){
        this.paramters.add(paramName);
        this.range.put(paramName,range);
    }
}
