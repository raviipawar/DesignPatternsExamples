package com.ravi.model;

public enum Location {

	DEFAULT, USA, INDIA, UK
}

class IndiaOutlet {
	static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case Micro:
			car = new MicroCar(Location.INDIA);
			break;
		case Mini:
			car = new MiniCar(Location.INDIA);
			break;
		case Sedan:
			car = new SedanCar(Location.INDIA);
			break;
		case Outstation:
			car = new OutStationCar(Location.INDIA);
			break;
		case Luxury:
			car = new LuxuryCar(Location.INDIA);
			break;
		case SUV:
			car = new SUVCar(Location.INDIA);
			break;

		default:
			break;
		}
		return car;
	}
}

class UKOutlet {
	static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case Micro:
			car = new MicroCar(Location.UK);
			break;
		case Mini:
			car = new MiniCar(Location.UK);
			break;
		case Sedan:
			car = new SedanCar(Location.UK);
			break;
		case Outstation:
			car = new OutStationCar(Location.UK);
			break;
		case Luxury:
			car = new LuxuryCar(Location.UK);
			break;
		case SUV:
			car = new SUVCar(Location.UK);
			break;

		default:
			break;
		}
		return car;
	}
}

class USAOutlet {
	static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case Micro:
			car = new MicroCar(Location.USA);
			break;
		case Mini:
			car = new MiniCar(Location.USA);
			break;
		case Sedan:
			car = new SedanCar(Location.USA);
			break;
		case Outstation:
			car = new OutStationCar(Location.USA);
			break;
		case Luxury:
			car = new LuxuryCar(Location.USA);
			break;
		case SUV:
			car = new SUVCar(Location.USA);
			break;

		default:
			break;
		}
		return car;
	}
}

class DefaultOutlet {
	static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case Micro:
			car = new MicroCar(Location.DEFAULT);
			break;
		case Mini:
			car = new MiniCar(Location.DEFAULT);
			break;
		case Sedan:
			car = new SedanCar(Location.DEFAULT);
			break;
		case Outstation:
			car = new OutStationCar(Location.DEFAULT);
			break;
		case Luxury:
			car = new LuxuryCar(Location.DEFAULT);
			break;
		case SUV:
			car = new SUVCar(Location.DEFAULT);
			break;

		default:
			break;
		}
		return car;
	}
}