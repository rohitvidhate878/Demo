package com.week1;



import java.util.Scanner;

import org.apache.log4j.Logger;
public class TaxCal {
	static Logger logger=Logger.getLogger(TaxCal.class.getName());
	public static void main(String[] args) {
		double salary;
		double tax=0;
		int gender;
		logger.info("Enter Anual Salary");
		Scanner sc=new Scanner(System.in);
		salary=sc.nextInt();
		if(salary<150000)
			tax=0;
		
		else if(150000<=salary && salary<=1000000)
			tax=(salary*10)/100;
		
		else if(1000000<salary && salary<=1500000)
			tax=(salary*20)/100;
		
		else if(1500000<salary && salary<=3000000)
			tax=(salary*35)/100;
		
		else if(salary>3000000)
			tax=(salary*40)/100;	
		
		logger.info("Choose (1/2) for Gender 1.Male 2.Female ");
		gender=sc.nextInt();
		
		if(gender==1) {
				
		logger.info("Tax for Anual Salary for male: "+String.format("%.2f", tax));
		}
		
		else if(gender==2) {
			if(tax==0)
				logger.debug("Tax for Anual Salary: "+String.format("%.2f", tax));
			else
				logger.debug("Tax for Anual Salary: "+String.format("%.2f", tax-2000));	
		}
		sc.close();
	}

}
