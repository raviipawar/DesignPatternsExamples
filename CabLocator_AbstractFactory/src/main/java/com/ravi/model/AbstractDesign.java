package com.ravi.model;

public class AbstractDesign {

	public static void main(String[] args) {


        System.out.println(CarFactory.buildCar(CarType.Micro)); 
        System.out.println(CarFactory.buildCar(CarType.Mini)); 
        System.out.println(CarFactory.buildCar(CarType.Luxury)); 

        System.out.println(CarFactory.buildCar(CarType.Sedan)); 
        System.out.println(CarFactory.buildCar(CarType.Outstation)); 
        System.out.println(CarFactory.buildCar(CarType.SUV)); 
	}

}
