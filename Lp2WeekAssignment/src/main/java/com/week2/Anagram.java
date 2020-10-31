package com.week2;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class Anagram {
	static Logger logger=Logger.getLogger(Anagram.class.getName());
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1;
		String str2;
		int flag=0;
		logger.info("Enter two strings");
		str1=sc.nextLine();
		str2=sc.nextLine();
		str1=str1.replaceAll("\\s+", "");
		str2=str2.replaceAll("\\s+", "");
		char []c1=str1.toCharArray();
		char []c2=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(c1.length!=c2.length)
			logger.info("Given strings are not anagrams");
		else {
			for(int i=0;i<c1.length;i++)
				if(c1[i]!=c2[i])
				{
					flag=1;
					break;
				}	
		if(flag==1)
			logger.info("Given strings are not anagrams");
		else
			logger.info("Given strings are anagrams");
		}
		sc.close();
}
}
