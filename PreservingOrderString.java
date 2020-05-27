package com.GS.simple;

public class PreservingOrderString {
	
	public static void reverseStringorderes(String input){
		for(int i=input.length()-1; i>=0; i--){
			System.out.print(input.charAt(i));
		}
	}
	
	public static void reverseSTringSrividya(String input){
		//String input = "abcd";
		// input = "I am a java developer";
				String[] words = input.split(" ");
				//Single word as input so reverse chars
				if(words.length==1){
					char[] chars = input.toCharArray();
					for(int i=chars.length-1; i>=0; i--){
						System.out.print(chars[i]);
					}
				}
				else{
					for(int i=words.length-1; i>=0; i--){
						System.out.print(words[i]+" ");
					}
				}

			}

	public static void main(String[] args) {
		String input = "I am joyla";
		reverseStringorderes(input);
	}

}
