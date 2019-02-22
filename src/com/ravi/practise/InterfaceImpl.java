package com.ravi.practise;

public class InterfaceImpl implements InterfaceDemo, InterfaceDemo1 {

	@Override
	public void demo(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void hello(String str) {
		System.out.println("MyClass logging::" + str);
		InterfaceDemo1.print("abc");
	}

}
