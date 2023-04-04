package com.day1;

public class Problem_4_Sum {
	public static void main(String[] values) {
		int sum=0;
		System.out.println("Following values are : ");
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
			sum=sum+Integer.parseInt(values[i]);
		}
		System.out.println("Sum of the values is :" +sum);
	}

}
