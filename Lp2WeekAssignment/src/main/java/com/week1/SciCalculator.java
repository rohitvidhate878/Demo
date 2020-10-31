package com.week1;



import java.util.Scanner;

import org.apache.log4j.Logger;

class Calculate{
	static Logger logger=Logger.getLogger(Calculate.class.getName());
	public void calsin(double deg) {
		double rad=Math.toRadians(deg);
		logger.info("Sin("+deg+"): "+Math.sin(rad));
	}
	
	public void calcos(double deg1) {
		double rad1=Math.toRadians(deg1);
		logger.info("Cos("+deg1+"): "+Math.cos(rad1));
}
	
	public void caltan(double deg2) {
		double rad2=Math.toRadians(deg2);
		logger.info("Tan("+deg2+"): "+Math.tan(rad2));
}
	
	public void callog(double number) {
		logger.info("Log("+number+"): "+Math.log10(number));
}
	
	public void calsqrt(double number1) {
		logger.info("Square root of "+number1+": "+Math.sqrt(number1));
}
	
	public void calcbrt(double number2) {
		logger.info("Cube root of "+number2+": "+Math.cbrt(number2));
}
	
}

public class SciCalculator {
	static Logger logger=Logger.getLogger(SciCalculator.class.getName());
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Calculate cal = new Calculate();
		
		int choice;
		do {
			
		logger.info("Enter a choice:\n 1.Sin \n 2.Cos \n 3.Tan \n 4.Log \n 5.Square root \n 6.Cube Root \n 7.exit");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			logger.info("Enter radians to calculate sin");
			double deg=sc.nextDouble();
			cal.calsin(deg);
			break;
		
		case 2:
			logger.info("Enter radians to calculate cos");
			double deg1=sc.nextDouble();
			cal.calcos(deg1);
			break;
		
		case 3:
			logger.info("Enter radians to calculate tan");
			double deg2=sc.nextDouble();
			cal.caltan(deg2);
			break;
		
		case 4:
			logger.info("Enter to number to calculate logarithm to the base 10");
			double number = sc.nextDouble();
			cal.callog(number);
			break;
			
		case 5:
			logger.info("Enter to number to calculate square root");
			double number1=sc.nextDouble();
			cal.calsqrt(number1);
			break;
			
		case 6:
			logger.info("Enter to number to calculate cube root");
			double number2=sc.nextDouble();
			cal.calcbrt(number2);
			break;
			
		case 7:
			logger.info("Program Terminated");
			System.exit(0);
			break;
			
		default:
			logger.info("Default");
		
		}
		}while(choice!=7);
		sc.close();
	}

}
