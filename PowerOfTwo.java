package com.GS.simple;

public class PowerOfTwo {
	
	static boolean powerOfTwo(int inputNum, int powerOf){
		while(inputNum >=powerOf){
			if(inputNum%powerOf==0){
				inputNum = inputNum/powerOf;
			}
		}
		if(inputNum == 1){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(powerOfTwo(4, 2));
	}

}
