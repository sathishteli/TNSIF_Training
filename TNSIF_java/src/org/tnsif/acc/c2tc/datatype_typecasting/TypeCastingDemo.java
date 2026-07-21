package org.tnsif.acc.c2tc.datatype_typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		// Shopping Cart
		
		double pricePerItem = 99.50;
		int quantity = 3;
		double totalPrice = quantity * pricePerItem;
		
		// Narrowing
		
		double discount = 10.75;
		int roundedDiscount = (int)discount;
		System.out.println(roundedDiscount);
		
		double finalAmount = totalPrice - roundedDiscount;
		
		System.out.println("Online Shopping Summary ");
		System.out.println("Items Bought : "+ quantity);
		System.out.println("Price per Item : "+ pricePerItem);
		System.out.println("Final amount to be Paid : "+ finalAmount);
	}

}
