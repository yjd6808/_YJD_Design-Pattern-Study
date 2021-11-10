package structural._5_bridge.car;

import structural._5_bridge.engine.IEngine;

public class SuperCar extends Car {

	public SuperCar(IEngine engineImpl) {
		super(engineImpl);
	}

	@Override
	public void drive() {
		System.out.println("슈퍼 자동차 출발준비!!");
		engine.powerUp();
		System.out.println("슈퍼 자동차 휘이이이이잉 [날아가버림-]");
	}

	@Override
	public void stop() {
		System.out.println("일반 자동차 브레이크!");
		engine.powerDown();
		System.out.println("일반 자동차 끼이이익! 철커덩덩구리");
	}
}
