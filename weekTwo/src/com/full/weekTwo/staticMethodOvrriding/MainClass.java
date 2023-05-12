package com.full.weekTwo.staticMethodOvrriding;

public class MainClass {
	public static void main(String[] args) {
		A b = new B();
		A a = new A();
		b.getstatic();
		a.getstatic();

		b.getNonStatic();
		b.getNonStatic();

	}
}
