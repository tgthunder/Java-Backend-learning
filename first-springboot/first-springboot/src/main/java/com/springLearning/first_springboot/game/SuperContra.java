package com.springLearning.first_springboot.game;

public class SuperContra implements GamingConsole{
	public void up()
	{
		System.out.println("Stand Up");
	}
	
	public void down()
	{
		System.out.println("Sit Down");
	}
	
	public void right()
	{
		System.out.println("Shoot");
	}
	
	public void left()
	{
		System.out.println("Reload The Gun");
	}
}
