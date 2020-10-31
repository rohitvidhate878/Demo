package com.week1;


import java.util.HashMap;
import org.apache.log4j.Logger;
public class HashMapView {
	static Logger logger=Logger.getLogger(HashMapView.class.getName());
	public static void main(String[] args)
	{
		HashMap <Integer, String> languages=new HashMap<>();
		languages.put(1, "C");
		languages.put(2, "C++");
		languages.put(3, "Java");
		languages.put(4, "Python");
		
		logger.info("Collection view of hashmap: " + languages.values());
		
	}
}
