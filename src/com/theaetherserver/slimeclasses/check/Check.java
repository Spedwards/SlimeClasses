package com.theaetherserver.slimeclasses.check;

import java.util.List;

import org.bukkit.entity.Player;

import com.theaetherserver.slimeclasses.configuration.Farmers;
import com.theaetherserver.slimeclasses.configuration.Fishermen;
import com.theaetherserver.slimeclasses.configuration.Hunters;
import com.theaetherserver.slimeclasses.configuration.Miners;
import com.theaetherserver.slimeclasses.configuration.Soldiers;
import com.theaetherserver.slimeclasses.configuration.Woodcutters;

public class Check {
	static List<String> miners = Miners.config.getStringList("miners");
	static List<String> fishermen = Fishermen.config.getStringList("fishermen");
	static List<String> woodcutters = Woodcutters.config.getStringList("woodcutters");
	static List<String> farmers = Farmers.config.getStringList("farmers");
	static List<String> hunters = Hunters.config.getStringList("hunters");
	static List<String> soldiers = Soldiers.config.getStringList("soldiers");
	
	public static boolean isMiner(Player player){
		if(miners.contains(player.getName())){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isFisherman(Player player){
		if(fishermen.contains(player.getName())){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isWoodcutter(Player player){
		if(woodcutters.contains(player.getName())){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isFarmer(Player player){
		if(farmers.contains(player.getName())){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isHunter(Player player){
		if(hunters.contains(player.getName())){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isSoldier(Player player){
		if(soldiers.contains(player.getName())){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean hasClass(Player player){
		if(isMiner(player)){
			return true;
		}else if(isFisherman(player)){
			return true;
		}else if(isWoodcutter(player)){
			return true;
		}else if(isFarmer(player)){
			return true;
		}else if(isHunter(player)){
			return true;
		}else if(isSoldier(player)){
			return true;
		}else{
			return false;
		}
	}
}
