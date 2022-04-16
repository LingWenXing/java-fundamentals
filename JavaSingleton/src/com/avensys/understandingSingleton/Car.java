package com.avensys.understandingSingleton;

public class Car {
	
	private static Car car = new Car("BMW");
	String brand;
	private Car(String brand) {
		this.brand = brand;
	}
	
	public static Car getCarData() {
		return car;
	}

}
