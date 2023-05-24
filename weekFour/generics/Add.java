package com.full.weekFour.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class Add {

	public static List addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		return list;
	}

	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		list.add(5.0);
		List addNumbers = addNumbers(list);
		System.out.println(list);
	}
}
