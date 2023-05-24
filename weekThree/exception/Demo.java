package com.full.weekThree.exception;

public class Demo {
	static int k;

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		//k = i / j;
		try {
			k = i / j;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
		System.out.println(k);
	}
}
