package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		
		A temp= (A) context.getBean("aref");
		System.out.println(temp.getObj().getY());
		
		B temp1 = (B) context.getBean("bref");
		
		System.out.println(temp1.getClass());
		System.out.println(temp);
		
	}
}
