package structural._7_composite.bomb;

public class Nuclear implements Bomb {
	@Override
	public void explode(int level) {
		printLevelWithMessage(level, "[ÇÙ] ÄíÄâ¾Æ¾Æ¾Æ¾Ó!");
	}
}
