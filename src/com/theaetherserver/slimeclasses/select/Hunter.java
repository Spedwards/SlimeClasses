package com.theaetherserver.slimeclasses.select;

import org.bukkit.entity.Player;

import com.theaetherserver.slimeclasses.configuration.Hunters;

public class Hunter {
	public static void selHunter(Player player){
		Hunters.addPlayer(player);
	}
}
