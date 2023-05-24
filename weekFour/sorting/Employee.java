package com.full.weekFour.collection.sorting;

public class Employee implements Comparable<Employee> {

	String name;
	int id;

	public Employee() {

	}

	@Override
	public String toString() {
		return "name :" + name + ",    id :" + id;
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}
}
