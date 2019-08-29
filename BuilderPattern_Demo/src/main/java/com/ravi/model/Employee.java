package com.ravi.model;

import com.google.gson.Gson;

public class Employee {

//	required Parameters
	private String firstName;
	private String lastName;
	private String designation;
	private String[] address;

//  optional parameter
	private String age;
	private String phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public String[] getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public EmployeeBuilder toBuilder() {
		return new EmployeeBuilder().setFirstName(firstName).setLastName(lastName).setDesignation(designation)
				.setAddress(address).setAge(age).setPhoneNumber(phoneNumber);
	}

	public static class EmployeeBuilder {

		private Employee builder;

		public EmployeeBuilder() {
			builder = new Employee();
		}

		public EmployeeBuilder setFirstName(String firstName) {
			builder.firstName = firstName;
			return this;

		}

		public EmployeeBuilder setLastName(String lastName) {
			builder.lastName = lastName;
			return this;
		}

		public EmployeeBuilder setDesignation(String designation) {
			builder.designation = designation;
			return this;
		}

		public EmployeeBuilder setAddress(String[] address) {
			builder.address = address;
			return this;
		}

		public EmployeeBuilder setAge(String age) {
			builder.age = age;
			return this;
		}

		public EmployeeBuilder setPhoneNumber(String phoneNumber) {
			builder.phoneNumber = phoneNumber;
			return this;
		}

		public Employee getEmployee() {
			Employee employee = builder;
			builder = new Employee();
			return employee;

		}
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);

	}
}
