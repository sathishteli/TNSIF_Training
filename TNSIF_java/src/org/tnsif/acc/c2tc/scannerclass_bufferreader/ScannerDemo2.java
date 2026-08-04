package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your name :");
		String name = sc.nextLine();
		
		System.out.println(" Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter your height : ");
		float height = sc.nextFloat();
		
		System.out.println("are u a student : ");
		boolean is_student = sc.nextBoolean();
		
		System.out.println("Enter your aadhar number : ");
		long aadhar = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter your fav teacher name : ");
		String teacher = sc.nextLine();
		
		System.out.println(" Enter your hobby : ");
		String hobby = sc.nextLine();
		
		System.out.println("enter your study hours : ");
		byte readingtime = sc.nextByte();
		
		System.out.println("Enter you cgpa : ");
		double cgpa = sc.nextDouble();
		
		System.out.println("No of siblings : ");
		short siblings = sc.nextShort();
		
		System.out.println("Student Information ");
		System.out.println("Name : "+name);
		System.out.println("Age : "+ age);
		System.out.println("Height : "+ height);
		System.out.println("Is student ? :"+is_student);
		System.out.println("Aadhar Number : "+ aadhar);
		System.out.println("Fav Teacher : "+teacher);
		System.out.println("Hobby : "+ hobby);
		System.out.println("Reading Time : "+ readingtime);
		System.out.println("CGPA : "+cgpa);
		System.out.println("Siblings : "+ siblings);
		
		sc.close();
		
	}

}
