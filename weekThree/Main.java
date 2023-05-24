package com.full.weekThree;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("John", 25);
		System.out.println(person.toString());
		person.nameOverride();
		String name2 = person.name(person);
		System.out.println("\n" + name2 + "\n");
		Person student = new Student("Alice", 18, 12);
		student.nameOverride();

		String name = student.name(person);
		System.out.println("\n" + name + "\n");

		Printable printer = new Printer();
		printer.print();

		person.hello();
		person.welcome();
		person.print();
		student.print();

		Person.name(person);
		Student.name(student);

		person.income(10000);
		person.income(10000, 5000);
	}
}
