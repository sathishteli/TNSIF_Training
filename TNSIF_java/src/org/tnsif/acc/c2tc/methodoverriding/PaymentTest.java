package org.tnsif.acc.c2tc.methodoverriding;

class Payment{
	void makePayment()
	{
		System.out.println("Processing payment using generic mecthod");
	}
}

class UpiPayment extends Payment
{
	void makePayment()
	{
		System.out.println("paymnet done using upi");
	}
}

class CardPayment extends Payment
{
	void makePayment()
	{
		System.out.println("paymnet done using Card");
	}
}
class WalletPayment extends Payment
{
	void makePayment()
	{
		System.out.println("paymnet done using Wallet");
	}
}

public class PaymentTest 
{
	public static void main(String[] args) {
		
		Payment payment;
		
		payment = new UpiPayment();
		payment.makePayment();
	
		payment = new CardPayment();
		payment.makePayment();
		
		payment = new WalletPayment();
		payment.makePayment();
}
}
