package creational._5_singleton.singleton.normal;

// �̸� �ε� �̱���
public class EagerLoadingSingleton {
	private static final EagerLoadingSingleton INSTANCE = new EagerLoadingSingleton();
	private EagerLoadingSingleton() {
		System.out.println("EagerLoadingSingleton Created");
	}
	public static EagerLoadingSingleton getInstance() {
		return INSTANCE;
	}
}
