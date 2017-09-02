package net.thedragonteam.blockyrewards.rewards;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.thedragonteam.blockyrewards.iface.IDefaultRewards;
import net.thedragonteam.blockyrewards.obj.Reward;
import net.thedragonteam.blockyrewards.obj.RewardChance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static net.thedragonteam.blockyrewards.BRConfig.*;

public class EndRewards implements IDefaultRewards {

    @Override
    public int getDimensionID() {
        return 1;
    }

    @Override
    public void registerEvent(Reward reward, World world, IBlockState state, EntityPlayer player) {
        Arrays.stream(rewardingEndBlocks).filter(resourceLocation ->
            state == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(resourceLocation)).getDefaultState()
        ).forEachOrdered(resourceLocation -> {
            if (enableEndItemBreakingEvent) {
                registerItemDamagingEvent(new RewardChance(reward.getI(), endItemBreakingValueToBeMatched), endItemBreakingMaxItemDamaging, player);
            }
            registerEnchantmentEvent(new RewardChance(reward.getI(), 1), player);
            if (enableEndSpawnHostileEvent) {
                registerHostileSpawnEvent(new RewardChance(reward.getI(), endSpawnHostileValueToBeMatched), this.getEndHostiles(world), player, world);
            }
        });
    }

    private List<Entity> getEndHostiles(World world) {
        return Arrays.stream(endSpawnHostileEntities).flatMap(registryName ->
            Stream.of(ForgeRegistries.ENTITIES.getValue(new ResourceLocation(registryName)).newInstance(world))
        ).collect(Collectors.toCollection(ArrayList::new));
    }

}
