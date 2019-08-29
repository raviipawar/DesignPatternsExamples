package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ravi.model.Employee;

@SpringBootApplication
public class BuilderPatternDemoApplication {

	private static Employee employee;

	public static void main(String[] args) {
		SpringApplication.run(BuilderPatternDemoApplication.class, args);

		employee = new Employee().toBuilder().setFirstName("Ravindra").setLastName("Pawar").getEmployee();// setting
																											// only few
																											// parameters
		System.out.println(employee);
	}
}
