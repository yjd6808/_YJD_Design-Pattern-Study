package structural._5_bridge.car;

import structural._5_bridge.engine.IEngine;

public class NormalCar extends Car {

	public NormalCar(IEngine engineImpl) {
		super(engineImpl);
	}

	@Override
	public void drive() {
		System.out.println("일반 자동차 출발준비!!");
		engine.powerUp();
		System.out.println("일반 자동차 부르르르르룽!!");
	}

	@Override
	public void stop() {
		System.out.println("일반 자동차 브레이크!");
		engine.powerDown();
		System.out.println("일반 자동차 끼이이익!");
	}
}
