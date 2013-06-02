package com.theaetherserver.slimeclasses.select;

import org.bukkit.entity.Player;

import com.theaetherserver.slimeclasses.configuration.Fishermen;

public class Fisherman {
	public static void selFisherman(Player player){
		Fishermen.addPlayer(player);
	}
}
