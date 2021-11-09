package structural._3_facade.facade;

import structural._3_facade.hardware.ControlSystem;
import structural._3_facade.hardware.HardDisk;
import structural._3_facade.hardware.MainBoard;

public class Computer {
	private ControlSystem controlSystem = new ControlSystem();
	private MainBoard mainBoard = new MainBoard();

	public void boot() {
		System.out.println("[���� ����]");
		controlSystem.getComputerCase().pressPowerButton();
		mainBoard.loadBytes(mainBoard.readBytes(15));
		mainBoard.loadBytes(mainBoard.readBytes(20));
		mainBoard.getCpu().compute((byte)37);
		mainBoard.getCpu().compute((byte)54);
		mainBoard.getCpu().compute((byte)12);
		System.out.println("[���� �Ϸ�]");
	}

	public void launchProgram() {
		System.out.println("[���α׷� ���� ����]");
		controlSystem.getMouse().move();
		controlSystem.getMouse().move();
		controlSystem.getMouse().click();
		controlSystem.getMouse().click();
		controlSystem.getKeyboard().pressKey(30);
		mainBoard.loadBytes(mainBoard.readBytes(15));
		mainBoard.loadBytes(mainBoard.readBytes(20));
		mainBoard.getCpu().compute((byte)37);
		mainBoard.getCpu().compute((byte)54);
		mainBoard.getCpu().compute((byte)12);
		System.out.println("[���α׷� ���� �Ϸ�]");
	}
}
