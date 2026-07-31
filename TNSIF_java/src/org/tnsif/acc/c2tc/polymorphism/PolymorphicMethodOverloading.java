package org.tnsif.acc.c2tc.polymorphism;

class addition{
	
	int add(int num1, int num2) 
	{
		return num1+num2;
	}
	
	int add(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
}

public class PolymorphicMethodOverloading {

	public static void main(String[] args) {
		addition obj =new addition();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));

	}

}
