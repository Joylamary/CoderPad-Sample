package com.GS.simple;

public class Fibonacci {

	public static int fibo(int numCount) {
		int fibo=1,fibo1=1,fibo2=1;
		for(int i=3;i<=numCount;i++){
				fibo = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = fibo;
				//System.out.print(fibo+",");
			}
		return fibo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCount = 5;
		int output;
		if (numCount == 0) {
			System.out.println("Not a valid number");
		}else if (numCount == 1 || numCount == 2) {
			output = 1;
			System.out.println("Fibo of" + numCount + ":" + output);
		}
		for (int i = 1; i <= numCount; i++) {
			System.out.print(fibo(i)+" ");
			//System.out.print(fibonaccireverse(i) + " "\n);
		}

	}

}
