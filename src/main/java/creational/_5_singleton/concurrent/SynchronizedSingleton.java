package creational._5_singleton.concurrent;

// 동기화 함수 싱글톤 (Lazy) - 성능 매우 안좋음
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
