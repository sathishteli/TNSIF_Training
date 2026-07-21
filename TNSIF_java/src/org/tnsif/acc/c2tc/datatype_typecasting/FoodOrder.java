package org.tnsif.acc.c2tc.datatype_typecasting;

public class FoodOrder {

	public static void main(String[] args) {
		
		//primitive data type
		
		int orderId= 101;
		double price=299.99;
		boolean isDelivered = false ;
		char rating = 'A';
		float deliveryDistance = 5.3f;
		long deliveryBoyPhone= 9019869993L;
		byte deliveryTime= 45;
		short restaurantId= 12;
		
		//non-primitive data type
		
		String CustomerName= "Ram";
		String[] foodItem= {"burger", "Fries", "coke"};
		
		System.out.println("------Order Summary--------");
		System.out.println();
		System.out.println("Customer Name : "+ CustomerName);
		System.out.println("Order Id : "+ orderId);
		System.out.println("Restaurent Id : "+ restaurantId);
		System.out.println("Delivery Boy Number : "+ deliveryBoyPhone);
		System.out.println("Food Items : " );
		for (String item : foodItem) 
		{
			System.out.println(" - "+ item);
		}
		System.out.println("Total Price : "+ price);
		System.out.println("Delivery Distance : "+ deliveryDistance);
		System.out.println("Expected Time : "+ deliveryTime);
		System.out.println("Delivery Status : "+ isDelivered);
		System.out.println("Rating : " + rating);

	}

}
