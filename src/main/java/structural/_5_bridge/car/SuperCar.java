package structural._5_bridge.car;

import structural._5_bridge.engine.IEngine;

public class SuperCar extends Car {

	public SuperCar(IEngine engineImpl) {
		super(engineImpl);
	}

	@Override
	public void drive() {
		System.out.println("���� �ڵ��� ����غ�!!");
		engine.powerUp();
		System.out.println("���� �ڵ��� ������������ [���ư�����-]");
	}

	@Override
	public void stop() {
		System.out.println("�Ϲ� �ڵ��� �극��ũ!");
		engine.powerDown();
		System.out.println("�Ϲ� �ڵ��� ��������! öĿ��������");
	}
}
