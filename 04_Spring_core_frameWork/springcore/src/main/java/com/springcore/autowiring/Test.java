package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/autowiring/autowiringConfig.xml");
		
		Employee emp1 =  context.getBean("emp1",Employee.class);  // If you write this you dont need
		// to typecast in Destination object
		System.out.println(emp1);
		Address address =  context.getBean("address" , Address.class);
		System.out.println(address);
	}

}
