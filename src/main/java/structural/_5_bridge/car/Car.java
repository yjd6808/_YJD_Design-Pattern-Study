package structural._5_bridge.car;

import structural._5_bridge.engine.IEngine;

public abstract class Car {
	protected IEngine engine;

	public Car(IEngine engineImpl) {
		this.engine = engineImpl;
	}

	public abstract void drive();
	public abstract void stop();
}
