package com.springcore.autowiring.annotation;

public class Address {
	public String street;
	public int pincode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(String street, int pincode) {
		super();
		this.street = street;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + "]";
	}
	
	
}
