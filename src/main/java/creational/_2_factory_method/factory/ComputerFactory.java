package creational._2_factory_method.factory;

import creational._2_factory_method.object.Computer;
import creational._2_factory_method.object.ComputerType;

public interface ComputerFactory {
	Computer createComputer(ComputerType computerType);
}
