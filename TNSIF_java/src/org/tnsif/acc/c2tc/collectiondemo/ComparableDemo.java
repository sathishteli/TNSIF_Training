package org.tnsif.acc.c2tc.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Person6 implements Comparable<Person6>{
	
	String name;
	int age;
	
	public Person6(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void dispaly() {
		System.out.println("Name: "+ name +" | Age: "+age);
	}

	@Override
	public int compareTo(Person6 other) {
		return this.name.compareTo(other.name);
	}
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Person6> people = new ArrayList<>();
		people.add(new Person6("Ram", 40));
		people.add(new Person6("Lakshman", 30));
		people.add(new Person6("Sita", 34));
		
		Collections.sort(people);
		
		for(Person6 person : people) {
			person.dispaly();
		}
		
	}

}
