package creational._6_prototype.factory;

import creational._6_prototype.object.*;

import java.util.HashMap;

public class CarFactory {
	private static int s_carCount = 0;
	private HashMap<Integer, Car> carMap = new HashMap<>();

	public void initialize() {
		addCar(new HomeCar("신형 가정용 자동차", 1212, "윤정도 가족"));
		addCar(new HomeCar("구형 가정용 자동차", 43, "윤형도 가족"));
		addCar(new HomeCar("최신형 가정용 자동차", 8444, "칼튼 가족"));

		addCar(new ElectricCar("최신형 전기 자동차", 8444, 1000));
		addCar(new ElectricCar("신형 전기 자동차", 4142, 500));
		addCar(new ElectricCar("구형 전기 자동차", 121, 200));

		addCar(new RacingCar("최신형 레이싱 자동차", 111, "익스트림 RTX5"));
		addCar(new RacingCar("신형 레이싱 자동차", 32, "GTX 1199"));
		addCar(new RacingCar("구형 레이싱 자동차", 13321, "NRVO RVO"));
	}
	
	private void addCar(Car car) {
		carMap.put(s_carCount++, car);
	}

	public int size() {
		return carMap.size();
	}

	public Car prototype(int id) {
		return carMap.get(id).prototype();
	}
}
