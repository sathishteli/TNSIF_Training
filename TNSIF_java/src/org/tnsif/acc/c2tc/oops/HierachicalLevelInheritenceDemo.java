package org.tnsif.acc.c2tc.oops;

class Employee
{
	void company() {
		System.out.println("company : TNSIF");
	}
}

class Developer extends Employee{
	void role()
	{
		System.out.println("role : Softwere Developer");
	}
}

class Tester extends Employee{
	void role()
	{
		System.out.println("role : QA Tester");
	}
}
public class HierachicalLevelInheritenceDemo {

	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.company();
		dev.role();
		
		Tester test = new Tester();
		test.company();
		test.role();
	}

}
