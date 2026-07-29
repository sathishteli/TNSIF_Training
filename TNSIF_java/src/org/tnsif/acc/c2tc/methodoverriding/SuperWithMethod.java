package org.tnsif.acc.c2tc.methodoverriding;

class Payment1
{
	void process ()
	{
		System.out.println("Processing payment using standard gateway");
	}
}

class Gpay extends Payment1
{
	void process()
	{
		System.out.println("Processing payment using googlepay");
	}
	
	void CompleteTransaction()
	{
		super.process();
		process();
	}
}

public class SuperWithMethod {

	public static void main(String[] args) {
		Gpay obj = new Gpay();
		obj.CompleteTransaction();
		
	
	}

}
