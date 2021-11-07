package creational._2_factory_method;

import creational._2_factory_method.factory.ComputerFactory;
import creational._2_factory_method.factory.NormalComputerFactory;
import creational._2_factory_method.factory.SuperComputerFactory;
import creational._2_factory_method.object.ComputerType;

public class FactoryMethodMain {
	public static void main(String[] args) {
		ComputerFactory superComputerFactory = new SuperComputerFactory();
		ComputerFactory normalComputerFactory = new NormalComputerFactory();

		normalComputerFactory.createComputer(ComputerType.DESKTOP).boot();
		normalComputerFactory.createComputer(ComputerType.NOTEBOOK).boot();

		superComputerFactory.createComputer(ComputerType.DESKTOP).boot();
		superComputerFactory.createComputer(ComputerType.NOTEBOOK).boot();
	}
}
