package com.atomicsun.modtest.init;

import com.atomicsun.modtest.Reference;
import com.atomicsun.modtest.items.ItemBasic;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= Reference.MODID)

public class ModItems {

    static Item ShortSword;

    public static void init(){
        ShortSword = new ItemBasic("Short_Sword");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ShortSword);
    }



}
