/**
* Copyright 2014 GalaxinaRealms
*/
package com.galaxinarealms.serverbasics;

public class MessageUtil {

	public static final String noPermission = colorize("&cYou don't have permission to run this command.");
	public static final String mustBePlayer = "You must be a player to execute this command.";
	public static final String arguments = colorize("¤cInvalid arguments. Please try again!");
	
	public static String colorize(String string) {
		return string.replaceAll("&", "¤");
	}
	
}
