package com.full.weekThree.stringEx;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the sentence");
		// str = sc.nextLine();
		str = "\"Hello World, how are you?\"";
		System.out.println(revString(str));

	}

	public static String revString(String str) {
		String[] split = str.split("\\s");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = split.length - 1; i >= 0; i--) {
			stringBuilder.append(split[i]).append(" ");
		}
		return stringBuilder.toString().trim();
	}
}
