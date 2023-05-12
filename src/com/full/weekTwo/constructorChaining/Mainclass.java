package com.full.weekTwo.constructorChaining;

public class Mainclass extends Demo {
	public static void main(String[] args) {
		Mainclass driver = new Mainclass();
		System.out.println("Id     :" + driver.num);
		System.out.println("name   :" + driver.name);
		System.out.println("Salary :" + driver.value);
		System.out.println("Status :" + (driver.status ? "Active" : "Not Available"));
		System.out.println();
		Demo driver1 = new Demo(2, "Karthik", 100000.0, false);
		System.out.println("Id     :" + driver1.num);
		System.out.println("name   :" + driver1.name);
		System.out.println("Salary :" + driver1.value);
		System.out.println("Status :" + (driver1.status ? "Active" : "Not Available"));
	}
}
