package structural._5_bridge.car;

import structural._5_bridge.engine.IEngine;

public class NormalCar extends Car {

	public NormalCar(IEngine engineImpl) {
		super(engineImpl);
	}

	@Override
	public void drive() {
		System.out.println("�Ϲ� �ڵ��� ����غ�!!");
		engine.powerUp();
		System.out.println("�Ϲ� �ڵ��� �θ���������!!");
	}

	@Override
	public void stop() {
		System.out.println("�Ϲ� �ڵ��� �극��ũ!");
		engine.powerDown();
		System.out.println("�Ϲ� �ڵ��� ��������!");
	}
}
