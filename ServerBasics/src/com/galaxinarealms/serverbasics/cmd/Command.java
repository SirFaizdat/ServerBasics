/**
 * Copyright 2014 GalaxinaRealms
 */
package com.galaxinarealms.serverbasics.cmd;

import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.galaxinarealms.serverbasics.MessageUtil;
import com.galaxinarealms.serverbasics.ServerBasics;

public abstract class Command {

	ServerBasics plugin;

	String name;
	String permission;
	List<String> requiredArguments;
	List<String> optionalArguments;

	public Command(String name) {
		plugin = ServerBasics.i;

		this.name = name;
		permission = "serverbasics." + permission;
	}

	CommandSender sender;
	Player player;

	public void execute(CommandSender sender, String[] args) {
		this.sender = sender;
		this.player = (Player) sender;

		// if(there are no arguments AND the requiredArguments size is greater
		// than 0 AND the optionalArguments size is greater than 0 (if args
		// werent specified)
		if (args.length == 0 && requiredArguments.size() > 0
				&& optionalArguments.size() > 0) {
			sender.sendMessage(MessageUtil.arguments);
			sender.sendMessage("Usage: " + usage());
			return;
		}
	}
	
	public String usage() {
		StringBuilder s = new StringBuilder();
		s.append("/" + name.toLowerCase());
		for(String ss : requiredArguments) {
			s.append("<" + ss + ">");
		}
		for(String ss : optionalArguments) {
			s.append("[" + ss + "]");
		}
		
		return s.toString();
	}

}
