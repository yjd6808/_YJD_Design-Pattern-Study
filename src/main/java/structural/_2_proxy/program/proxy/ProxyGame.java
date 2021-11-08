package structural._2_proxy.program.proxy;

import structural._2_proxy.program.Game;
import structural._2_proxy.program.GameDifficulty;
import structural._2_proxy.program.Program;

public class ProxyGame implements Program {
	private Game game;

	public ProxyGame(Game game) {
		this.game = game;
	}

	@Override
	public void loadToMemory() {
		if (game.getGameDifficulty() == GameDifficulty.SUPERHARD) {
			System.out.println("[방어] 매우 어려운 난이도의 게임인 경우 실행이 불가능합니다.");
			return;
		}

		game.loadToMemory();
	}
}
