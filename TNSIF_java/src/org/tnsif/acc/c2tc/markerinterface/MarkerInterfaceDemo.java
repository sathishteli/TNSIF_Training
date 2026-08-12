package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) 
	{
		Registerable s = new  Student(12, "ram", 20000, "java Programming");
		Registerable s1 = new Student(13, "Sita", 30000, "Java Programing");
		
		Object obj = new Object();
		
		if (s instanceof Registerable) {
			System.out.println("Student has Registered");
		}
		
		else {
			System.out.println("Student has not Registered");
		}
		
		

	}

}
