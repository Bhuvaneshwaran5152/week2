package com.full.weekThree.stringEx;

import java.util.Iterator;

public class Palindrome {
	public static void main(String[] args) {
		String string = "racecar";
		// StringBuffer buffer = new StringBuffer(string);
		Boolean stringPalindrome = stringPalindrome(string);
		if (stringPalindrome) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrom");
		}

//		if (buffer.reverse().toString().equals(string)) {
//			System.out.println("palindrome");
//		} else {
//			System.out.println("Not a palindrome");
//		}

	}

	public static Boolean stringPalindrome(String str) {
		int start = 0, end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
