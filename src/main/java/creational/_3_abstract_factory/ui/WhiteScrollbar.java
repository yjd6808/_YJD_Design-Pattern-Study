package creational._3_abstract_factory.ui;

public class WhiteScrollbar extends Scrollbar {
	@Override
	public void wheel() {
		System.out.println("White Scrollbar Wheel!");
	}
}
