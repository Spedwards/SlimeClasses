package com.theaetherserver.slimeclasses.select;

import org.bukkit.entity.Player;

import com.theaetherserver.slimeclasses.configuration.Farmers;

public class Farmer {
	
	public static void selFarmer(Player player){
		Farmers.addPlayer(player);
	}

}
