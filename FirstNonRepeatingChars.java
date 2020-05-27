package com.GS.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingChars {

	public static void firstnonrepeatChars(String input) {
		HashMap<Character, Integer> countChrsMap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (countChrsMap.containsKey(input.charAt(i))) {
				countChrsMap.put(input.charAt(i), countChrsMap.get(input.charAt(i)) + 1);
			} else {
				countChrsMap.put(input.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> e:countChrsMap.entrySet()){
			if(e.getValue() == 1){
			System.out.println(e.getKey()+"="+e.getValue());
			break;
			}
		}
	}
	
	public static void firstnonRepeatWithoutMap(){
		String input = "aaaaaaaaaaaaaabccb";
		input = input.replaceAll("\\s",  "").toLowerCase();
		char[] inputChars = input.toCharArray();

		char prevChar = inputChars[0];
		for(int i=1; i<inputChars.length; i++){
			
			if(prevChar==inputChars[i]){
				prevChar = inputChars[i];
				continue;
			}else{
				System.out.println("First non repeating char is -"
						+inputChars[i] +" is at index-"+i);
				break;
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ccbbbzffd";
		firstnonrepeatChars(input);
		firstnonRepeatWithoutMap();
	}

}
