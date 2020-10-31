package com.week2;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Duplicate {
	static Logger logger=Logger.getLogger(Duplicate.class.getName());
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		logger.info("Enter a string");
		String str=sc.nextLine();
		StringBuilder str1=new StringBuilder();
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			String s=str.substring(i,i+1);
			if(str1.indexOf(s)==-1)
				str1.append(s);
		}
		logger.debug("String without duplicate characters: "+str1);
		sc.close();
	}

}
