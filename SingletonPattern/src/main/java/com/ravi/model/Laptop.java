package com.ravi.model;

/* creating a singleton class*/
public class Laptop {

	/*reference variable static*/
	private static Laptop laptop;

	
	private Laptop() {

	}

	public static Laptop getInstance() {

		if (laptop == null) {
			laptop = new Laptop();
		}
		return laptop;
	}
}