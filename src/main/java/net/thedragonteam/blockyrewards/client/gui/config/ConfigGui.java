/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.blockyrewards.client.gui.config;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.thedragonteam.blockyrewards.Reference;

import java.util.ArrayList;
import java.util.List;

import static net.thedragonteam.blockyrewards.BlockyRewards.configuration;

public class ConfigGui extends GuiConfig {

    public ConfigGui(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(parentScreen), Reference.MODID, true, false,
            new TextComponentTranslation("gui." + Reference.MODID + ".config.title").getFormattedText());
    }

    private static List<IConfigElement> getConfigElements(GuiScreen parent) {
        List<IConfigElement> list = new ArrayList<>();
        list.add(new ConfigElement(configuration.getCategory("blocky_rewards")));
        return list;
    }
}