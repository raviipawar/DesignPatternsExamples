package com.ravi;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ravi.model.Laptop;

@SpringBootApplication
public class SingletonPatternApplication {

	public static void main(String[] args) {
		/* checking whether returning single object or not*/
		
		Laptop l1 = Laptop.getInstance();
		Laptop l2 = Laptop.getInstance();
		
		if (l1.equals(l2)) {
			System.out.println("Same object is referenced by both reference variables l1 and l2");
		}
		else {
			System.out.println("Different object is referenced");
		}
	}

}
