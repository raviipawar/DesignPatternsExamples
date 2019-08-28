package com.ravi.factory;

import com.ravi.model.ProductA;
import com.ravi.model.ProductA1;
import com.ravi.model.ProductB;
import com.ravi.model.ProductB1;

public class Factory1 implements AbstractFactory {

	
	public ProductA createProductA() {
		System.out.println("Factory1 creating object for ProductA1");
		return new ProductA1();
		
	}

	
	public ProductB createProductB() {
		System.out.println("Factory1 creating object for ProductB1");
		return new ProductB1();
	}

}
