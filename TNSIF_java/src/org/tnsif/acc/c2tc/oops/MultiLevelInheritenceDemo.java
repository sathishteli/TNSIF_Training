package org.tnsif.acc.c2tc.oops;

class Device
{
	void deviceType() 
	{
		System.out.println("I'm an electronic Device");
	}
}

class Phone extends Device
{
	void brand()
	{
		System.out.println("Brand : Samsung ");
	}
}

class SmartPhone extends Phone
{
	void features()
	{
		System.out.println("Features : TouchScreen, Camera, Internet");
	}
}
public class MultiLevelInheritenceDemo {

	public static void main(String[] args) {
		SmartPhone smart = new SmartPhone();
		smart.brand();
		smart.deviceType();
		smart.features();
		
	}

}
