package creational._5_singleton.concurrent;

// ����ȭ �Լ� �̱��� (Lazy) - ���� �ſ� ������
public class SynchronizedSingleton {
	private static SynchronizedSingleton s_instance;
	private SynchronizedSingleton() {
		System.out.println("SynchronizedSingleton Created!");
	}

	public static synchronized SynchronizedSingleton getInstance() {
		if (s_instance == null) {
			s_instance = new SynchronizedSingleton();
		}

		return s_instance;
	}
}
