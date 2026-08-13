package org.tnsif.acc.c2tc.exceptionhandking;

public class ErrorsDemo {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20; // compile time error when we miss a semicolon
		
		int sum = add(num1, num2);
		System.out.println(sum);
		
	}

	public static int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2; //logical error
	}

}
