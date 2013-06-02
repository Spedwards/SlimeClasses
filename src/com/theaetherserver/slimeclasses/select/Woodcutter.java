package com.theaetherserver.slimeclasses.select;

import org.bukkit.entity.Player;

import com.theaetherserver.slimeclasses.configuration.Woodcutters;

public class Woodcutter {
	public static void selWoodcutter(Player player){
		Woodcutters.addPlayer(player);
	}
}
