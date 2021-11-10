package structural._5_bridge.train;

import structural._5_bridge.car.Car;
import structural._5_bridge.engine.IEngine;

public class NormalTrain extends Train {

	public NormalTrain(IEngine engineImpl) {
		super(engineImpl);
	}

	@Override
	public void run() {
		System.out.println("�Ϲ� ���� �޸��غ�!!");
		engine.powerUp();
		System.out.println("�Ϲ� ���� ĢĢ ����!");
	}

	@Override
	public void stop() {
		System.out.println("�Ϲ� ���� ��������!@");
		engine.powerDown();
		System.out.println("�Ϲ� ���� �߸���������!????");
	}
}
