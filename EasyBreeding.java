package easybreeding.common;
 
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.EventBus;

@Mod(modid="EasyBreeding", name="EasyBreeding", version="1.1")
public class EasyBreeding
{
	@Mod.Init
	public void load(FMLInitializationEvent evt)
	{
		MinecraftForge.EVENT_BUS.register(new droppedFoodEventHandler());
	}
}