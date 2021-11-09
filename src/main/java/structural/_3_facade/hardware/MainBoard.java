package structural._3_facade.hardware;

import java.util.Random;
import java.util.function.Consumer;

public class MainBoard {
	private Random random = new Random();
	private Ram[] rams = { new Ram(), new Ram(), new Ram(), new Ram() };
	private HardDisk[] hardDisks = { new HardDisk(), new HardDisk() };
	private CPU cpu = new CPU();

	public void loadBytes(byte[] bytes) {

		int selectedRamIdx = random.nextInt(rams.length);
		System.out.println("���κ��� : " + selectedRamIdx + "��° ���� �����Ͽ� �۾��� �����մϴ�.");
		rams[selectedRamIdx].loadBytes(bytes);
	}

	public byte[] readBytes(int size) {
		int selectedHardIdx = random.nextInt(hardDisks.length);
		System.out.println("���κ��� : " + selectedHardIdx + "��° �ϵ��ũ�� �����Ͽ� �۾��� �����մϴ�.");
		return hardDisks[selectedHardIdx].readBytes(size);
	}

	public CPU getCpu() {
		return cpu;
	}
}
