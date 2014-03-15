/**
 * Copyright 2014 GalaxinaRealms
 */
package com.galaxinarealms.serverbasics;

import org.bukkit.plugin.java.JavaPlugin;

public class ServerBasics extends JavaPlugin {

	// Static instance for all classes.
	public static ServerBasics i;

	public void onEnable() {
		i = this;

		
		
		getLogger().info(
				"Successfully enabled ServerBasics v"
						+ getDescription().getVersion()
						+ ". Made by SirFaizdat and zeshan321.");
	}

	public void destroy() {
		getLogger().warning("Force disabling ServerBasics due to an error...");
		getServer().getPluginManager().disablePlugin(this);
	}

}
