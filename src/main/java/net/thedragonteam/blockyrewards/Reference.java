package net.thedragonteam.blockyrewards;

public class Reference {

    public static final String MCVERSION = "1.12.1";
    public static final int MAJOR = 1;
    public static final int MINOR = 0;
    public static final int PATCH = 0;
    public static final String VERSION = MCVERSION + "-" + MAJOR + "." + MINOR + "." + PATCH;
    public static final String MODID = "blockyrewards";
    public static final String MODNAME = "Blocky Rewards";
    public static final String UPDATE_JSON = "https://download.nodecdn.net/containers/thedragonteam/blockyrewards-updater.json";
    public static final String DEPEND = "required-after:forge@[14.22.0.2462,);" +
            "required-after:thedragonlib@[1.12.1-5.0.0,)";
    public static final String GUI_FACTORY = "net.thedragonteam.blockyrewards.client.gui.config.ConfigGuiFactory";

}
