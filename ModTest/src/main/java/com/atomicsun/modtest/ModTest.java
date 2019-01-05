package com.atomicsun.modtest;

import com.atomicsun.modtest.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ModTest
{
     private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        logger = event.getModLog();
        System.out.println(Reference.MODID + ":PreInit");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println(Reference.MODID + ":Init");
        ModItems.init();
    }

    @EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        System.out.println(Reference.MODID + ":" + "PostInit");


    }

    @Instance
    public static ModTest instance;

}
