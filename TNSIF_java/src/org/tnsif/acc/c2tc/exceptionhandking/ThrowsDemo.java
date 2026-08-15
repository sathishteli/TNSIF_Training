package org.tnsif.acc.c2tc.exceptionhandking;

import java.io.IOException;

public class ThrowsDemo {
	void println()
	{
		System.out.println("hello world");
	}
	
	void fileReading() throws IOException{
		System.out.println("");
	}
	
	void division () throws ArithmeticException, ClassNotFoundException{
		System.out.println("");
	}

	public static void main(String[] args) {
		
		
		
	}

}
