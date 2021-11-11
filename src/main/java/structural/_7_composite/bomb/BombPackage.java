package structural._7_composite.bomb;

import java.util.LinkedList;
import java.util.List;

public class BombPackage implements Bomb {

	private List<Bomb> bombs = new LinkedList<>();

	@Override
	public void explode(int level) {
		printLevelWithMessage(level, "[�ٷ���] ����!");
		bombs.forEach(x -> x.explode(level + 1));
	}

	public void addBomb(Bomb bomb) {
		bombs.add(bomb);
	}
}
