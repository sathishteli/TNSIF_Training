package org.tnsif.acc.c2tc.java;

public class VariableDemo {
	int price=10;
	
	void print() {
		String msg="Hello";
		String msg2 = "World!";
		System.out.println(msg +" " +msg2);
	}
	
	static String message="Hello World!";

	public static void main(String[] args) {
		VariableDemo obj = new VariableDemo();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);
		
	}

}
