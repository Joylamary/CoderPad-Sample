package com.GS.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void removeDuplicatesusingSet(String input) {
		Set<String> setval = new LinkedHashSet<String>();
		String[] exVal = input.split("!!");
		for (int i = 0; i <= exVal.length - 1; i++) {
			// System.out.println(exVal[i]);
			String[] exVal1 = exVal[i].split(" ");
			for (int j = 0; j <= exVal1.length - 1; j++) {
				setval.add(exVal1[j]);
			}
		}

		for (String e : setval) {
			System.out.print(e);
		}
	}

	public static void removeDupUsingArryList(String input) {
		String[] exVal = input.split(" ");
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> newlist = new ArrayList<>();
		if (!(exVal.length == 0)) {
			for (int i = 0; i <= exVal.length - 1; i++) {
				list.add(exVal[i]);
			}
		}
		for(String l:list){
			if(!newlist.contains(l)){
				newlist.add(l);
			}
			
		}
		System.out.println(newlist.toString());
	}
	
	public static void printWithoutDuplicates(String input){
		String[] parts = input.split(" ");
		
		HashSet<String> uniqueStrings = new HashSet<>();
		ArrayList<String> resultList = new ArrayList<>();
		for(String str : parts){
			if(!uniqueStrings.contains(str)){
				resultList.add(str);
				uniqueStrings.add(str);
			}
		}
		System.out.println(String.join(" ", resultList));
		
	}
	
	public static void removedupjava8(){	        
	        String str = 
	            "The first second was alright but the second second was tough."; 
	        str = Arrays.stream( str.split("\\s+")).distinct().collect(Collectors.joining(" ") );
	        System.out.println(str);
	    }

	public static void main(String[] args) {
		//String input = "Dear you Dear Miss";
		String input = "Good day day bye bye";
		//removeDuplicatesusingSet(input);
		//removeDupUsingArryList(input);
		//removedupjava8();
		printWithoutDuplicates(input);
	}
}
