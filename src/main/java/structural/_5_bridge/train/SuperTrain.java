package structural._5_bridge.train;

import structural._5_bridge.car.Car;
import structural._5_bridge.engine.IEngine;

public class SuperTrain extends Train {

	public SuperTrain(IEngine engineImpl) {
		super(engineImpl);
	}

	@Override
	public void run() {
		System.out.println("���� ���� �޸��غ�!!");
		engine.powerUp();
		System.out.println("���� ���� ġġġġġġĢ ���������k��!");
	}

	@Override
	public void stop() {
		System.out.println("���� ���� ��������");
		engine.powerDown();
		System.out.println("���� ���� ����");
	}
}
