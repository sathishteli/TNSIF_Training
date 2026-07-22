package org.tnsif.acc.c2tc.oops;

public class FoodItem {
	
	String name;
	double price;
	String category;
	
	void displayDetails() {
		
		System.out.println("Food Name : "+ name);
		System.out.println("Price : "+ price);
		System.out.println("Category : "+ category);
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		
		FoodItem foodItem1=new FoodItem();
		foodItem1.name = "Burger";
		foodItem1.price = 299.99;
		foodItem1.category = "Fast Food";
		
		foodItem1.displayDetails();
		
		FoodItem foodItem2=new FoodItem();
		foodItem2.name = "Burger";
		foodItem2.price = 299.99;
		foodItem2.category = "Fast Food";
		
		foodItem2.displayDetails();
	}

}
