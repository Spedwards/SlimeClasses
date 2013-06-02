package com.theaetherserver.slimeclasses.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.theaetherserver.slimeclasses.Main;
import com.theaetherserver.slimeclasses.check.Check;
import com.theaetherserver.slimeclasses.configuration.Admins;

public class Chat implements Listener{
	
	@EventHandler
	public void chatEvent(AsyncPlayerChatEvent e){
		Player player = e.getPlayer();
		String msg = e.getMessage();
		if(Check.isMiner(player)){
			String base = ChatColor.translateAlternateColorCodes('&', Main.inst().getConfig().getString("prefix.miner"));
			e.setFormat(base + "[Miner] " + isRank(player) + base + ": " + msg);
		}else if(Check.isFisherman(player)){
			String base = ChatColor.translateAlternateColorCodes('&', Main.inst().getConfig().getString("prefix.fisherman"));
			e.setFormat(base + "[Fisherman] " + isRank(player) + base + ": " + msg);
		}else if(Check.isFarmer(player)){
			String base = ChatColor.translateAlternateColorCodes('&', Main.inst().getConfig().getString("prefix.farmer"));
			e.setFormat(base + "[Farmer] " + isRank(player) + base + ": " + msg);
		}else if(Check.isWoodcutter(player)){
			String base = ChatColor.translateAlternateColorCodes('&', Main.inst().getConfig().getString("prefix.woodcutter"));
			e.setFormat(base + "[Woodcutter] " + isRank(player) + base + ": " + msg);
		}else if(Check.isHunter(player)){
			String base = ChatColor.translateAlternateColorCodes('&', Main.inst().getConfig().getString("prefix.hunter"));
			e.setFormat(base + "[Hunter] " + isRank(player) + base + ": " + msg);
		}else if(Check.isSoldier(player)){
			String base = ChatColor.translateAlternateColorCodes('&', Main.inst().getConfig().getString("prefix.soldier"));
			e.setFormat(base + "[Soldier] " + isRank(player) + base + ": " + msg);
		}else{
			String base = ChatColor.translateAlternateColorCodes('&', Main.inst().getConfig().getString("prefix.none"));
			e.setFormat(isRank(player) + base + ": " + msg);
		}
	}
	
	public static String isRank(Player player){
		if(Admins.isAdmin(player)){
			return ChatColor.RED + player.getName();
		}else{
			return ChatColor.DARK_AQUA + player.getName();
		}
	}
}
