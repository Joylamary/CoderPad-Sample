package com.GS.medium;

public class Armstrong {
	
	public static int isArmstrong(int input){
		int remainder,sum=0,temp=0;
		int armStrong = input;
		while(armStrong>0){
			remainder = armStrong%10;
			temp = armStrong/10;
			//System.out.println("temp"+temp);
			sum = sum+(remainder*remainder*remainder);
			armStrong = temp;
		}
		System.out.println("sum"+sum);
		return sum;
	}
	
	public static int isArmstrongUsingFor(int input){
		int remainder,sum=0;
		for(int i=input;i>0;i=i/10){
			remainder = i%10;
			sum = sum+(remainder*remainder*remainder);
		}
		System.out.println("sum"+sum);
		return sum;
	}

	public static void main(String[] args) {
		int input= 153;
		System.out.println(isArmstrong(input));
		System.out.println(isArmstrongUsingFor(input));
	}

}
