package com.mthree.classes;

public class Employee {
	private int id;
	private String name;
	private static String companyName;
	private Address addr; //has-a relationship
	
	//The moment a parameterised constructor is added, default is not added automatically
	public Employee(int id, String name, Address addr) {
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void setCompanyName(String name) {
		companyName = name;
	}
	
	public static String getCompanyName() {
		return companyName;
	}
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		
		return id + ", " + name + ", " + addr.toString();
	}
	
	//Three pre-requisites to override any method
	//1. There should be parent-child(is-s)relationship
	//2. The method from parent must be inherited(available to the child)
	//3. Child class is not happy with the method given to it by the parent
	
	
}
