package com.full.weekFour.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();

		queue.add("Bhuvan");
		queue.add("Karthik");
		queue.add("Jeeva");
		queue.add("Prakash");
		queue.add("Jeeva");

		System.out.println(queue);
	}
}
