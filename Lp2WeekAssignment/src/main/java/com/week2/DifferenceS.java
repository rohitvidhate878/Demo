package com.week2;

import org.apache.log4j.Logger;

class DifferenceS 
{ 	
	static Logger logger=Logger.getLogger(DifferenceS.class.getName());
	static String str="Assignments";
    public static void concat(String str1) 
    { 
        str1 += str;
        logger.debug("This String scope is for this method only: "+str1);
    }
    
    public static void concat2(StringBuilder str2) 
    { 
        str2.append(str); 
    }  
    public static void main(String[] args) 
    { 
        String str1 = "Java"; 
        concat(str1);
        logger.debug("String: " + str1); 
        
        StringBuilder str2 = new StringBuilder("Java"); 
        concat2(str2); 
        logger.debug("StringBuilder: " + str2); 
  
    } 
} 