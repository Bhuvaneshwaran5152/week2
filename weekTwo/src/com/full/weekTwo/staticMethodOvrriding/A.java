package com.full.weekTwo.staticMethodOvrriding;

public class A {
	public static void getstatic() {
		System.out.println("Hello from A");
	}

	void getNonStatic() {
		System.out.println("Hello from Nonstatic A");
	}
}

class B extends A {
	public static void getstatic() {
		System.out.println("Hello from B");
	}

	void getNonStatic() {
		System.out.println("Hello from NonStatic B");
	}
}
