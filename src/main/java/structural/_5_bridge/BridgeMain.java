package structural._5_bridge;


import structural._5_bridge.car.*;
import structural._5_bridge.train.*;
import structural._5_bridge.engine.*;

public class BridgeMain {
	public static void main(String[] args) {
		// ������ ��Ÿ�� �߿� ��ü���ָ鼭 ������ ������ ���������� � ������ �ϴ��� ���� �������.
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
