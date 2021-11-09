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
		System.out.println("메인보드 : " + selectedRamIdx + "번째 램을 선택하여 작업을 수행합니다.");
		rams[selectedRamIdx].loadBytes(bytes);
	}

	public byte[] readBytes(int size) {
		int selectedHardIdx = random.nextInt(hardDisks.length);
		System.out.println("메인보드 : " + selectedHardIdx + "번째 하드디스크를 선택하여 작업을 수행합니다.");
		return hardDisks[selectedHardIdx].readBytes(size);
	}

	public CPU getCpu() {
		return cpu;
	}
}
