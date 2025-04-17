package com.almazn1k.staffwork.StaffWork;

import org.bukkit.plugin.java.JavaPlugin;

import com.almazn1k.staffwork.StaffWork.commands.StaffWorkCommand;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		getLogger().info("1");
		getCommand("staffwork").setExecutor(new StaffWorkCommand());
	}
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		getLogger().info("1");
	}
}
