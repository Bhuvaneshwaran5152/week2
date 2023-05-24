package com.full.weekThree.stringPracticeday2;

import java.util.Scanner;

public class CountingOccurence {
	public static void main(String[] args) {
		boolean b = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = in.nextLine();
		while (b) {
			System.out.println("Enter the character");

			char character = in.next().charAt(0);
			System.out.println("count of " + character + " is :" + CountingOccurence(input, character));
		}

	}

	static int CountingOccurence(String input, char input1) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == input1) {
				count++;
			}
		}
		return count;
	}
}
