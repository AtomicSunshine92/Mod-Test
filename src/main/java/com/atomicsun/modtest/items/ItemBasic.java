package com.atomicsun.modtest.items;


import com.atomicsun.modtest.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBasic extends Item implements IHasModel {

    public ItemBasic(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    public void registerModels() {

    }
}