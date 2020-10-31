package com.week1;

import org.apache.log4j.Logger;

class Multiply{
	int multi(int a, int b)
	{
		return a*b;
	}
	int multi(int a, int b, int c)
	{
		return a*b*c;
	}
}

class Parent{
	static Logger logger=Logger.getLogger(Parent.class.getName());
	public void demo() {
		logger.info("Parent Method");
	}
}

class Child extends Parent{
	@Override
	public void demo() {
		logger.info("Child Method");
	}
}

public class Polymorph {
	static Logger logger=Logger.getLogger(Polymorph.class.getName());
	public static void main(String[] args) {
		logger.info("Static polymorphism");
		Multiply m = new Multiply();
		logger.info(m.multi(5,6));
		logger.info(m.multi(5,6,7));
		
		logger.info("Runtime Polymorphism");
		Parent p=new Parent();
		p.demo();
		Child c=new Child();
		c.demo();
		Parent p1=new Child();
		p1.demo();
		
	}
}
