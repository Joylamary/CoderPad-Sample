package com.GS.medium;

public class Numerology {

	/*
	 * Find out the numerology number for the given name as mentioned below:
	 * 
	 * Each alphabet represented with one number as given : A,I,J,Q,Y - 1
	 * B,K,R-2 C,G,L,S - 3 D,M,T - 4 E,H,N,X -5 U,V,W-6 O,Z-7 F-P-8
	 * 
	 * If input String is "S. KANAPATHY" then output should be 4. Ex: S.
	 * KANAPATHY ==> 3+2+1+5+1+8+1+4+5+1=31 (3+1) = 4
	 */
	static void findNumerology(String inputVal) {
		int sum=0;
		String input  = inputVal.replace(" ", "");
		for (int i = 0; i <= input.length() - 1; i++) {
			if ((input.charAt(i)=='A') || (input.charAt(i)=='I') ||
					(input.charAt(i)=='J') || (input.charAt(i)=='Y')) {
				sum=sum+1;
				System.out.print("1");
			}else if ((input.charAt(i)=='K') ) {
				sum=sum+2;
				System.out.print("2");
			}else if ((input.charAt(i)=='B')||
					(input.charAt(i)=='S') ) {
				sum=sum+3;
				System.out.print("3");
			}else if ((input.charAt(i)=='D') || (input.charAt(i)=='M') ||
					(input.charAt(i)=='T')) {
				sum=sum+4;
				System.out.print("4");
			}else if ((input.charAt(i)=='E') || (input.charAt(i)=='H') ||
					(input.charAt(i)=='N')) {
				sum=sum+5;
				System.out.print("5");
			}else if ((input.charAt(i)=='F') || (input.charAt(i)=='P')) {
				sum=sum+8;
				System.out.print("8");
			}
		}
		System.out.println(sum);
		
		int sumlength = Integer.toString(sum).length(); 
		int temp=0,totalsum=0;
		if(sumlength>1){
			while(sum > 0){
				totalsum = totalsum + (sum%10);
				temp = sum/10;
				sum = temp;
			}
		}else{
			totalsum = sum;
		}

		System.out.println(totalsum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="S.KANAPATHY";
		findNumerology(input);
	}

}
