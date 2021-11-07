package creational._1_factory;

import creational._1_factory.object.Computer;
import creational._1_factory.object.ComputerType;

public class FactoryMain {
	public static void main(String[] args) {
		ComputerFactory computerFactory = new ComputerFactory();

		// ���忡 ����ũ�� ��ǻ�� ���� ��û
		Computer desktop = computerFactory.createComputer(ComputerType.DESKTOP);
		desktop.boot();

		// ���忡 ��Ʈ�� ��ǻ�� ���� ��û
		Computer notebook = computerFactory.createComputer(ComputerType.NOTEBOOK);
		notebook.boot();
	}
}
