package com.ravi.model;

import com.ravi.factory.AbstractFactory;

public class Client {

	private ProductA productA;
	private ProductB productB;
	private AbstractFactory abstractFactory;

	public Client(AbstractFactory abstractFactory) {
		this.abstractFactory = abstractFactory;
	}

	public String operation() {
		System.out.println("Client  : Delegating creating objects to a factory object.");
		productA = abstractFactory.createProductA();
		productB = abstractFactory.createProductB();
		// Doing something appropriate on the created objects.
		return "Hello World from " + productA.getName() + " and " + productB.getName() + "!";
	}

}
