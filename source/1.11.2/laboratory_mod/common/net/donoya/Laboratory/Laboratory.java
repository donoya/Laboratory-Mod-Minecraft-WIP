package net.donoya.Laboratory;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = Laboratory.MOD_ID, name = Laboratory.MOD_NAME, version = Laboratory.VERSION, dependencies = Laboratory.DEPENDENCIES)
public class Laboratory {
	public static final String MOD_ID = "lab_mod";
	public static final String MOD_NAME = "Laboratory Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2228.);after:";
	public static final String RESOURCE_PREFIX = MOD_ID + ":"; //lab_mod:
	
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static Laboratory instance;
	
	@SidedProxy(clientSide="net.donoya.Laboratory.clientProxy", serverSide="net.donoya.Laboratory.commonProxy")
	public static commonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.PreInit(event);
	}
	public void Init(FMLInitializationEvent event){
		proxy.Init(event);
	}
	public void PostInit(FMLPostInitializationEvent event){
		proxy.PostInit(event);
	}
}
