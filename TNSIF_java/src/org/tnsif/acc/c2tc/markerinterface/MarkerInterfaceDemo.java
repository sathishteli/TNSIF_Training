package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) 
	{
		Registerable s = new  Student(0, null, 0, null);
		Registerable s1 = new Student(0, null, 0, null);
		
		Object obj = new Object();
		
		if (s instanceof Registerable) {
			System.out.println("Student has Registered");
		}
		
		else {
			System.out.println("Student has not Registered");
		}
		
		

	}

}
