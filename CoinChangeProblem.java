package com.GS.complex;

public class CoinChangeProblem {

	/*
	 * A little girl has 5 ten rupee coins, 10 two rupee coins and 50 five rupee
	 * coins.
	 * 
	 * The needs 50 rupees out of this. Write a program to find all possible
	 * ways the girl can make 50 rupees.
	 * 
	 * 10 rupee - 5
	 * 2 rupee - 10
	 * 5 rupee - 50
	 */

	public static void main(String[] args) throws java.lang.Exception {
		countNumWays(); // my code, not as optimised as the one from net
		// countWaysOptimised();
	}


	private static void countNumWays() {
		int numberOfLoops = 0;
		int count = 0;
		for (int i = 0; i <= 10; i++) { // 10, 2 rupee coins
			// 10, 2 rupee coin loop
			// Since the sum is 50, u can pick 0, 5, 10 2 rupees to mke sum as
			// 50.So limit loop
			if (i % 5 == 0) {
				int newBalanceAmount = 0;
				// cant make 50 by picking odd number of 5 rupee note. So limit
				// to even numbers only
				for (int j = 0; j <= 50; j = j + 2) {// 50, 5 rupee coin
					newBalanceAmount = 50 - ((i * 2) + (j * 5));

					if (newBalanceAmount == 0) {
						numberOfLoops++;
						count++;
						break;
					} else if (newBalanceAmount < 0) {
						numberOfLoops++;
						break;
					}
					// Pick 10 rupee notes only if balance amt is divisible by
					// 10
					if (newBalanceAmount % 10 == 0) {
						for (int k = 0; k <= 5; k++) { // 5, 10 rupee coing
							numberOfLoops++;
							if (newBalanceAmount - k * 10 == 0) {
								// numberOfLoops++;
								System.out.println("2*" + i + " + 5*" + j + " + 10*" + k + "= 50");
								count++;
								break;
							} else if (newBalanceAmount - k * 10 < 0) {

								break;
							}
						}
					}
				}
			}
		}

		System.out.println("Count-" + count + "\t num of loops" + numberOfLoops);
	}
}
