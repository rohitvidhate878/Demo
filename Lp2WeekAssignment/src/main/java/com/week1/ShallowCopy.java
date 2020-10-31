package com.week1;


import java.util.HashMap;

import org.apache.log4j.Logger;

public class ShallowCopy {
	static Logger logger=Logger.getLogger(ShallowCopy.class.getName());
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		HashMap <Integer, String> harddisk=new HashMap<>();
		harddisk.put(1, "HDD");
		harddisk.put(2, "SSD");
		harddisk.put(3, "M.2 SSD");
		harddisk.put(4, "NVME/PCIe");
		logger.info("Original Copy: " + harddisk);
		HashMap <Integer, String> harddiskcopy = (HashMap<Integer, String>) harddisk.clone();
		logger.info("Cloned Copy: " + harddiskcopy);
	}

}
