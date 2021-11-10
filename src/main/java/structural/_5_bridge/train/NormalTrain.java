package structural._5_bridge.train;

import structural._5_bridge.car.Car;
import structural._5_bridge.engine.IEngine;

public class NormalTrain extends Train {

	public NormalTrain(IEngine engineImpl) {
		super(engineImpl);
	}

	@Override
	public void run() {
		System.out.println("일반 기차 달릴준비!!");
		engine.powerUp();
		System.out.println("일반 기차 칙칙 폭폭!");
	}

	@Override
	public void stop() {
		System.out.println("일반 기차 정지시작!@");
		engine.powerDown();
		System.out.println("일반 기차 삐리리리리링!????");
	}
}
