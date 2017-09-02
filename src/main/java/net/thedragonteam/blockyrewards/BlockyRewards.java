package net.thedragonteam.blockyrewards;


import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedragonteam.thedragonlib.config.ModConfigProcessor;

import static net.thedragonteam.blockyrewards.Reference.MODID;

@Mod(modid = Reference.MODID,
        name = Reference.MODNAME,
        version = Reference.VERSION,
        dependencies = Reference.DEPEND,
        updateJSON = Reference.UPDATE_JSON,
        guiFactory = Reference.GUI_FACTORY
)
public class BlockyRewards {

    public static ModConfigProcessor configProcessor = new ModConfigProcessor();
    public static Configuration configuration;

    @Instance(MODID)
    public static BlockyRewards instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        configuration = new Configuration(event.getSuggestedConfigurationFile());
        configProcessor.processConfig(BRConfig.class, configuration);
    }
}