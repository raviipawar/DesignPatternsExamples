package com.ravi.factory;

import com.ravi.model.ProductA;
import com.ravi.model.ProductB;

public interface AbstractFactory {

	 ProductA createProductA();
	 ProductB createProductB(); 
}
