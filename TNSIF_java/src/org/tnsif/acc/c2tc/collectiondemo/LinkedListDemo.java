package org.tnsif.acc.c2tc.collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		
		System.out.println(fruits);
		System.out.println("Second Fruit " + fruits.get(1) );
		fruits.set(2, "cherry ");
		
		System.out.println(fruits);

		
		if(fruits.contains("Mango")) {
			System.out.println("mango is in the list");
		}
		
		for (String fruit : fruits) {
			System.out.println(fruit);
			
		}
	}

}
