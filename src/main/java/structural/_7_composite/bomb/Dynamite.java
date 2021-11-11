package structural._7_composite.bomb;

public class Dynamite implements Bomb {
	@Override
	public void explode(int level) {
		printLevelWithMessage(level, "[���̳ʸ���Ʈ] ��!!!!");
	}
}
