package com.springcore.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

// Getting Objects of Employee class ready made from ApplicationContext IOC Container..
public class Test {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
//		System.out.println("Everything is Right Till Here!");
		
		Employee emp1 = (Employee) context.getBean("bean1");
		
		System.out.println(emp1.getEname());
		System.out.println(emp1.getAddresses());
		String newName = new String("Bob");
		emp1.setEname(newName);
		
		System.out.println(emp1.getCourses());
		
		System.out.println(emp1.getProps());
		
	}

}
