package com.full.inheritance.single;

public class Child extends Parent {

	public Child() {
		// TODO Auto-generated constructor stub
	}

	public void print1() {
		System.out.println("hi from child");
	}

	public static void main(String[] args) {
		Parent child = new Child();
		child.print();
	}

}
