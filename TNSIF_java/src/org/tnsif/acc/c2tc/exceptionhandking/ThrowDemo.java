package org.tnsif.acc.c2tc.exceptionhandking;

public class ThrowDemo {

	public static void main(String[] args) {
		
		int age = 15;
		
		if(age<18) {
			throw new ArithmeticException("not eligible");
		}
		else {
			System.out.println("eligible");
		}
	}

}
