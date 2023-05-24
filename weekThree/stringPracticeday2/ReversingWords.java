package com.full.weekThree.stringPracticeday2;

import java.util.ArrayList;
import java.util.List;

public class ReversingWords {
	public static void main(String[] args) {
		String input = "hello java? Hello World";
		String revString = RevString(input);
		System.out.println(revString);
	}

	static String RevString(String input) {
		String[] split = input.split(" ");
		List output = new ArrayList<>();

		for (int i = split.length - 1; i >= 0; i--) {
			output.add(split[i]);
		}
		return output.toString();
	}
}
