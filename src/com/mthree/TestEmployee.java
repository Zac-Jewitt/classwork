package com.mthree;
import com.mthree.classes.Address;
import com.mthree.classes.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Address a1 = new Address("Australia", "Wollongong", "Crown st", 2500);
		Address a2 = new Address("Australia", "Sydney", "Charles st", 2150);
		Employee e1 = new Employee(10, "Zac", a2);
		Employee e2 = new Employee(20, "Will", a1);
		
		System.out.println("Welcome to Java.");
		
//		a1.setCountry("Australia");
//		a1.setCity("Wollongong");
//		a1.setStreet("Crown st");
//		a1.setPostCode(2500);
		
//		a2.setCountry("Australia");
//		a2.setCity("Sydney");
//		a2.setStreet("Charles st");
//		a2.setPostCode(2150);
		
//		e1.setId(10);
//		e1.setName("Zac");
//		e1.setAddr(a2);
	
//		e2.setId(20);
//		e2.setName("Will");
//		e2.setAddr(a1);
		
		a2.setCountry("England");
		a2.setCity("London");
		a2.setStreet("First st");
		a2.setPostCode(2555);
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		
		Employee.setCompanyName("Wiley");
		
		System.out.println(Employee.getCompanyName());
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(e1);
		System.out.println(e2);

	}

}
