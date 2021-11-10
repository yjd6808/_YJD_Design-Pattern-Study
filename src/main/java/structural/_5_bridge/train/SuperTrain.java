package structural._5_bridge.train;

import structural._5_bridge.car.Car;
import structural._5_bridge.engine.IEngine;

public class SuperTrain extends Train {

	public SuperTrain(IEngine engineImpl) {
		super(engineImpl);
	}

	@Override
	public void run() {
		System.out.println("슈퍼 기차 달릴준비!!");
		engine.powerUp();
		System.out.println("슈퍼 기차 치치치치치치칙 폭포포포퐆폭!");
	}

	@Override
	public void stop() {
		System.out.println("슈퍼 기차 정지시작");
		engine.powerDown();
		System.out.println("슈퍼 기차 멈춤");
	}
}
