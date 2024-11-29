package com.springLearning.first_springboot.game;

public class MarioGame implements GamingConsole {
	public void up()
	{
		System.out.println("Jump");
	}
	
	public void down()
	{
		System.out.println("Go in pitfall");
	}
	
	public void right()
	{
		System.out.println("Accelerate");
	}
	
	public void left()
	{
		System.out.println("Go Back");
	}
}
