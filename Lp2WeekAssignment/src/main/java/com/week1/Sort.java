package com.week1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Sort {
	static Logger logger=Logger.getLogger(Sort.class.getName());
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		logger.info("Enter the number of integers to be sorted");
		int n=sc.nextInt();
		logger.info("Enter the list of integers");
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		
		Collections.sort(list);
		ArrayList<Integer> list1=new ArrayList<>(list.subList(0, n/2));
		logger.info("Half list in ascending order; ");
		logger.debug(list1);
		
		Collections.reverse(list);
		
		ArrayList<Integer> list2=new ArrayList<>(list.subList(0, n/2));
		logger.debug(list2);
		sc.close();
	}

}
