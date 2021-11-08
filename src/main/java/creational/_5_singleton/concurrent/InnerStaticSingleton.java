package creational._5_singleton.concurrent;

// 내부 스테틱 클래스 싱글톤 (Lazy) (매우 좋은 성능)
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

