package creational._3_abstract_factory.factory;

import creational._3_abstract_factory.ui.*;

public class DarkUIFactory implements UIFactory {
	@Override
	public Button createButton() {
		return new DarkButton();
	}

	@Override
	public Scrollbar createScrollbar() {
		return new DarkScrollbar();
	}

	@Override
	public CheckBox createCheckBox() {
		return new DarkCheckBox();
	}
}
