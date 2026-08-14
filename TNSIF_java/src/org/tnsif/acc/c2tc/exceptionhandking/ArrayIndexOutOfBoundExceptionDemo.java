package org.tnsif.acc.c2tc.exceptionhandking;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		int arr[] = new int[4];
		
		try {
			
			int i = arr[5];
			System.out.println(i);
			
		}catch(Exception e){
			
			System.out.println(e);
		}
	}

}
