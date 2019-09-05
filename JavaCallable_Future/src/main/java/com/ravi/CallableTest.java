package com.ravi;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTest implements Callable<Object> {

	@Override
	public Object call() throws Exception {
		Random generator = new Random();
		Integer randomNumber = generator.nextInt(5);

		Thread.sleep(1000);
		return randomNumber;
	}

}
