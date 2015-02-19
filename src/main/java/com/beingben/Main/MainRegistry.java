package com.beingben.Main;

import net.minecraftforge.common.MinecraftForge;

import com.beingben.lib.RefStrings;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME , version = RefStrings.VERSION )
public class MainRegistry {
		
	TFCGrassDropsEventHandler events = new TFCGrassDropsEventHandler();
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){

	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(events);
    	MinecraftForge.EVENT_BUS.register(events);		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}

}
