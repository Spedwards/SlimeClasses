package com.theaetherserver.slimeclasses.configuration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class Admins {


	static File configFile = new File("plugins/SlimeClasses/admins.yml");
	static File folder = new File("plugins/SlimeClasses");
	static FileConfiguration config = YamlConfiguration.loadConfiguration(configFile);
	
	public static void createConfig() throws IOException{
		if(!folder.exists())
			folder.mkdirs();
		
		if(!configFile.exists())
			configFile.createNewFile();
		
		if(config.getString("admins") == null){
			List<String> admins = new ArrayList<String>();
			admins.add("Pink__Slime");
			config.set("admins", admins);
			config.save(configFile);
		}
	}
	
	public static boolean isAdmin(Player player){
		List<String> list = config.getStringList("admins");
		if(list.contains(player.getName())){
			return true;
		}else{
			return false;
		}
	}
}
