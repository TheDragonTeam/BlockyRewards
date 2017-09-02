package net.thedragonteam.blockyrewards.events;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.blockyrewards.Reference;

@EventBusSubscriber(value = Side.CLIENT, modid = Reference.MODID)
@SideOnly(Side.CLIENT)
public class ClientEventHandler {
}
