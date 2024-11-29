package com.springcore.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/beanlifecycle/lifecycleConfig.xml");
		Laptop lapi  = (Laptop)context.getBean("laptop");
		System.out.println(lapi);
		context.registerShutdownHook();
		
		Bank bank = (Bank) context.getBean("bank");
		System.out.println(bank);
		
	}
}
