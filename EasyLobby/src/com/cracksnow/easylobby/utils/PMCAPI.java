package com.cracksnow.easylobby.utils;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import org.bukkit.Bukkit;

//simple API for the bukkit-bungee plugin messaging channel
public class PMCAPI {

	public static byte[] getTeleportPlayerToServerMsg(String server) {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		DataOutputStream dout = new DataOutputStream(bout);
		
		try {
			dout.writeUTF("Connect");
			dout.writeUTF(server);
		}catch(Exception e) {
			Bukkit.getLogger().severe("TeleportPlayerToServerMsg could not be generated!");
		}
		
		return bout.toByteArray();
	}
	
}