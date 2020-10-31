package com.week1;

import org.apache.log4j.Logger;

interface Inf{
	static Logger logger=Logger.getLogger(Inf.class.getName());
	default void display() {
		logger.info("This language supports object oriented concepts\n");
	}
	public void multiinherit();
	public void speed();
	public void threads();
}

class A implements Inf{
	@Override
	public void multiinherit() {
		logger.info("C++ provide both single and multiple inheritance.\n");
	}
	@Override 
	public void speed() {
		logger.info("C++ program is fast compiling programming language.\n");
	}
	@Override
	public void threads() {
		logger.info("There is no built in support for threads in C++.\n");
	}
}

class B implements Inf{
	@Override
	public void multiinherit() {
		logger.info("In Java multiple inheritanceis partially done through interfaces.\n");
	}
	@Override 
	public void speed() {
		logger.info("Java program compiler bit slower than C++.\n");
	}
	@Override
	public void threads() {
		logger.info("Java has built-in thread supoorts.\n");
	}
}

class C implements Inf{
	@Override
	public void multiinherit() {
		logger.info("Python provide both single and multiple inheritance.\n");
	}
	@Override 
	public void speed() {
		logger.info("Due to use of interpreter execution is slower in python.\n");
	}
	@Override
	public void threads() {
		logger.info("There is support for threads in python.\n");
	}
}

public class InterfaceDemo {
	static Logger logger=Logger.getLogger(InterfaceDemo.class.getName());
	public static void main(String[] args) {
		logger.info("C++ Language");
		A a=new A();
		a.display();
		a.multiinherit();
		a.speed();
		a.threads();
		
		logger.info("Java Language");
		B b=new B();
		b.display();
		b.multiinherit();
		b.speed();
		b.threads();
		
		logger.info("Python Language");
		C c=new C();
		c.display();
		c.multiinherit();
		c.speed();
		c.threads();
	}

}
