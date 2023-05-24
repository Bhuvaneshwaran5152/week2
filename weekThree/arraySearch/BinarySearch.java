package com.full.weekThree.arraySearch;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[10000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		int target = 999999;
		Arrays.sort(arr);
		// System.out.println(System.currentTimeMillis());
		long currentTimeMillis = System.currentTimeMillis();
		int index = binarySearch(arr, target);

		if (index != -1) {
			System.out.println("The target value is in index :" + index);
		} else {
			System.out.println("The target value is not in this array");
		}
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
	}

	static int binarySearch(int[] arr, int target) {
		Arrays.sort(arr);
		int mid = arr.length / 2;
		if (target > arr[mid]) {
			for (int i = mid; i < arr.length - 1; i++) {
				if (target == arr[i]) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < mid; i++) {
				if (target == arr[i]) {
					return i;
				}
			}
		}

		return -1;
	}
}
