package structural._3_facade.hardware;

public class ControlSystem {
	private Keyboard keyboard = new Keyboard();
	private Mouse mouse = new Mouse();
	private ComputerCase computerCase = new ComputerCase();

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public ComputerCase getComputerCase() {
		return computerCase;
	}
}
