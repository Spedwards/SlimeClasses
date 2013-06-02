package com.theaetherserver.slimeclasses.configuration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class Miners {


	static File configFile = new File("plugins/SlimeClasses/miner.yml");
	static File folder = new File("plugins/SlimeClasses");
	public static FileConfiguration config = YamlConfiguration.loadConfiguration(configFile);
	
	public static void createConfig() throws IOException{
		if(!folder.exists())
			folder.mkdirs();
		
		if(!configFile.exists())
			configFile.createNewFile();
		
		if(config.getStringList("miners") == null){
			List<String> list = new ArrayList<String>();
			list.add("DO NOT REMOVE");
			config.set("miners", list);
			config.save(configFile);
		}
	}
	
	public static void addPlayer(Player player){
		List<String> players = config.getStringList("miners");
		if(players.contains(player.getName())){
			return;
		}else{
			players.add(player.getName());
			player.sendMessage("You have been added to Miners");
		}
	}
	
	public static void remPlayer(Player player){
		List<String> players = config.getStringList("miners");
		if(players.contains(player.getName())){
			players.remove(player.getName());
		}else{
			return;
		}
	}
}
