package com.theaetherserver.slimeclasses;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.theaetherserver.slimeclasses.check.Check;
import com.theaetherserver.slimeclasses.select.*;

public class Commands implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args){
		if(sender instanceof Player){
			Player player = (Player) sender;
			if(commandLabel.equalsIgnoreCase("setclass")){
				if(player.hasPermission("class.set")){
					if(args.length == 0){
						player.sendMessage(ChatColor.RED + "Used: /setclass <class>");
						return true;
					}else if(args.length == 1){
						if(args[0].equalsIgnoreCase("miner")){
							if(!Check.hasClass(player)){
								Miner.selMiner(player);
								return true;
							}else{
								player.sendMessage(ChatColor.RED + "You already have a class");
								return true;
							}
						}else if(args[0].equalsIgnoreCase("fisherman")){
							if(!Check.hasClass(player)){
								Fisherman.selFisherman(player);
								return true;
							}else{
								player.sendMessage(ChatColor.RED + "You already have a class");
								return true;
							}
						}else if(args[0].equalsIgnoreCase("woodcutter")){
							if(!Check.hasClass(player)){
								Woodcutter.selWoodcutter(player);
								return true;
							}else{
								player.sendMessage(ChatColor.RED + "You already have a class");
								return true;
							}
						}else if(args[0].equalsIgnoreCase("farmer")){
							if(!Check.hasClass(player)){
								Farmer.selFarmer(player);
								return true;
							}else{
								player.sendMessage(ChatColor.RED + "You already have a class");
								return true;
							}
						}else if(args[0].equalsIgnoreCase("hunter")){
							if(!Check.hasClass(player)){
								Hunter.selHunter(player);
								return true;
							}else{
								player.sendMessage(ChatColor.RED + "You already have a class");
								return true;
							}
						}else if(args[0].equalsIgnoreCase("soldier")){
							if(!Check.hasClass(player)){
								Soldier.selSoldier(player);
								return true;
							}else{
								player.sendMessage(ChatColor.RED + "You already have a class");
								return true;
							}
						}else{
							player.sendMessage(ChatColor.RED + toTitleCase(args[0]) + " is not a class.");
							return true;
						}
					}
				}
			}else if(commandLabel.equalsIgnoreCase("classlist")){
				if(player.hasPermission("class.list")){
					if(args.length == 0){
						player.sendMessage(ChatColor.DARK_AQUA + "Classes: Miner, Fisherman, Woodcutter, Farmer, Hunter, Soldier");
						return true;
					}else{
						player.sendMessage(ChatColor.RED + "Used: /classlist");
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static String toTitleCase(String input) {
		StringBuilder titleCase = new StringBuilder();
		boolean nextTitleCase = true;

		for (char c : input.toCharArray()) {
			if (Character.isSpaceChar(c)) {
				nextTitleCase = true;
			} else if (nextTitleCase) {
				c = Character.toTitleCase(c);
				nextTitleCase = false;
			}

			titleCase.append(c);
		}

		return titleCase.toString();
	}
	
}
