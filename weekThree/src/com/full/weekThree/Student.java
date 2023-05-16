package com.full.weekThree;

class Student extends Person {

	private int grade;

	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	public static String name(Person person) {
		System.out.println("static method from Student");
		return person.getName();
	}

	public String toString() {
		return super.toString() + ", Grade: " + grade;
	}

	public void nameOverride() {
		System.out.println("overridden method from Student");
	}

	public void print() {
		System.out.println("printing from Student class");

	}
}
