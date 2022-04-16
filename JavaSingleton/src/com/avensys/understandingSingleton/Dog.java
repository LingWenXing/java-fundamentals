package com.avensys.understandingSingleton;

public class Dog {
	private static Dog dog = new Dog("Golden Retriever");
	String breed;
	private Dog(String breed) {
		this.breed = breed;
	}
	
	public static Dog getDogInfo() {
		return dog;
	}
}
