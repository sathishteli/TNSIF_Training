package org.tnsif.acc.c2tc.exceptionhandking;

public class StringIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		try {
			
			char ch = str.charAt(5);
			System.out.println(ch);
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		System.out.println("hello");
	}

}
