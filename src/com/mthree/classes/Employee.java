package com.mthree.classes;

public class Employee {
	private int id;
	private String name;
	private static String companyName;
	
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
	
}
