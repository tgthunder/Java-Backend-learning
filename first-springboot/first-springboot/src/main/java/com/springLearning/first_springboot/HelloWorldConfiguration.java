package com.springLearning.first_springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record will automatically create getter , setter, constructor , toString.
record Person(String name , int age , Address address) {};
record Address(String firstLine , String city ) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name()
	{
		return "GoLang";
	}
	
	@Bean
	public int age()
	{
		return 18;
	}
	
	@Bean
	@Primary
	public Person person()
	{
		return new Person("Rahul", 32 , new Address("potdar lane , near highschool", "Chinchwad"));
	}
	
	@Bean(name = "address1") // custom name of your bean
	@Primary
	public Address address()
	{
		return new Address("Baker Street", "London");
	}
	
	@Bean(name = "address2") // custom name of your bean
	@Qualifier("address2Qualifier")
	public Address address2()
	{
		return new Address("Neharu Nagar", "PCMC");
	}
	
	
	@Bean(name="person2")
	public Person person2MethodCall()
	{
		return new Person(name(), age() , address());
	}
	
	
	@Bean(name="person3")
	public Person person3Parameters(String name , int age ,@Qualifier("address2Qualifier") Address address2) // name , age , address
	{
		return new Person(name, age , address2);
	}
	

}
