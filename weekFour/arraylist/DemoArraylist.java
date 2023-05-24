package com.full.weekFour.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoArraylist {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		Iterator itr = list.iterator();
		ListIterator iterator = list.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------------");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
}
