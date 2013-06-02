package com.theaetherserver.slimeclasses.select;

import org.bukkit.entity.Player;

import com.theaetherserver.slimeclasses.check.Check;
import com.theaetherserver.slimeclasses.configuration.*;

public class ClearClass {
	public static void clearClass(Player player){		
		if(Check.isMiner(player)){
			Miners.remPlayer(player);
		}else if(Check.isFisherman(player)){
			Fishermen.remPlayer(player);
		}else if(Check.isWoodcutter(player)){
			Woodcutters.remPlayer(player);
		}else if(Check.isFarmer(player)){
			Farmers.remPlayer(player);
		}else if(Check.isHunter(player)){
			Hunters.remPlayer(player);
		}else if(Check.isSoldier(player)){
			Soldiers.remPlayer(player);
		}
	}
}
