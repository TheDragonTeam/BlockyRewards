package net.thedragonteam.blockyrewards.events;

import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thedragonteam.blockyrewards.BRConfig;
import net.thedragonteam.blockyrewards.Reference;
import net.thedragonteam.blockyrewards.iface.IReward;
import net.thedragonteam.blockyrewards.obj.Reward;
import net.thedragonteam.blockyrewards.rewards.EndRewards;
import net.thedragonteam.blockyrewards.rewards.NetherRewards;
import net.thedragonteam.blockyrewards.rewards.OverworldRewards;
import net.thedragonteam.thedragonlib.util.LogHelper;

import java.util.Arrays;
import java.util.Random;

import static net.thedragonteam.blockyrewards.BlockyRewards.configuration;

@EventBusSubscriber(modid = Reference.MODID)
public class WorldEventHandler {

    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent e) {
        registerEvents(e,
            new OverworldRewards(), new NetherRewards(), new EndRewards()
        );
    }

    private static void registerEvents(BlockEvent.BreakEvent e, IReward... rewards) {
        Random random = new Random();
        int bound = BRConfig.maxValueToBeMatched;
        int i = random.nextInt(bound);
        if (BRConfig.debugMode) LogHelper.info(i);
        Arrays.stream(rewards).filter(reward ->
            e.getWorld().provider.getDimension() == reward.getDimensionID()
        ).forEachOrdered(reward ->
            reward.registerEvent(new Reward(i), e.getWorld(), e.getState(), e.getPlayer())
        );
    }

    @SubscribeEvent
    public static void onEntityAttacked(AttackEntityEvent e) {

    }

    @SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        syncConfig();
        LogHelper.info("Refreshing configuration file");
    }

    private static void syncConfig() {
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
