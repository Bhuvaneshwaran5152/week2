package com.full.weekThree.stringPracticeday2;

import java.util.Scanner;

public class JoinTwoStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String 1");
		String input1 = input.nextLine();

		System.out.println("Enter the String 2");
		String input2 = input.nextLine();
		joinTwoStrings(input1, input2);
	}

	static void joinTwoStrings(String input1, String input2) {
		String output = null;
		output = input1.concat(" ").concat(input2);
		System.out.println(output);
	}
}
