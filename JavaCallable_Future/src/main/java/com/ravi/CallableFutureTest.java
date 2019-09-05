package com.ravi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {


		@SuppressWarnings("rawtypes")
		FutureTask[] randomNumberTasks = new FutureTask[5];
		
		for(int i = 0; i <5; i++) {
			Callable<?> callable = new CallableTest();
			randomNumberTasks[i] = new FutureTask<>(callable);
			
			Thread t = new Thread(randomNumberTasks[i]);
			t.start();
		}
		
		for(int i = 0; i<5;i++) {
			System.out.println(randomNumberTasks[i].get());
		}
	}

}
