package creational._3_abstract_factory.factory;

import creational._3_abstract_factory.ui.Button;
import creational._3_abstract_factory.ui.CheckBox;
import creational._3_abstract_factory.ui.Scrollbar;

public interface UIFactory {
	Button createButton();
	Scrollbar createScrollbar();
	CheckBox createCheckBox();
}
