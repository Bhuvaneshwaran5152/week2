package com.full.weekThree.arrayEx;

import java.util.ArrayList;

public class ArrayIncreasingSubsequence {
	public static void main(String[] args) {
		int[] num = { 3, 4, -1, 0, 6, 2, 3, 8, 10 };
		ArrayList list = new ArrayList<>();
		int firstLargest = num[0];
		list.add(firstLargest);
		for (int i = 1; i < num.length; i++) {
			if (num[i] > firstLargest) {
				firstLargest = num[i];

				list.add(num[i]);
			}
		}
		Object[] output = list.toArray();
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		System.out.println(output.length);

	}
}
