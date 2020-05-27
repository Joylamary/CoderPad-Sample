package com.GS.simple;

public class PowerOf10 {

	public static boolean ispowerOf10(int num, int powerOf) {
		while (num >= powerOf) {
			if (num % powerOf == 0) {
				num = num / powerOf;
			} else {
				break;
			}
		}
		if (num == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(ispowerOf10(100, 10));
		System.out.println(ispowerOf10(9, 3));
	}

}
