package com.full.weekFour.collection.generics;

import java.time.LocalDateTime;

public class GenericMethod {

	public static <T> String greet(T name) {
		return "Hello " + name;
	}

	public static <T, D> String date(T name, D date) {
		return date + " " + name;
	}

	public static void main(String[] args) {
		String greet = GenericMethod.<String>greet("Bhuvan");
		System.out.println(greet);
		String date = GenericMethod.<String, LocalDateTime>date("Leave", LocalDateTime.now());
		System.out.println(date);
	}
}
