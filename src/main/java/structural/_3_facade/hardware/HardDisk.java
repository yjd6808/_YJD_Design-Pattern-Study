package structural._3_facade.hardware;

import java.util.Random;

public class HardDisk {
	public byte[] readBytes(int readSize) {

		byte[] reads = new byte[readSize];

		System.out.print("�ϵ��ũ : ");

		for (int i = 0; i < readSize; i++) {
			reads[i] = (byte)new Random().nextInt(200);
			System.out.printf("%x ", reads[i]);
		}
		System.out.println();
		System.out.println(readSize + " ����Ʈ��ŭ ����");

		return reads;
	}
}
