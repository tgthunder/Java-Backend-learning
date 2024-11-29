package com.springLearning.first_springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// 1: launch application context
		var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2: create a configuration class - @configuration (see the class HelloWorldSpring)
		//HelloWorldConfiguration - @Configuration
		// name - @Bean
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("address1"));
		System.out.println(context.getBean(Address.class)); // alternate way to retrive a bean
		
		System.out.println(context.getBean("person2"));
		System.out.println("Same as person 2");
		System.out.println(context.getBean("person3"));
		System.out.println("----------------------------------");
		
		
		for(var bean : context.getBeanDefinitionNames())
		{
			System.out.println(bean);
		}
		
//		System.out.println(context.getBeanDefinitionCount());
		
		System.out.println(context.getBean(Person.class));
		
		
	}

}
