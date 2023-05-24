package com.full.weekFour.collection.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Zara", 10));
		list.add(new Employee("Shikamaro", 30));
		list.add(new Employee("Naruto", 60));
		list.add(new Employee("Sahura", 20));
		list.add(new Employee("Minato", 90));
		list.add(new Employee("Hinata", 1));
		list.add(new Employee("Lee", 3));

		System.out.println("---------Before Sorting------------");
		for (Employee employee : list) {
			System.out.println(employee);
		}

		System.out.println("\n----------Sorting By id-----------\n");
		Collections.sort(list);

		for (Employee employee : list) {
			System.out.println(employee);
		}

		System.out.println("\n----------Sorting by name-----------");
		Collections.sort(list, new NameComparator());

		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
