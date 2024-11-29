package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/autowiringConfig.xml");
		
		Employee emp1 =  context.getBean("emp1",Employee.class);  // If you write this you dont need
		// to typecast in Destination object
		System.out.println(emp1);
		
	}

}
