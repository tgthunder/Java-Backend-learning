package com.springcore.ci;

public class Addition {
	private int x;
	private int y;
	
	
	public Addition(double x , double y)
	{
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("Constructor = double , double");
	}
	
	public Addition(int x , int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("Constructor = int , int");
	}
	
	public Addition(String x , String y)
	{
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("Constructor = String , String");
	}
	
	public void doSum()
	{
		System.out.println("Value of x: "+this.x);
		System.out.println("Value of y: "+this.y);
		System.out.println("Sum of a and b: " + (this.x + this.y));
		
	}
}
