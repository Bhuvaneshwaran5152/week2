package com.full.weekThree;

class Person extends DemoMethods {

	private String name;

	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}

	public void nameOverride() {
		System.out.println("overridden method from Person");
	}

	public static String name(Person person) {
		System.out.println("static method from Person");
		return person.getName();

	}

	void hello() {
		System.out.println("\nHello");
	}

	public void print() {
		System.out.println("printing from person class");

	}

	public void income(double salary) {
		System.out.println("income :" + salary);

	}

	public void income(double salary, double bonus) {
		System.out.print("income :");
		System.out.println(salary + bonus);

	}

}