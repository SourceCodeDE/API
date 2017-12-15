package de.API.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("[API] API aktiviert");
	}
	
	@Override
	public void onDisable() {
		System.out.println("[API] API deaktiviert");
	}
	
}
