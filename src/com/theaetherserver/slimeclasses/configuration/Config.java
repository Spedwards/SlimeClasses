package com.theaetherserver.slimeclasses.configuration;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config {


	static File configFile = new File("plugins/SlimeClasses/config.yml");
	static File folder = new File("plugins/SlimeClasses");
	static FileConfiguration config = YamlConfiguration.loadConfiguration(configFile);
	
	public static void createConfig() throws IOException{
		if(!folder.exists())
			folder.mkdirs();
		
		if(!configFile.exists())
			configFile.createNewFile();
		
		String[] prefix = {"miner;&7", "fisherman;&1", "woodcutter;&5", "farmer;&3", "hunter;&4", "soldier;&4", "none;&f"};
		
		for(String opt: prefix){
			String[] spl = opt.split("\\;");
			String key = spl[0];
			String val = spl[1];
			
			if(config.getString("prefix." + key) == null){
				config.set("prefix." + key, val);
				config.save(configFile);
			}
		}
		
	}
}
