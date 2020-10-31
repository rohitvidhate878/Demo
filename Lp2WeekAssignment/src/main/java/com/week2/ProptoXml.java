package com.week2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ProptoXml {
	static Logger logger=Logger.getLogger(ProptoXml.class.getName());
    public static void main(String[] args) throws Exception {
	OutputStream os=null;
    try(InputStream is = new FileInputStream("java1.properties");) {
	Properties pr = new Properties();
	os = new FileOutputStream("java2.xml");
	pr.load(is);
	pr.storeToXML(os, "java1.properties", "UTF-8");
	logger.info("Properties file converted to xml file");
    } catch (IOException ex) {
		ex.printStackTrace();
	}finally {
		try {
			if(os!=null)
				os.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
    }
}