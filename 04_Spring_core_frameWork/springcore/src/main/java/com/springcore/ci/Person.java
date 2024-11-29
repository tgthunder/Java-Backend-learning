package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Adharcard adhar;
	
	public Person(String name , int personId , Adharcard adhar)
	{
		this.name = name;
		this.personId = personId;
		this.adhar = adhar;
	}
	
	@Override
	public String toString() {
		
		return this.name + " : " + this.personId + " : " + this.adhar;
	}
	
}
