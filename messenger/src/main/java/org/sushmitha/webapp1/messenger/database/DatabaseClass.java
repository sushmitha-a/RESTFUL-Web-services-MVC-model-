package org.sushmitha.webapp1.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.sushmitha.webapp1.messenger.mode.Message;
import org.sushmitha.webapp1.messenger.mode.Profile;

public class DatabaseClass {

	private static Map<Long,Message> messages= new HashMap<>();
	private static Map<Long,Profile> profiles= new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
}
