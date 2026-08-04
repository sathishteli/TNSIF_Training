package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.util.Scanner;

public class ScannerCharDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		char c = sc.next().charAt(1);
		System.out.println("second char in string is : "+ c);
		sc.nextLine();
		System.out.println("Enter the word");
		String word= sc.nextLine();
		System.out.println("the string is :" + word);
		sc.close();

	}

}
