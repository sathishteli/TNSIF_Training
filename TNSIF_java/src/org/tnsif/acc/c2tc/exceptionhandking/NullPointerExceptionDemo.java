package org.tnsif.acc.c2tc.exceptionhandking;

public class NullPointerExceptionDemo {

	public static void main(String[] args) 
	{
		
		String str = null;
		
		try {
		
		System.out.println(str.length()); 
		
		}catch(Exception e){
			
			System.out.println(e);
		}
		
		System.out.println("Hello");
		

	}

}
