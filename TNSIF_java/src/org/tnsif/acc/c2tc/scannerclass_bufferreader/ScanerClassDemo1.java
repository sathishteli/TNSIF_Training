package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.util.Scanner;

public class ScanerClassDemo1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("my name is : "+ name);
		System.out.println("my age is : "+ age);
		sc.close();
	}

}
