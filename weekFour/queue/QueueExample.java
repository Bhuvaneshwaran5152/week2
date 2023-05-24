package com.full.weekFour.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		queue.add("Bhuvan");
		queue.add("Karthik");
		queue.add("Jeeva");
		queue.add("Prakash");
		queue.add("Jeeva");

		System.out.println(queue);

		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue);

		queue.add("Bhuvan");
		System.out.println(queue);

	}
}
