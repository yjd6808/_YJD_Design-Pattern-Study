package creational._6_prototype.object;

public class RacingCar extends Car {
	private String modelName;

	protected RacingCar(RacingCar car) {
		super(car);

		this.modelName = car.modelName;
	}

	public RacingCar(String carName, int carId, String modelName) {
		super(carName, carId);

		this.modelName = modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public Car prototype() {
		return new RacingCar(this);
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("\t¸ðµ¨ ÀÌ¸§ : " + modelName);
	}
}
