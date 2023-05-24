package com.full.weekThree.stringEx;

public class StrFormat {

	public static void main(String args[]) {
		String str = "SACHINTENDULKAR";
		int age = 19;
		String s1 = new String("Hello");
		String s2 = new String(" World");
		String s = String.format("%s%s%d", s1, s2, 19);
		System.out.println(s.toString());
		System.out.println(str.substring(4, 10));

	}
}