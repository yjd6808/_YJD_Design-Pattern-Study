package creational._6_prototype.factory;

import creational._6_prototype.object.*;

import java.util.HashMap;

public class CarFactory {
	private static int s_carCount = 0;
	private HashMap<Integer, Car> carMap = new HashMap<>();

	public void initialize() {
		addCar(new HomeCar("���� ������ �ڵ���", 1212, "������ ����"));
		addCar(new HomeCar("���� ������ �ڵ���", 43, "������ ����"));
		addCar(new HomeCar("�ֽ��� ������ �ڵ���", 8444, "Įư ����"));

		addCar(new ElectricCar("�ֽ��� ���� �ڵ���", 8444, 1000));
		addCar(new ElectricCar("���� ���� �ڵ���", 4142, 500));
		addCar(new ElectricCar("���� ���� �ڵ���", 121, 200));

		addCar(new RacingCar("�ֽ��� ���̽� �ڵ���", 111, "�ͽ�Ʈ�� RTX5"));
		addCar(new RacingCar("���� ���̽� �ڵ���", 32, "GTX 1199"));
		addCar(new RacingCar("���� ���̽� �ڵ���", 13321, "NRVO RVO"));
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
