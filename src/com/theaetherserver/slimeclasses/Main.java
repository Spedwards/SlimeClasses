package com.theaetherserver.slimeclasses;

import java.io.IOException;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.theaetherserver.slimeclasses.configuration.*;
import com.theaetherserver.slimeclasses.events.Chat;

public class Main extends JavaPlugin{
	private static Main instance;
	
	public void onEnable(){
		instance = this;
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new Chat(), this);
		
		getCommand("classlist").setExecutor(new Commands());
		getCommand("setclass").setExecutor(new Commands());
		
		try {
			Config.createConfig();
			Miners.createConfig();
			Farmers.createConfig();
			Fishermen.createConfig();
			Woodcutters.createConfig();
			Hunters.createConfig();
			Soldiers.createConfig();
			Admins.createConfig();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void onDisable(){
		instance = null;
	}
	
	public static Main inst(){
		return instance;
	}

}
