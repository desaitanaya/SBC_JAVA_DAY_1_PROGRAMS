package com.day1;

public class Block {
	static int x=10;
	
	public static void main (String[] args) {
		System.out.println("Static variable value :" +x);
		myMethod();
	}
	
	static {
		System.out.println("Execution of Static block");
	}
	
	private static void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("Execution of Static method");
	}
	
	

}
