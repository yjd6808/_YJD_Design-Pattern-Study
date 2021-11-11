package structural._7_composite.bomb;

public class Dynamite implements Bomb {
	@Override
	public void explode(int level) {
		printLevelWithMessage(level, "[다이너마이트] 빵!!!!");
	}
}
