package creational._5_singleton.normal;

// ´ÊÀº ·Îµù ½Ì±ÛÅæ
public class LazyLoadingSingleton {
	private static LazyLoadingSingleton s_instance;
	private LazyLoadingSingleton() {
		System.out.println("LazyLoadingSingleton Created");
	}
	public static LazyLoadingSingleton getInstance() {
		if (s_instance == null) {
			s_instance = new LazyLoadingSingleton();
		}
		return s_instance;
	}
}
