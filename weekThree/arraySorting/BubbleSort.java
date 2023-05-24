package com.full.weekThree.arraySorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		int[] arr = { 6, 889, 223, 0, 34, 7, 5, 23 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		bubbleSort(arr);

	}

	static void bubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
}
