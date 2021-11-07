package creational._1_factory;

import creational._1_factory.object.Computer;
import creational._1_factory.object.ComputerType;

public class FactoryMain {
	public static void main(String[] args) {
		ComputerFactory computerFactory = new ComputerFactory();

		// 공장에 데스크톱 컴퓨터 생산 요청
		Computer desktop = computerFactory.createComputer(ComputerType.DESKTOP);
		desktop.boot();

		// 공장에 노트북 컴퓨터 생산 요청
		Computer notebook = computerFactory.createComputer(ComputerType.NOTEBOOK);
		notebook.boot();
	}
}
