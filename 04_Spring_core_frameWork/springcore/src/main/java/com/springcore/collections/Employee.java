package com.springcore.collections;
// THis is the tutorial in which we are going to perform DI of collection framework..
// How can we actully declare collection data type and use them when IOC creates object for us

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String Ename;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties props;
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee(String ename, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		Ename = ename;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
