package com.day1;

import java.util.Scanner;

public class Problem_7_Leap_Year {
	public static void main (String[] args) {
		int year;
		System.out.println("PROGRAM TO CHECK IF THE GIVEN YEAR IS LEAP YEAR OR NOT");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year : ");
		year = sc.nextInt();
		
		if (((year % 4==0) && (year%100!=0)) || (year%400)==0 ) {
			System.out.println("Is a Leap year");
		}
		else {
			System.out.println("Is not a Leap year");
		}
	}

}
