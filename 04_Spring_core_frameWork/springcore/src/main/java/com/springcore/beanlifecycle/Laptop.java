package com.springcore.beanlifecycle;

public class Laptop {
	private String company;
	private int price;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("Price of laptop is set");
		this.price = price;
	}
	public Laptop(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", price=" + price + "]";
	}
	
    // init() method
	public void init()
	{
		System.out.println("Init method called");
	}
	
	
	// Destroy method
	public void destroy()
	{
		System.out.println("Destroy method called");
	}
	
}
