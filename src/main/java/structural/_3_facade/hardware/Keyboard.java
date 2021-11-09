package structural._3_facade.hardware;

public class Keyboard {
	public void pressKey(int keyCode) {
		System.out.printf("키보드 : %x 키를 누름", keyCode);
	}
}
