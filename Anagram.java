package com.GS.simple;

import java.util.Arrays;

public class Anagram {
	
	public static void sortAnagram(String input1, String input2){
		//O(n) time complexity
		 char[] sortedInput1 = input1.toCharArray();
	     Arrays.sort(sortedInput1);
		 char[] sortedInput2 = input2.toCharArray();
		 Arrays.sort(sortedInput2);
		 if(Arrays.equals(sortedInput1, sortedInput2)){
			 System.out.println("It is an Anagram");
		 }
	}
	
	public static boolean sortAnagram2(String input1, String input2){
		//O(n2) time complexity		 
			 char[] c = input1.toCharArray();
			 StringBuffer s2 = new StringBuffer(input2);
			 for(char character: c){
				 int index = s2.indexOf(""+character);
				 System.out.println(index);
				 if(index !=-1){
					 System.out.println(s2.charAt(index));
					 s2.deleteCharAt(index);
				 }else{
					 return false;
				 }
		 }
			 System.out.println(s2.length());
			return true;
	}
	

	
	public static void sortAnagramwith3Strings(String input1, String input2, String input3){

		// Remove any space and convert to lowercase
		input1 = input1.replaceAll("\\s", "").toLowerCase();
		input2 = input2.replaceAll("\\s", "").toLowerCase();
		input3 = input3.replaceAll("\\s", "").toLowerCase();
		
		 char[] sortedInput1 = input1.toCharArray();
	     Arrays.sort(sortedInput1);
		 char[] sortedInput2 = input2.toCharArray();
		 Arrays.sort(sortedInput2);
		 char[] sortedInput3 = input3.toCharArray();
		 Arrays.sort(sortedInput3);
		 if(Arrays.equals(sortedInput1, sortedInput2) && Arrays.equals(sortedInput2, sortedInput3)
				 && Arrays.equals(sortedInput1, sortedInput3)){
			 System.out.println("It is an Anagram");
		 }else{
			 System.out.println("Not an Anagram");			 
		 }
	}

	public static void main(String[] args) {
		//sortAnagram("tired", "tried");
		//sortAnagram2("tired", "tried");
		sortAnagramwith3Strings("tired", "tried","ired");
	}
}
