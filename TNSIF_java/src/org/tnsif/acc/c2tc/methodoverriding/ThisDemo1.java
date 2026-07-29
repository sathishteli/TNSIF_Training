package org.tnsif.acc.c2tc.methodoverriding;

class Person
{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	void displayDetails()
	{
		System.out.println("Name : "+ name);
		System.out.println("Age ; "+ age);
	}
	
}

public class ThisDemo1 {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Ram");
		person.setAge(20);
		person.getName();
		person.getAge();
		person.displayDetails();
				
		person.setName("Sita");
		person.setAge(18);
		person.getName();
		person.getAge();
		person.displayDetails();
		
		person.setName("Lakshman");
		person.setAge(20);
		person.getName();
		person.getAge();
		person.displayDetails();
		
	}

}
