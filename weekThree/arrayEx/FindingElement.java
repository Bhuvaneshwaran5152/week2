package com.full.weekThree.arrayEx;

import java.util.Scanner;

public class FindingElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer[] arr = new Integer[5];
		int num = 5;

//		try {
//			arr[10] = 10;
//		} catch (IndexOutOfBoundsException e) {
//			e.getMessage();
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for index :" + i);
			arr[i] = input.nextInt();
		}
		findElement(arr, num);
	}

	static void findElement(Integer[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("found in index :" + i);
			}
		}

	}
}
