package com.full.weekThree.exception;

public class Example {
	public static void main(String[] args) {
		try {
			performOperation();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	public static void performOperation() throws Exception {
		int i = 10 / 0;
		throw new Exception("Something went wrong!");

	}
}