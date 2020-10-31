package com.week2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateProp {
	public static void main(String []args) {
		Properties pr = new Properties();
		
		try(FileOutputStream f1 = new FileOutputStream("java.properties");) {
			
			pr.setProperty("Language", "Java");
			pr.setProperty("Developer", "James Gosling");
			pr.setProperty("Company", "Sun Microsystem");
			pr.setProperty("Year", "1995");
			pr.setProperty("Approach", "Object oriented language");
			pr.store(f1, null);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}