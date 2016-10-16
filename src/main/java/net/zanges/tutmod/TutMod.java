package net.zanges.tutmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.zanges.tutmod.proxy.IProxy;

/**
 * Created by Zanges.
 */

@Mod(modid = TutMod.modId, name = TutMod.name, version = TutMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class TutMod {
    public static final String modId = "tutmod";
    public static final String name = "TutorialMod";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static TutMod instance;

    @SidedProxy(clientSide = "net.zanges.tutmod.proxy.ClientProxy", serverSide = "net.zanges.tutmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
