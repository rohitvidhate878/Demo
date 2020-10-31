package com.week1;


import java.util.HashMap;

import org.apache.log4j.Logger;

public class Key {
	static Logger logger=Logger.getLogger(Key.class.getName());
	public static void main(String[] args) {
		HashMap<Integer, String> hash=new HashMap<>();
		hash.put(1, "HP");
		hash.put(2, "Asus");
		hash.put(3, "Acer");
		hash.put(4, "MSI");
		
		logger.info("Hashmap: " + hash);
		if(hash.containsKey(3)) {
			logger.info("Mapping for key exists");
		}
		else
			logger.info("Mapping for key does not exists");
	}

}
