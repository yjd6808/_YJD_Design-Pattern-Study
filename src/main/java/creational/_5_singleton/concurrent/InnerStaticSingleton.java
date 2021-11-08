package creational._5_singleton.concurrent;

// ���� ����ƽ Ŭ���� �̱��� (Lazy) (�ſ� ���� ����)
public class InnerStaticSingleton {

	private InnerStaticSingleton() {
		System.out.println("InnerStaticSingleton Created!");
	}

	private static class Singleton {
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
	}

	public static InnerStaticSingleton getInstance() {
		return Singleton.INSTANCE;
	}
}

