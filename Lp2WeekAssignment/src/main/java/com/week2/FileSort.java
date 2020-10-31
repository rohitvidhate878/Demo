package com.week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
 
public class FileSort {
	static Logger logger=Logger.getLogger(FileSort.class.getName());
    public static void main(String[] args) {
           
           
           BufferedReader b1=null;
           try (FileReader f1 = new FileReader("I:\\Week workspace\\Lp2WeekAssignment\\src\\main\\java\\abc1.text");){
                  //1) Read file in String, and store each String in ArrayList
                  
                  b1 = new BufferedReader(f1);
                  
                  List<String> list=new ArrayList<>();
                  String str;
                  
                  while((str = b1.readLine()) != null){
                        list.add(str);
                  }
                  
                  Collections.sort(list);
                  logger.info("Display sorted list > ");
                  logger.info(list);
                  
                  FileWriter f2 = new FileWriter("I:\\Week workspace\\Lp2WeekAssignment\\src\\main\\java\\abc1.text");
                  PrintWriter out = new PrintWriter(f2);
                  for(String str1: list){
                        out.println(str1);
                        out.println("\n");
                  }
                  
                  out.close();
                  logger.info("\nSorted content has been written in file");
                  
                  
           } catch (IOException e) {
                  e.printStackTrace();
           } finally {
			try {
				if (b1 != null )
					b1.close();
				
					
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
         
    }
 
}