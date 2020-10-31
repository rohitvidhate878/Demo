package com.week2;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Occurance {
	static Logger logger=Logger.getLogger(Occurance.class.getName());
	boolean uniqueness(String str) {
		String str1=str.toLowerCase();
		int strlen=str1.length();
		char []c=str1.toCharArray();
		
		for(int i=0;i<strlen;i++)
			for(int j=i+1;j<strlen;j++)
				if(c[i]==c[j])
					return false;
		
	return true;
	}
	
	public static void main(String[] args) {
		Occurance o1=new Occurance(); 
		Scanner sc=new Scanner(System.in);
		String str;
		logger.info("Enter a string");
		str=sc.next();		
		if(o1.uniqueness(str))
			logger.info("String contain unique character");
		else
			logger.info("String does not contain unique character");
		sc.close();
	}

}
