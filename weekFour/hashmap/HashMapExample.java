package com.full.weekFour.collection.hashmap;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {

		HashMap<String, Integer> studentScores = new HashMap<>();

		studentScores.put("Alice", 90);
		studentScores.put("Bob", 80);
		studentScores.put("Charlie", 95);
		studentScores.put("Barry", 95);

		int aliceScore = studentScores.get("Alice");
		System.out.println("Alice's score: " + aliceScore);

		boolean containsBob = studentScores.containsKey("Bob");
		System.out.println("Contains Bob: " + containsBob);
		studentScores.put("Charlie", 100);

		studentScores.remove("Alice");

		System.out.println("All student scores:");
		for (String name : studentScores.keySet()) {
			int score = studentScores.get(name);
			System.out.println(name + ": " + score);
		}
	}
}
