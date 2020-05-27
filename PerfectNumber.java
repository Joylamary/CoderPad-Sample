package com.GS.medium;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

	public static void main(String[] args) {
		int number = 100;
		List<Integer> reslut = new ArrayList<>();
		for(int i=1; i<=number; i++){
			
			if(isPerfectNumber(i)){
				reslut.add(i);
			}
		}
		
		//System.out.println(reslut.toString());
		System.out.println(String.join(",", reslut.toString()));
		//reslut.stream().forEach(System.out::println);;
	}
	
	private static boolean isPerfectNumber(int input){
		int sum = 0;
		
		for(int i=1; i<input-1; i++){
			if(input%i ==0){
				sum = sum+i;
				//System.out.println("in if- i="+i+"\t sum="+sum);
			}
		}
		
		if(sum == input){
			return true;
		}else {
			return false;
		}
		
	}
}