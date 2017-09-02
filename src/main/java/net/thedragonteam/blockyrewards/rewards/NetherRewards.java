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

public class NetherRewards implements IDefaultRewards {

    @Override
    public int getDimensionID() {
        return -1;
    }

    @Override
    public void registerEvent(Reward reward, World world, IBlockState state, EntityPlayer player) {
        Arrays.stream(rewardingNetherBlocks).filter(resourceLocation ->
            state == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(resourceLocation)).getDefaultState()
        ).forEachOrdered(resourceLocation -> {
            if (enableNetherItemBreakingEvent) {
                registerItemDamagingEvent(new RewardChance(reward.getI(), netherItemBreakingValueToBeMatched), netherItemBreakingMaxItemDamaging, player);
            }
            registerEnchantmentEvent(new RewardChance(reward.getI(), 1), player);
            if (enableNetherSpawnHostileEvent) {
                registerHostileSpawnEvent(new RewardChance(reward.getI(), netherSpawnHostileValueToBeMatched), this.getNetherHostiles(world), player, world);
            }
        });
    }

    private List<Entity> getNetherHostiles(World world) {
        return Arrays.stream(netherSpawnHostileEntities).flatMap((String registryName) ->
            Stream.of(ForgeRegistries.ENTITIES.getValue(new ResourceLocation(registryName)).newInstance(world))
        ).collect(Collectors.toCollection(ArrayList::new));
    }

}
