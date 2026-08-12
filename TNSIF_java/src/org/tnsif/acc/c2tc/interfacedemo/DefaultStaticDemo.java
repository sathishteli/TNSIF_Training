package org.tnsif.acc.c2tc.interfacedemo;

interface Vehicle
{
	void start();
	void stop();
	int maxSpeed=120;
	
	public default void repair() 
	{
		System.out.println("We provide Repair Service");
	}
	
	static void checkMaintaince() {
		System.out.println("vehilce maintaince taken care here");
	}
}

class Car implements Vehicle
{
	private String model;
	
	Car(String model){
		this.model = model;
	}

	@Override
	public void start() {
		System.out.println("car "+ model + " starting");
		
	}
	
	public void repair()
	{
		System.out.println("we provide "+ model +" car service");
	}

	@Override
	public void stop() {
		System.out.println("car "+ model + " stopping");
	}
	
}

class Bike implements Vehicle
{
	private String type;
	
	Bike(String type){
		this.type = type;
	}

	@Override
	public void start() {
		System.out.println("Bike "+ type + " starting");
		
	}
	
	public void repair()
	{
		System.out.println("we provide "+ type +" bike service");
	}

	@Override
	public void stop() {
		System.out.println("Bike "+ type + " stopping");
	}
	
}


public class DefaultStaticDemo {

	public static void main(String[] args) {
		
		Vehicle car = new Car("BMW");
		Vehicle bike = new Bike("RX 100");
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		car.repair();
		bike.repair();
		
		Vehicle.checkMaintaince();
		
		System.out.println("MaxSpeed "+ Vehicle.maxSpeed);
		
	}

}
