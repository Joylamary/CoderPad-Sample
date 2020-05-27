package com.GS.medium;

public class StrongNumber {
	
	static void sumofFactorial(int input){
		int remainder =0;
		int fact=1;
		int sum=0;
		for(int i=input;i>0;i=i/10){
			remainder = input%10;
			for(int j=1; j<=remainder;j++){
				fact=fact*j;
				System.out.println(fact);
			}
			   
	        System.out.println(+i);
	            sum =sum+fact;
	    }
	    if(sum==input){
	        System.out.println("This is the strongest number"+input);
	    }else{
	        System.out.println("This is not the strongest number"+input);
	    }
	       
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumofFactorial(143);
	}

}
