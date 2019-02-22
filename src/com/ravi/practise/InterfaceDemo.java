package com.ravi.practise;

@FunctionalInterface
public interface InterfaceDemo {

	void abc();
	
	default void Demo(String str){
		System.out.println("Welcome to Demo Project By:"+str);
	}
}
