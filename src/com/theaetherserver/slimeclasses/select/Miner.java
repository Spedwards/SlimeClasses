package com.theaetherserver.slimeclasses.select;

import org.bukkit.entity.Player;

import com.theaetherserver.slimeclasses.configuration.Miners;

public class Miner {
	
	public static void selMiner(Player player){
		Miners.addPlayer(player);
	}
}
