package com.full.weekThree.arrayEx;

public class Demo1 {
	static final int[] arr = new int[7];

	public static void main(String[] args) {
		arr[3] = 6;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
