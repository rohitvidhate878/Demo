package com.week1;


import java.util.Scanner;
import org.apache.log4j.Logger;
public class Currency {
	static Logger logger=Logger.getLogger(Currency.class.getName());
	static double dollar= 73.35;
	static double euro= 0.85;
	static double dirham= 9.22;
	public static void main(String[] args) {

	    int ch;

	    Scanner sc = new Scanner(System.in);

	    logger.debug("What would you like to convert?\n1. INR to USD? \n2. "
	    		+ "USD to INR? \n3. USD to Euro? \n4. Euro to USD? \n5. Morrocan Dhirram to Euro? "
	    		+ "\n6. Euro to Morrocan Dhirram?");
	    
	    ch = sc.nextInt();

	    if(ch == 1){
	        logger.info("Enter INR to be converted to USD:");
	        logger.info("USD: "+ sc.nextInt() / dollar);
	    } 
	    
	    else if (ch == 2){
	       
	    	logger.info("Enter USD to be converted to INR:");
	    	logger.info("INR: " + sc.nextInt() * dollar);
	    } 
	    
	    else if (ch == 3){
	        
	    	logger.info("Enter USD to be converted to Euro:");
	    	logger.info("Euro: " + sc.nextInt() * euro);
	    } 
	    
	    else if (ch == 4){
	      
	    	logger.info("Enter EURO to be converted to USD:");
	    	logger.info("USD: " + sc.nextInt() / euro);
	    } 
	    
	    else if (ch ==5 ){
	        
	    	logger.info("Enter Morrocan Dhirram to be converted to Euro:");
	    	logger.info("Euro: " + (sc.nextInt()*euro)/dirham);
	    }
	    
	    else if (ch ==6 ){
	    	logger.info("Enter Euro to be converted to Morrocan Dhirram:");
	    	logger.info("Morrocan Dhirram: " + (sc.nextInt()*dirham)/euro);
	    }
	    
	    else if (ch<1 || ch > 6){
	    	logger.info("Please choose correct option.");
	    }
	sc.close();
	}

}
