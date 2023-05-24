package com.full.weekFour.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeExample {
	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<>();

		queue.addFirst("Hello");
		queue.add("Bhuvan");
		queue.addLast("Karthik");
		queue.add("Jeeva");
		queue.add("Prakash");
		queue.add("Jeeva");

		System.out.println(queue);
		System.out.println(queue.getLast());
	}
}
