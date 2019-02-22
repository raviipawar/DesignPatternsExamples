/**
 * 
 */
package com.ravi.practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Ravindra
 *
 */
public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			myList.add(i);

			// traverse using iterator old approach
			Iterator<Integer> it = myList.iterator();
			while (it.hasNext()) {
				Integer j = it.next();
				System.out.println("Values using Iterator" + j);

				// traversing using forEach Method
				myList.forEach(new Consumer<Integer>() {
					public void accept(Integer t) {
						System.out.println("output" + t);
					}
				});
				// traversing using Consumer Interface
				MyConsumer action = new MyConsumer();
				myList.forEach(action);
			}
		}
	}
}

class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Values implemented from Consumer interface" + t);
	}
}
