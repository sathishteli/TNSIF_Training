package org.tnsif.acc.c2tc.methodoverriding;

class PaymentMethod
{
	void makePayment() 
	{
		System.out.println("Processing Payment");
	}
}

class CreditCard extends PaymentMethod
{
	void swipeCard()
	{
		System.out.println("Swiping Credit Card");
	}
}

class PayPal extends PaymentMethod
{
	void loginToPaypal()
	{
		System.out.println("Login to paypal");
	}
}

public class InstanceOfDemo2 {

	public static void main(String[] args) {
		
		PaymentMethod payment = new PaymentMethod();
		
		payment = new CreditCard();
		
		if (payment instanceof CreditCard)
		{
			CreditCard cc = (CreditCard)payment;
			cc.swipeCard();
		}
	}

}
