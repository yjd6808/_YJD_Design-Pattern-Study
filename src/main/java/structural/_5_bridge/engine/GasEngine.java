package structural._5_bridge.engine;

public class GasEngine implements IEngine {

	@Override
	public void powerUp() {
		System.out.println("���� ���� �Ŀ� ��~");
	}

	@Override
	public void powerDown() {
		System.out.println("���� ���� �Ŀ� �ٿ�...");
	}
}
