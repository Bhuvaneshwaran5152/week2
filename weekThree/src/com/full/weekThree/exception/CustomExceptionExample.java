package com.full.weekThree.exception;

public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			int age = -1;
			if (age < 0) {
				throw new CustomException("Age cannot be negative.");
			}
		} catch (CustomException e) {
			System.out.println("Custom Exception caught: " + e.getMessage());
		}
	}
}
