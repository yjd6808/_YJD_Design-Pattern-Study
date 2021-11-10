package structural._5_bridge.engine;

public class GasEngine implements IEngine {

	@Override
	public void powerUp() {
		System.out.println("가스 엔진 파워 업~");
	}

	@Override
	public void powerDown() {
		System.out.println("가스 엔진 파워 다운...");
	}
}
