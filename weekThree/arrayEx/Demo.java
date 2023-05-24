package com.full.weekThree.arrayEx;

public class Demo {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6 };
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		System.out.println();

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}

	}
}
