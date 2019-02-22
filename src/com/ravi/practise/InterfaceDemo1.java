package com.ravi.practise;

@FunctionalInterface
public interface InterfaceDemo1 {

	void demo(String str);
	
	default void hello(String str) {
		System.out.println("welcome : "+str);
	}
	static void print(String msg) {
		System.out.println("Your feed : "+msg);
	}
	
	/*// cannot override a method from java.lang.object
	default String toString() {
		return "hello";
	}*/
}
