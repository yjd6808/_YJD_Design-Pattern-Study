package creational._1_factory;

import creational._1_factory.object.Computer;
import creational._1_factory.object.ComputerType;
import creational._1_factory.object.Desktop;
import creational._1_factory.object.Notebook;

public class ComputerFactory {
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
