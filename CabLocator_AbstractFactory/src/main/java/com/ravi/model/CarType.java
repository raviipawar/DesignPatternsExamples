package com.ravi.model;

public enum CarType {

	Sedan, SUV, Luxury, Mini, Micro, Outstation
}

abstract class Car {
	Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}

	abstract void construct();

	CarType model = null;
	Location location = null;

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CarModel - " + model + "Located in -" + location;
	}

}

class LuxuryCar extends Car {

	LuxuryCar(Location location) {
		super(CarType.Luxury, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to luxury car");

	}
}

class MicroCar extends Car {

	MicroCar(Location location) {
		super(CarType.Micro, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to Micro car");

	}
}

class MiniCar extends Car {

	MiniCar(Location location) {
		super(CarType.Mini, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to Mini car");

	}
}

class OutStationCar extends Car {

	OutStationCar(Location location) {
		super(CarType.Outstation, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to OutStation car");

	}
}

class SedanCar extends Car {

	SedanCar(Location location) {
		super(CarType.Sedan, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to Sedan car");

	}
}

class SUVCar extends Car {

	SUVCar(Location location) {
		super(CarType.SUV, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to SUV car");

	}
}

class CarFactory {

	public static Car buildCar(CarType carType) {
		Car car = null;
		Location location = Location.UK;
		switch (location) {
		case USA:
			car = USAOutlet.buildCar(carType);
			break;

		case INDIA:
			car = IndiaOutlet.buildCar(carType);
			break;

		case UK:
			car = UKOutlet.buildCar(carType);
			break;

		default:
			car = DefaultOutlet.buildCar(carType);

		}

		return car;

	}
}
