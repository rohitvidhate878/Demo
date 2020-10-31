package com.week2;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Initials {
	static Logger logger=Logger.getLogger(Initials.class.getName());
	public static void main(String[] args) {
			String name;
			StringBuilder initials=new StringBuilder();
			Scanner sc=new Scanner(System.in);
			logger.info("Enter a Full Name");
			name=sc.nextLine().toUpperCase();
			name=" "+name;
			for(int i=0;i<name.length();i++){
				char c=name.charAt(i);
				if(c==' ')
					initials.append(name.charAt(i+1));
			}
			logger.info(initials);
			sc.close();
	}

}
