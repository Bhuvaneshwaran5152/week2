package com.full.weekFour.collection.generics;

public class Box<T> {
	private T content;

	public Box(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public static void main(String[] args) {

		Box<Integer> integerBox = new Box<>(10);
		System.out.println("Content of integerBox: " + integerBox.getContent());

		Box<String> stringBox = new Box<>("Hello, World!");
		System.out.println("Content of stringBox: " + stringBox.getContent());

	}
}
