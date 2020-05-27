package com.GS.simple;

public class WeightString {
	
	public static void weightString(String str){
		int index = 0;
		int sum = 0,temp=0;
		for(int i=0;i< str.length();i++){
			if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
	        	 //System.out.println(str.charAt(i) - 'A');
	            index = str.charAt(i) - 'A'; 
	            //System.out.println(index);
	         }else if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') {
	        	 System.out.println(str.charAt(i) - 'a');
	            index = str.charAt(i) - 'a'; 
	            //System.out.println("a = " +index);
	         }
			sum = index + temp;
			temp = sum;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		weightString("Apple");
	}
}
