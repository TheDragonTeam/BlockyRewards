package net.thedragonteam.blockyrewards;

import net.minecraft.init.Blocks;
import net.thedragonteam.thedragonlib.config.ModConfigProperty;

public class BRConfig {

    //Global
    @ModConfigProperty(category = "blocky_rewards", name = "debugMode", comment = "Enable/Disable debugMode")
    public static boolean debugMode = false;

    @ModConfigProperty(category = "blocky_rewards", name = "maxValueToBeMatched", comment = "Sets the maximum dimID that is possible to be achieved")
    public static int maxValueToBeMatched = 100;

    //Overworld
    @ModConfigProperty(category = "blocky_rewards.overworld", name = "rewardingOverworldBlocks", comment = "Set the blocks which would trigger the rewards (in the Overworld)")
    public static String[] rewardingOverworldBlocks = new String[]{
        Blocks.STONE.getRegistryName().toString()
    };

    @ModConfigProperty(category = "blocky_rewards.overworld.events.item_breaking", name = "enableOverworldItemBreakingEvent", comment = "Enable/Disable the Item Breaking Event from happening (in the Overworld)")
    public static boolean enableOverworldItemBreakingEvent = true;

    @ModConfigProperty(category = "blocky_rewards.overworld.events.item_breaking", name = "overworldItemBreakingValueToBeMatched", comment = "Sets the dimID that needs to be matched for the Item Breaking Event to trigger (in the Overworld)")
    public static int overworldItemBreakingValueToBeMatched = 0;

    @ModConfigProperty(category = "blocky_rewards.overworld.events.item_breaking", name = "overworldItemBreakingMaxItemDamaging", comment = "Sets the maximum dimID for the Item Breaking Event to damage the item (in the Overworld)")
    public static int overworldItemBreakingMaxItemDamaging = 10;

    @ModConfigProperty(category = "blocky_rewards.overworld.events.spawn_hostile", name = "enableOverworldSpawnHostileEvent", comment = "Enable/Disable the Spawn Hostile Event from happening (in the Overworld)")
    public static boolean enableOverworldSpawnHostileEvent = true;

    @ModConfigProperty(category = "blocky_rewards.overworld.events.spawn_hostile", name = "overworldSpawnHostileValueToBeMatched", comment = "Sets the dimID that needs to be matched for the Spawn Hostile Event to trigger (in the Overworld)")
    public static int overworldSpawnHostileValueToBeMatched = 2;

    @ModConfigProperty(category = "blocky_rewards.overworld.events.spawn_hostile", name = "enableOverworldSpawnHostileEvent", comment = "Set the entities which would spawn when the Spawn Hostile Event is triggered (in the Overworld)")
    public static String[] overworldSpawnHostileEntities = new String[]{
        "minecraft:zombie", "minecraft:skeleton", "minecraft:spider", "minecraft:cave_spider", "minecraft:silverfish", "minecraft:creeper"
    };

    //The Nether
    @ModConfigProperty(category = "blocky_rewards.the_nether", name = "rewardingNetherBlocks", comment = "Set the blocks which would trigger the rewards (in the Nether)")
    public static String[] rewardingNetherBlocks = new String[]{
        Blocks.NETHERRACK.getRegistryName().toString()
    };

    @ModConfigProperty(category = "blocky_rewards.the_nether.events.item_breaking", name = "enableNetherItemBreakingEvent", comment = "Enable/Disable the Item Breaking Event from happening (in the Nether)")
    public static boolean enableNetherItemBreakingEvent = true;

    @ModConfigProperty(category = "blocky_rewards.the_nether.events.item_breaking", name = "netherItemBreakingValueToBeMatched", comment = "Sets the dimID that needs to be matched for the Item Breaking Event to trigger (in the Nether)")
    public static int netherItemBreakingValueToBeMatched = 0;

    @ModConfigProperty(category = "blocky_rewards.the_nether.events.item_breaking", name = "netherItemBreakingMaxItemDamaging", comment = "Sets the maximum dimID for the Item Breaking Event to damage the item (in the Nether)")
    public static int netherItemBreakingMaxItemDamaging = 10;

    @ModConfigProperty(category = "blocky_rewards.the_nether.events.spawn_hostile", name = "enableNetherSpawnHostileEvent", comment = "Enable/Disable the Spawn Hostile Event from happening (in the Nether)")
    public static boolean enableNetherSpawnHostileEvent = true;

    @ModConfigProperty(category = "blocky_rewards.the_nether.events.spawn_hostile", name = "netherSpawnHostileValueToBeMatched", comment = "Sets the dimID that needs to be matched for the Spawn Hostile Event to trigger (in the Nether)")
    public static int netherSpawnHostileValueToBeMatched = 2;

    @ModConfigProperty(category = "blocky_rewards.the_nether.events.spawn_hostile", name = "netherSpawnHostileEntities", comment =  "Set the entities which would spawn when the Spawn Hostile Event is triggered (in the Nether)")
    public static String[] netherSpawnHostileEntities = new String[]{
        "minecraft:zombie_pigman", "minecraft:wither_skeleton", "minecraft:blaze", "minecraft:magma_cube", "minecraft:ghast"
    };

    //The End
    @ModConfigProperty(category = "blocky_rewards.the_end", name = "rewardingEndBlocks", comment = "Set the blocks which would trigger the rewards (in the End)")
    public static String[] rewardingEndBlocks = new String[]{
        Blocks.END_STONE.getRegistryName().toString()
    };

    @ModConfigProperty(category = "blocky_rewards.the_end.events.item_breaking", name = "enableEndItemBreakingEvent", comment = "Enable/Disable the Item Breaking Event from happening (in the End)")
    public static boolean enableEndItemBreakingEvent = true;

    @ModConfigProperty(category = "blocky_rewards.the_end.events.item_breaking", name = "endItemBreakingValueToBeMatched", comment = "Sets the dimID that needs to be matched for the Item Breaking Event to trigger (in the End)")
    public static int endItemBreakingValueToBeMatched = 0;

    @ModConfigProperty(category = "blocky_rewards.the_end.events.item_breaking", name = "endItemBreakingMaxItemDamaging", comment = "Sets the maximum dimID for the Item Breaking Event to damage the item (in the End)")
    public static int endItemBreakingMaxItemDamaging = 10;

    @ModConfigProperty(category = "blocky_rewards.the_end.events.spawn_hostile", name = "enableEndSpawnHostileEvent", comment = "Enable/Disable the Spawn Hostile Event from happening (in the End)")
    public static boolean enableEndSpawnHostileEvent = true;

    @ModConfigProperty(category = "blocky_rewards.the_end.events.spawn_hostile", name = "endSpawnHostileValueToBeMatched", comment = "Sets the dimID that needs to be matched for the Spawn Hostile Event to trigger (in the End)")
    public static int endSpawnHostileValueToBeMatched = 2;

    @ModConfigProperty(category = "blocky_rewards.the_end.events.spawn_hostile", name = "endSpawnHostileEntities", comment =  "Set the entities which would spawn when the Spawn Hostile Event is triggered (in the End)")
    public static String[] endSpawnHostileEntities = new String[]{
        "minecraft:enderman", "minecraft:endermite", "minecraft:shulker"
    };

}
