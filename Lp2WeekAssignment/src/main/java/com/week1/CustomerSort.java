package com.week1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.log4j.Logger;
class Customer implements Comparator<Customer> {
	 
    private Integer age = -1;
    private String firstName = null;
 
    public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Customer(String fName, Integer age) {
            this.firstName = fName;
            this.age = age;
    }
 
    //Getters and Setters
 
    @Override
    public String toString() {
        return "\nCustomer [firstName=" + firstName + ",age=" + age+ "]";
    }

	public int compare(Customer arg0, Customer arg1) {
		return 0;
	}
}

class FirstNameSort implements Comparator<Customer> 
{
    public int compare(Customer c1, Customer c2) 
    {
        return c1.getFirstName().compareTo(c2.getFirstName());
    }
}
 
class AgeSort implements Comparator<Customer> 
{
    public int compare(Customer c1, Customer c2) 
    {
        return c1.getAge() - c2.getAge();
    }
}

public class CustomerSort {
	static Logger logger=Logger.getLogger(CustomerSort.class.getName());
	public static void main(String[] args) {
		 List<Customer> list = Arrays.asList(new Customer( "A", 34), 
         new Customer( "C", 30), 
         new Customer("B", 31), 
         new Customer("B", 25));

		 Collections.sort(list, new FirstNameSort().thenComparing(new AgeSort()));

		 logger.info(list);
	}

}
