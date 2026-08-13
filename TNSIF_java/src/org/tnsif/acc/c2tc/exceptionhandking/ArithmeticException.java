package org.tnsif.acc.c2tc.exceptionhandking;

public class ArithmeticException {

	public static void main(String[] args) {
		
		int num1 = 50 / 5;
		System.out.println(num1);
		
		int num2 = 50 / 10;
		System.out.println(num2);
		
		int num3 = 50 / 0; //distrubing the flow of program, throws an error.
		System.out.println(num3);
		
		int num4 = 50 / 25; //wont be executed.
		System.out.println(num4);
	}

}
