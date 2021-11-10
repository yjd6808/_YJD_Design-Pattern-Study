package structural._5_bridge;


import structural._5_bridge.car.*;
import structural._5_bridge.train.*;
import structural._5_bridge.engine.*;

public class BridgeMain {
	public static void main(String[] args) {
		// 엔진을 런타임 중에 교체해주면서 차량의 엔진이 내부적으로 어떤 동작을 하는지 몰라도 상관없다.
		Car normalDieselCar = new NormalCar(new DieselEngine());
		Car superDieselCar = new SuperCar(new DieselEngine());
		Car normalGasolineCar = new NormalCar(new GasolineEngine());

		normalGasolineCar.drive();
		normalDieselCar.drive();
		superDieselCar.drive();

		normalGasolineCar.stop();
		normalDieselCar.stop();
		superDieselCar.stop();

		System.out.println("==============================");

		Train normalGasTrain = new NormalTrain(new GasEngine());
		normalGasTrain.run();
		normalGasTrain.stop();
	}
}
