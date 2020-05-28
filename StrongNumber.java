package com.GS.medium;

public class StrongNumber {

	static void sumofFactorial(int input) {
		int remainder = 0;
		int fact = 1;
		int sum = 0;
		int temp = input;
		while (input > 0) {
			remainder = input % 10;
			System.out.println("reamaibder" + remainder);
			fact = 1;
			input = input / 10;
			for (int j = 1; j <= remainder; j++) {
				fact = fact * j;// (5*4*3*2*1) + (4*3*2*1)+(1)
				// System.out.println(fact);
			}
			sum = sum + fact;
			System.out.println(fact);
		}
		if (sum == temp) {
			System.out.println("This is the strongest number" + temp);
		} else {
			System.out.println("This is not the strongest number" + temp);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumofFactorial(145);
	}

}
