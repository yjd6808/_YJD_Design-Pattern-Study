package structural._5_bridge.engine;

public class DieselEngine implements IEngine {

	@Override
	public void powerUp() {
		System.out.println("뒤젤 엔진 파워 업~");
	}

	@Override
	public void powerDown() {
		System.out.println("뒤젤 엔진 파워 다운...");
	}
}
