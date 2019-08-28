package com.ravi.factory;

import com.ravi.model.ProductA;
import com.ravi.model.ProductA2;
import com.ravi.model.ProductB;
import com.ravi.model.ProductB2;

public class Factory2 implements AbstractFactory {
	public ProductA createProductA() {

		System.out.println("Factory2: Creating a ProductA2 object.");
		return new ProductA2();
	}

	public ProductB createProductB() {

		System.out.println("Factory2: Creating a ProductB2 object.");
		return new ProductB2();
	}

}
