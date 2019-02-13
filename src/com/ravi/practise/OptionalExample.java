/**
 * 
 */
package com.ravi.practise;

import java.util.Optional;

/**
 * <h1>OptionalExample</h1>
 * <p>
 * This is the OptionalExample model, it consist of all related fields getters
 * </p>
 *
 * @author Ravindra Pawar 02-Jan-2019 3:33:52 PM
 */
public class OptionalExample {

	public static void main(String args[]) {

		OptionalExample abc = new OptionalExample();
		Integer value = null;
		Integer value2 = new Integer(10);

		Optional<Integer> a = Optional.ofNullable(value);
		Optional<Integer> b = Optional.of(value2);
		System.out.println(abc.sum(a, b));
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// Optional.isPresent - checks the value is present or not

		System.out.println("First parameter is present: " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());

		// Optional.orElse - returns the value if present otherwise returns
		// the default value passed.
		Integer value = a.orElse(new Integer(0));

		// Optional.get - gets the value, value should be present
		Integer value2 = b.get();
		return value + value2;

	}
}
