package creational._5_singleton.concurrent;

// ���� üŷ �� �̱��� (java 1.5 �̻�) (Lazy) (�ſ� ���� ����)
public class DoubleCheckedLockingSingleton {

	// �׻� ĳ�̵��� ���� �ֽ� �����͸� ���� �� �ֵ��� ����ƿ ����
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
