package structural._3_facade;

import structural._3_facade.facade.Computer;

public class FacadeMain {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.boot();
		System.out.println("=====================================");
		computer.launchProgram();
	}
}
