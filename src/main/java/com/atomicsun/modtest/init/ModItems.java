// Class for initialising Items//
package com.atomicsun.modtest.init;

//Imports from minecraft/forge//
import com.atomicsun.modtest.items.ItemBasic;
import net.minecraft.item.Item;
//Imports from java//
import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>(); //creates an array list for items//
    public static final Item SHORT_SWORD = new ItemBasic("short_sword");

    }
}
