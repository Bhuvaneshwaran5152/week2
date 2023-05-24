package com.full.weekFour.collection.hashset;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {

		HashSet<String> countries = new HashSet<>();

		countries.add("USA");
		countries.add("Canada");
		countries.add("India");
		countries.add("India");
		countries.add(null);
		countries.add(null);

		boolean containsIndia = countries.contains("India");
		System.out.println("Contains India: " + containsIndia);

		countries.remove("Canada");

		int size = countries.size();
		System.out.println("Number of countries: " + size);

		System.out.println("All countries:");
		for (String country : countries) {
			System.out.println(country);
		}
	}
}
