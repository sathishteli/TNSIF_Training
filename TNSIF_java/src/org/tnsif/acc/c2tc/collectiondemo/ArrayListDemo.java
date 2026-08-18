package org.tnsif.acc.c2tc.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		
		System.out.println(fruits);
		System.out.println("Second Fruit " + fruits.get(1) );
		fruits.set(2, "cherry ");
		
		if(fruits.contains("Mango")) {
			System.out.println("mango is in the list");
		}
		
		for (String fruit : fruits) {
			System.out.println(fruit);
			
		}
		
	}

}
