package com.springLearning.first_springboot.game;

public class PacMan implements GamingConsole{
	public void up()
	{
		System.out.println("Go Up");
	}
	
	public void down()
	{
		System.out.println("Go Down");
	}
	
	public void right()
	{
		System.out.println("Go Right");
	}
	
	public void left()
	{
		System.out.println("Go Backside");
	}
}
