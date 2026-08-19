package org.tnsif.acc.c2tc.collectiondemo;

import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		List<Integer> numbers = new Vector<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		for (int num : numbers) {
			System.out.println(num);
		}
		
		
	}

}
