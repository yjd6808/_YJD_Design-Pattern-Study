package creational._6_prototype.object;

import java.util.HashMap;

public abstract class Car {
	protected String carName;
	protected int carId;

	protected Car(Car car) {
		this.carName = car.carName;
		this.carId = car.carId;
	}

	public Car(String carName, int carId) {
		this.carName = carName;
		this.carId = carId;
	}

	public abstract Car prototype();

	public void printInfo() {
		System.out.println("[차량 정보]");
		System.out.println("\tID : " + carId);
		System.out.println("\t차량 이름 : " + carName);
	}
}
