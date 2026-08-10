package org.tnsif.acc.c2tc.interfacedemo;

class SmartLight implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("Smart Light is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Smart light is off");
		
	}

	@Override
	public void standByMode() {
		System.out.println("Smart light i in stand by mode");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		SmartDevice smart = new SmartLight();
		smart.turnOff();
		smart.turnOff();
		smart.standByMode();

	}

}
