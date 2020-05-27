package com.GS.simple;

import java.util.*;

public class SecondSmallestElement {
	public static int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return a[1];
	}

	public static int[] getSecondSmallestLoop(int[] a) {
		int[] orderNum = new int[a.length];
		int min = Integer.MIN_VALUE;
		System.out.println(a.length);
		for (int i = 0; i <= a.length-1; i++) {
			if (orderNum[i] > min) {
				orderNum[i] = a[i];}
		}
		System.out.println(orderNum[1]);
		return orderNum;

	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second Smallest: " + getSecondSmallest(a));
		System.out.println("Second Smallest: " + getSecondSmallest(b));
		System.out.println("Second Smallest: " + Arrays.toString(getSecondSmallestLoop(b)));
	}
}
