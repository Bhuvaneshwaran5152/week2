package com.full.weekThree.stringPracticeday2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String input1 = "listen";
		String input2 = "silent";
		Boolean anagram = anagram(input1.replace(" ", "").toLowerCase(), input2.replace(" ", "").toLowerCase());
		if (anagram) {
			System.out.println("It is a anagram");
		} else {
			System.out.println("It is not a anagram");
		}
	}

	static Boolean anagram(String input1, String input2) {
		if (input1.length() != input2.length()) {
			System.out.println("length differs");
			return false;
		}

		char[] charArr1 = input1.toCharArray();
		char[] charArr2 = input2.toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);

		return Arrays.equals(charArr1, charArr2);

	}
}
