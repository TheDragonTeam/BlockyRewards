package net.thedragonteam.blockyrewards.iface;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.thedragonteam.blockyrewards.obj.RewardChance;

import java.util.List;

import static net.minecraft.enchantment.EnchantmentHelper.getEnchantments;

public interface IDefaultRewards extends IReward {

    default void registerItemDamagingEvent(RewardChance chance, int maxAmountToDamage, EntityPlayer player) {
        ItemStack mainHand = player.getHeldItemMainhand();
        if (chance.getI() == chance.getValueToMatch()) {
            mainHand.damageItem(chance.getRandom().nextInt(maxAmountToDamage) + 1, player);
        }
    }

    default void registerEnchantmentEvent(RewardChance chance, EntityPlayer player) {
        ItemStack mainHand = player.getHeldItemMainhand();

        List<Enchantment> enchantmentsList = ForgeRegistries.ENCHANTMENTS.getValues();
        int randomEnchantment = chance.getRandom().nextInt(enchantmentsList.size());
        Enchantment enchantment = enchantmentsList.get(randomEnchantment);
        int enchantmentLevel = 1;

        if (chance.getI() == chance.getValueToMatch()) {
            if (!getEnchantments(mainHand).keySet().contains(enchantment) && enchantment.type != null && enchantment.type.canEnchantItem(mainHand.getItem())) {
                mainHand.addEnchantment(enchantment, enchantmentLevel);
            }
        }
    }

    default void registerHostileSpawnEvent(RewardChance chance, List<Entity> hostiles, EntityPlayer player, World world) {
        if (chance.getI() == chance.getValueToMatch()) {
            Entity entity = hostiles.get(chance.getRandom().nextInt(hostiles.size()));
            if (entity != null) {
                entity.setPositionAndUpdate(player.posX, player.posY, player.posZ);
                world.spawnEntity(entity);
            }
        }
    }
}
