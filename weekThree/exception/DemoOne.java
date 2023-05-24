package com.full.weekThree.exception;

public class DemoOne {
	static int num;
	static String name = null;
	static String className = "com.full.weekThree.exception.jil";

	public static void main(String[] args) {
		try {
			num = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			try {
				name.length();
			} catch (Exception e2) {
				System.out.println(e2.getLocalizedMessage());
			}

		}

		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getStackTrace());

		}
	}
}
