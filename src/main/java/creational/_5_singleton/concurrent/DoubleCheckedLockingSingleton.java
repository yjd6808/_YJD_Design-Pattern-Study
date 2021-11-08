package creational._5_singleton.concurrent;

// 더블 체킹 락 싱글톤 (java 1.5 이상) (Lazy) (매우 좋은 성능)
public class DoubleCheckedLockingSingleton {

	// 항상 캐싱되지 않은 최신 데이터를 얻을 수 있도록 볼라틸 선언
	private static volatile DoubleCheckedLockingSingleton s_instance;
	private DoubleCheckedLockingSingleton() {
		System.out.println("SynchronizedSingleton Created!");
	}

	public static DoubleCheckedLockingSingleton getInstance() {

		if (s_instance == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (s_instance == null) {
					s_instance = new DoubleCheckedLockingSingleton();
				}
			}
		}

		return s_instance;
	}
}
