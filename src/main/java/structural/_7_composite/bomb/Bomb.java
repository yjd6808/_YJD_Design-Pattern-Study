package structural._7_composite.bomb;

public interface Bomb {
	void explode(int level);

	default void printLevelWithMessage(int lv, String message) {
		while (lv-- > 0) {
			System.out.print("\t");
		}
		System.out.println(message);
	}
}
