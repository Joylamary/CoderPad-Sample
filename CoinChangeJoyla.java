package com.GS.complex;

public class CoinChangeJoyla {
	
	/*10 rupee - 5
	 * 2 rupee - 10
	 * 5 rupee - 50*/
	private static void countNumWays(int num) {
		int newbal = 0,numberOfLoops=0;
		int count = 0;
		for(int i=0; i<=10;i++){
			newbal = 50 -(i*2);
			if(newbal == 0){
				numberOfLoops++;
				System.out.println("Two Rupee *"+i);
				count++;
				break;
			}else if(newbal < 0){
				numberOfLoops++;
				count++;
				break;
			}
			for(int j= 2; j<=50 ; j=j+2){
				newbal = newbal -(j*5);
				if(newbal == 0){
					numberOfLoops++;
					System.out.println("Two Rupee *"+i+"Five rupee *"+j);
					count++;
					break;
				}else if(newbal < 0){
					numberOfLoops++;
					count++;
					break;
				}
				for(int k=0; k<=5; k++){
					newbal = newbal -(k*5);
					numberOfLoops++;
					if(newbal == 0){
						System.out.println("Two Rupee *"+i+"Five rupee *"+j+"Ten rupee *"+k);
						count++;
						break;
					}else if(newbal < 0){
						count++;
						break;
					}
					
				}
			}
		}
		System.out.println("numberOfLoops =" +numberOfLoops);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countNumWays(50);
	}

}
