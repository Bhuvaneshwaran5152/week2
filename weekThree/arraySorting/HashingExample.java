package com.full.weekThree.arraySorting;

import java.util.HashMap;
import java.util.Map;

public class HashingExample {
	public static void main(String[] args) {
		int[] array = { 2, 5, 8, 2, 9, 1, 5, 3, 8 };

		findDuplicates(array);
	}

	public static void findDuplicates(int[] array) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : array) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			int num = entry.getKey();
			int frequency = entry.getValue();

			if (frequency > 1) {
				System.out.println("Duplicate element: " + num + ", Frequency: " + frequency);
			}
		}
	}
}
