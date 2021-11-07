package creational._2_factory_method.factory;

import creational._2_factory_method.object.*;

public class SuperComputerFactory implements ComputerFactory {

	@Override
	public Computer createComputer(ComputerType type) {
		switch (type) {
			case DESKTOP:
				return new SuperDesktop();
			case NOTEBOOK:
				return new SuperNotebook();
			default:
				return null;
		}
	}
}
