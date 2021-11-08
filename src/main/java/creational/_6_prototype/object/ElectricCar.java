package creational._6_prototype.object;

public class ElectricCar extends Car {
	private int maxWatt;

	protected ElectricCar(ElectricCar car) {
		super(car);

		this.maxWatt = car.maxWatt;
	}

	public ElectricCar(String carName, int carId, int maxWatt) {
		super(carName, carId);

		this.maxWatt = maxWatt;
	}

	public void setMaxWatt(int maxWatt) {
		this.maxWatt = maxWatt;
	}

	@Override
	public Car prototype() {
		return new ElectricCar(this);
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("\t최대 와트 : " + maxWatt);
	}
}
