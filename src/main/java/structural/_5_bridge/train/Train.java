package structural._5_bridge.train;

import structural._5_bridge.engine.IEngine;

public abstract class Train {
	protected IEngine engine;

	public Train(IEngine engineImpl) {
		this.engine = engineImpl;
	}

	public abstract void run();
	public abstract void stop();
}
