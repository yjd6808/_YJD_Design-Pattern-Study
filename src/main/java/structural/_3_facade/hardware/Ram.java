package structural._3_facade.hardware;

public class Ram {
	public void loadBytes(byte[] bytes) {
		System.out.println("램 : " + bytes.length + "바이트 로딩");
	}
}
