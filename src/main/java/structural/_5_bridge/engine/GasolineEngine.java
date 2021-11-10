package structural._5_bridge.engine;

public class GasolineEngine implements IEngine {

	@Override
	public void powerUp() {
		System.out.println("가솔린 엔진 파워 업!");
	}

	@Override
	public void powerDown() {
		System.out.println("가솔린 엔진 파워 다운... ㅠㅠ");
	}
}
