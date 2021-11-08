package creational._6_prototype.object;

public class HomeCar extends Car {
	private String famliyName;

	protected HomeCar(HomeCar car) {
		super(car);

		this.famliyName = car.famliyName;
	}

	public HomeCar(String carName, int carId, String famliyName) {
		super(carName, carId);

		this.famliyName = famliyName;
	}

	public void setFamliyName(String famliyName) {
		this.famliyName = famliyName;
	}

	@Override
	public Car prototype() {
		return new HomeCar(this);
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("\t가족 이름 : " + famliyName);
	}
}
