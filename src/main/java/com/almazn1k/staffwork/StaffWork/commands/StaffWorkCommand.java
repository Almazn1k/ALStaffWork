package com.almazn1k.staffwork.StaffWork.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class StaffWorkCommand implements CommandExecutor {
	Player playerSender;

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label,
			@NotNull String[] args) {
		if (!sender.hasPermission("staffwork.")) {
			sender.sendMessage("§bHW §8-> §cYou don't have permission to do that");
			return true;
		}
		
		if (args.length == 0) {
			sender.sendMessage("§bStaffWork v0.1-BETA");
			sender.sendMessage("§b/sw help §8-> §fOpens this menu");
			sender.sendMessage("§b/sw on/off §8-> §fTurns the work statement");
			sender.sendMessage("§b/sw reload §8-> §fReloads plugin configuration");
			return true;
		}
		
		if (args[0].equalsIgnoreCase("help")) {
			sender.sendMessage("§bStaffWork v0.1-BETA");
			sender.sendMessage("§b/sw help §8-> §fOpens this menu");
			sender.sendMessage("§b/sw on/off §8-> §fTurns the work statement");
			sender.sendMessage("§b/sw reload §8-> §fReloads plugin configuration");
			sender.sendMessage("123");
			return true;
		}
		return false;
	}

}
