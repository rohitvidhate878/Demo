package com.week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

 
public class AddContent {
  static Logger logger=Logger.getLogger(AddContent.class.getName());
  public static void main(String[] args) throws IOException {
	  BufferedReader b1=null;
	  FileWriter f2=null;
	  try(FileReader f1 = new FileReader("I:\\Week workspace\\Lp2WeekAssignment\\src\\main\\java\\abc.text");) {
      
      b1 = new BufferedReader(f1);
 
      String str = b1.readLine();
      String str1 = str.substring(0, 4) + "ARE " + str.substring(4);
      
      f2 = new FileWriter("I:\\Week workspace\\Lp2WeekAssignment\\src\\main\\java\\abc.text");
      f2.write(str1);
      logger.info("File updated");
      
	  }catch (IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				if (b1 != null)
					b1.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			try {
				if(f2!=null)
					f2.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
  }
}