/**
 * 
 */
package com.ravi.practise;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author Ravindra
 *
 */
public class ForEachExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i <= 10; i++) {
			list.add(i, "abc");
		}
		MyConsumers action = new MyConsumers();
		list.forEach(action);
	}
}

class MyConsumers implements Consumer<String> {

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println("Values implemented from Consumer interface :" + t);

	}
}
