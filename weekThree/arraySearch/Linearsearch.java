package com.full.weekThree.arraySearch;

public class Linearsearch {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[10000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		int target = 7777777;
		// int target = 77;
		System.out.println(System.currentTimeMillis());
		int index = linearSearch(arr, target);
		System.out.println(System.currentTimeMillis());
		if (index != -1) {
			System.out.println("The target value is in index :" + index);
		} else {
			System.out.println("The target value is not in this array");

		}
		System.out.println(System.currentTimeMillis());
	}

	static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;

			}

		}
		return -1;
	}
}
