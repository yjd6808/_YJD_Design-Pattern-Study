package creational._2_factory_method.factory;

import creational._2_factory_method.object.Computer;
import creational._2_factory_method.object.ComputerType;
import creational._2_factory_method.object.Desktop;
import creational._2_factory_method.object.Notebook;

public class NormalComputerFactory implements ComputerFactory {

	@Override
	public Computer createComputer(ComputerType type) {
		switch (type) {
			case DESKTOP:
				return new Desktop();
			case NOTEBOOK:
				return new Notebook();
			default:
				return null;
		}
	}
}
