package com.full.weekFour.collection.generics;

public class GenericMethodExample {

	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		Integer[] integerArray = { 1, 2, 3, 4, 5 };
		String[] stringArray = { "Hello", "World" };

		System.out.println("Printing integer array:");
		printArray(integerArray);

		System.out.println("Printing string array:");
		printArray(stringArray);
	}
}
