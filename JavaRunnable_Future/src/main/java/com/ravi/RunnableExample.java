package com.ravi;

import java.util.Random;

public class RunnableExample implements Runnable {

	private Object result = null;
	
	@Override
	public void run() {
		Random generator =  new Random();
		Integer randomNumber =  generator.nextInt(5);
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		result = randomNumber;
		synchronized (this) {
			notifyAll();
		}
	}

	public synchronized Object get() throws InterruptedException{
		while(result==null) {
			wait();
			return result;
		}
		return result;
	}

}
