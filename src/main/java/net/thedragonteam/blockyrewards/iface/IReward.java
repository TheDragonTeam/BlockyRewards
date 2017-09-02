package net.thedragonteam.blockyrewards.iface;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.thedragonteam.blockyrewards.obj.Reward;

public interface IReward {

    int getDimensionID();

    void registerEvent(Reward reward, World world, IBlockState state, EntityPlayer player);
}
