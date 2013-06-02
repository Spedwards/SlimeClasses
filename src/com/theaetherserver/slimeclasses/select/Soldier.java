package com.theaetherserver.slimeclasses.select;

import org.bukkit.entity.Player;

import com.theaetherserver.slimeclasses.configuration.Soldiers;

public class Soldier {
	public static void selSoldier(Player player){
		Soldiers.addPlayer(player);
	}
}
