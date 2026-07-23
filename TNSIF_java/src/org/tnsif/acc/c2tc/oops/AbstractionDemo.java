package org.tnsif.acc.c2tc.oops;

public class AbstractionDemo {

	public static void main(String[] args) {
		MaheshDemo obj = new Suresh();
		obj.calling();
		obj.aiIntegration();
		obj.healthMonitoring();
		obj.satellitecomm();
}
}
abstract class MaheshDemo
{
	void calling() {
		System.out.println("phone is having calling feature");
	}
	
	abstract void aiIntegration();
	abstract void satellitecomm();
	abstract void healthMonitoring();
	
}

abstract class Ramesh extends MaheshDemo
{

	@Override
	void aiIntegration() {
		System.out.println("phone is having aiIntegration feature");
		
	}

	@Override
	abstract void satellitecomm();

	@Override
	abstract void healthMonitoring();
	
}

class Suresh extends Ramesh 
{
	@Override
	void satellitecomm() {
		System.out.println("phone is having satellitecomm feature");
	}

	@Override
	void healthMonitoring() {
		System.out.println("phone is having healthMonitoring feature");
	}
}
