package creational._3_abstract_factory.factory;

import creational._3_abstract_factory.ui.*;

public class WhiteUIFactory implements UIFactory {
	@Override
	public Button createButton() {
		return new WhiteButton();
	}

	@Override
	public Scrollbar createScrollbar() {
		return new WhiteScrollbar();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WhiteCheckBox();
	}
}
