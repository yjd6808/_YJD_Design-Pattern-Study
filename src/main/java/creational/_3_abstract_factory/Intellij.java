package creational._3_abstract_factory;

import creational._3_abstract_factory.factory.DarkUIFactory;
import creational._3_abstract_factory.factory.UIFactory;
import creational._3_abstract_factory.factory.WhiteUIFactory;
import creational._3_abstract_factory.ui.Button;
import creational._3_abstract_factory.ui.CheckBox;
import creational._3_abstract_factory.ui.Scrollbar;

public class Intellij {
	private Button button;
	private CheckBox checkBox;
	private Scrollbar scrollbar;

	public UIFactory getFactory(Theme theme) {
		switch (theme) {
			case DARK:
				return new DarkUIFactory();
			case WHITE:
				return new WhiteUIFactory();
		}
		return null;
	}

	public void changeTheme(Theme theme) {
		System.out.println("Intellij changed theme to " + theme);

		UIFactory factory = getFactory(theme);

		button = factory.createButton();
		checkBox = factory.createCheckBox();
		scrollbar = factory.createScrollbar();
	}

	public void doJob() {
		button.click();
		checkBox.check();
		scrollbar.wheel();
	}
}
