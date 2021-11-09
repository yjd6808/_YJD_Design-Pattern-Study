package structural._2_proxy.program.proxy;

import structural._2_proxy.program.Game;
import structural._2_proxy.program.GameDifficulty;
import structural._2_proxy.program.Program;

public class ProxyGame implements Program {
	private Game game;
	private String gameName;
	private GameDifficulty gameDifficulty;

	public ProxyGame(String gameName, GameDifficulty gameDifficulty) {
		this.gameName = gameName;
		this.gameDifficulty = gameDifficulty;
	}

	@Override
	public void loadToMemory() {
		// 게임 난이도가 너무 높을 경우 객체 생성 자체를 하지 않도록 한다.
		if (gameDifficulty == GameDifficulty.SUPERHARD) {
			System.out.println("[방어] 매우 어려운 난이도의 게임인 경우 실행이 불가능합니다.");
			return;
		}

		if (game == null) {
			game = new Game(gameName, gameDifficulty);
		}

		game.loadToMemory();
	}
}
