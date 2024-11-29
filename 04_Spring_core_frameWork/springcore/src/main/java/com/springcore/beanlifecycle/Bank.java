package com.springcore.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bank {
	private int accountNum;

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public Bank(int accountNum) {
		super();
		this.accountNum = accountNum;
	}

	@Override
	public String toString() {
		return "Bank [accountNum=" + accountNum + "]";
	}
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Start method ");
	}
	
	

	@PreDestroy
	public void end()
	{
		System.out.println("End method");
	}
}
