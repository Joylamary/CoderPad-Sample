package com.GS.simple;

import java.util.ArrayList;

public class StringStartswith {

	public static void startswithLetter(String[] input, String prefix) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i <= input.length - 1; i++) {
			if (input[i].toLowerCase().startsWith(prefix)) {
				list.add(input[i]);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		String[] input = { "apple", "sample", "search", "cat", "Sister" };
		startswithLetter(input, "s");
	}

}
