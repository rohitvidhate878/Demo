package com.week1;

import org.apache.log4j.Logger;

class Employee{
	private int empid;
	private String empname;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}
public class Encap {
	static Logger logger=Logger.getLogger(Encap.class.getName());
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpid(660);
		e1.setEmpname("ABC");
		
		logger.info("Employee ID: " + e1.getEmpid() + "\n" + "Employee Name: " + e1.getEmpname());

	}

}
