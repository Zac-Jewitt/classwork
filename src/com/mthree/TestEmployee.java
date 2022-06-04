package com.mthree;
import com.mthree.classes.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		System.out.println("Welcome to Java.");
		
		e1.setId(10);
		e1.setName("Zac");
		
		e2.setId(20);
		e2.setName("Will");
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		
		Employee.setCompanyName("Wiley");
		
		System.out.println(Employee.getCompanyName());

	}

}
