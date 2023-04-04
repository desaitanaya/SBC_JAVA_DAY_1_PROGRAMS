package com.day1;

import java.util.Scanner;

public class Problem_3_String {
	public static void main (String[] args) {
		String str1, str2;
		System.out.println("PROGRAM TO CHECK IF TWO STRINGS ARE EQUAL OR NOT");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		str1=sc.nextLine();
		System.out.println("Enter the second string : ");
		str2=sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println("Both the strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
	}
}
