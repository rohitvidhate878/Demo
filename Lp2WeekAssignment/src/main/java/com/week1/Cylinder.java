package com.week1;


import java.util.Scanner;

import org.apache.log4j.Logger;

class RateofFlow{
	static Logger logger=Logger.getLogger(RateofFlow.class.getName());
	double pi=3.14;
	double cylheight=20; //height in feets
	double cylheightm=20/3.28; // in meters
	
	double cylrad=5.0/2; //diameters in feets
	double cylradm=cylrad/3.28; //rad in meters
	
	double piperad=5.0/2; //in meters	
	double cylvolume=pi*cylradm*cylrad*cylheightm;
	
	void rate(int hr) {
	
		double rateflow=((cylvolume)/(pi*piperad*piperad*hr));
		logger.info("Rate of Flow: "+rateflow);
	}
	
	
}
public class Cylinder {
	static Logger logger=Logger.getLogger(Cylinder.class.getName());
	public static void main(String[] args) {
		RateofFlow rf=new RateofFlow();
		Scanner sc=new Scanner(System.in);
		logger.debug("Enter the hours in which tank has to be filled");
		rf.rate(sc.nextInt());
		sc.close();
	}

}
