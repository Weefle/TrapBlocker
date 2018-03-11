package fr.weefle.trapblocker;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new TrapBlockerListener(), this);
	}
	
}
