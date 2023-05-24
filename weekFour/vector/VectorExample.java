package com.full.weekFour.collection.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>(5);

		for (int i = 1; i <= 5; i++) {
			vector.add(i);
		}
		System.out.println(vector);
		Iterator iterator = vector.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();

		}

		System.out.println(vector);
	}

}
