package creational._3_abstract_factory.ui;

public class DarkScrollbar extends Scrollbar {
	@Override
	public void wheel() {
		System.out.println("Dark Scrollbar Wheel!");
	}
}
