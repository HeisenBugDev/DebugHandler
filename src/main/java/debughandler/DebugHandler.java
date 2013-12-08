package debughandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "DebugHandler", name = "DebugHandler", version="@VERSION@")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DebugHandler {
    @Mod.Instance("Debug Handler")
    public static DebugHandler instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

    @Mod.EventHandler
    public void serverStop(FMLServerStoppingEvent event){

    }
}
