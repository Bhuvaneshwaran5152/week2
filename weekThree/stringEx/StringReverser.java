package com.full.weekThree.stringEx;

public class StringReverser {
	public static String reverseString(String str) {
//		System.out.println(str);
		if (str.isEmpty()) {

			return str;
		}
		// System.out.println(str.substring(1) + str.charAt(0));
		// System.out.println(str.substring(1));
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String input = "Hello, World!";
		String reversed = reverseString(input);
		System.out.println("Reversed string: " + reversed);
	}
}
