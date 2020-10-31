package com.week2;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ReadProp {
	
	static Logger logger=Logger.getLogger(ReadProp.class.getName());
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		try (FileInputStream fileinput=new FileInputStream("java.properties");){
		    
			pr.load(fileinput);
			logger.info(pr.getProperty("Language"));
			logger.info(pr.getProperty("Developer"));
			logger.info(pr.getProperty("Year"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}