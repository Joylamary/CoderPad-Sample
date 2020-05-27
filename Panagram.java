package com.GS.simple;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Panagram {

	private static final int ALPHABET_COUNT = 26;

	public static void main(String[] args) {
		String str = "T quick brwn fox jmps v he lazy dg";
		//isPangram();
		System.out.println(isPerfectPangram(str));
	}

	public static void isPangram() {
		String str = "The quick brown fox jumps over the lzy dog";
		boolean[] alphaList = new boolean[26];
		int index = 0;
		int flag = 1;
		for (int i = 0; i < str.length(); i++) {
			System.out.println("str.charAt(i)" + str.charAt(i));
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				index = str.charAt(i) - 'A';
				System.out.println(index);
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				index = str.charAt(i) - 'a';
				// System.out.println("a = " +index);
			}
			alphaList[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (alphaList[i] == false)
				flag = 0;
		}
		System.out.print("String: " + str);
		if (flag == 1)
			System.out.print("\nThe above string is a pangram.");
		else
			System.out.print("\nThe above string is not a pangram.");
	}

	public static boolean isPerfectPangram(String str) {
		if (str == null) {
			return false;
		}
		String strUpper = str.toUpperCase();

		Stream<Character> filteredCharStream = strUpper.chars().filter(item -> ((item >= 'A' && item <= 'Z')))
				.mapToObj(c -> (char) c);
		//filteredCharStream.forEach(System.out::println);
		Map<Character, Long> alphabetFrequencyMap = filteredCharStream
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return alphabetFrequencyMap.size() == ALPHABET_COUNT
				&& alphabetFrequencyMap.values().stream().allMatch(item -> item == 1);
	}
}
