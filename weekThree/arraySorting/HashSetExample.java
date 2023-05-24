package com.full.weekThree.arraySorting;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		int[] array = { 2, 5, 8, 2, 9, 1, 5, 3, 8 };

		findDuplicates(array);
	}

	public static void findDuplicates(int[] array) {
		Set<Integer> uniqueSet = new HashSet<>();
		Set<Integer> duplicateSet = new HashSet<>();

		for (int num : array) {
			if (!uniqueSet.add(num)) {

				duplicateSet.add(num);
			}
		}
		for (int duplicate : duplicateSet) {
			System.out.println("Duplicate element: " + duplicate);
		}
	}
}
