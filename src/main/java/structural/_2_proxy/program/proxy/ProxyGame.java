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
		// ���� ���̵��� �ʹ� ���� ��� ��ü ���� ��ü�� ���� �ʵ��� �Ѵ�.
		if (gameDifficulty == GameDifficulty.SUPERHARD) {
			System.out.println("[���] �ſ� ����� ���̵��� ������ ��� ������ �Ұ����մϴ�.");
			return;
		}

		if (game == null) {
			game = new Game(gameName, gameDifficulty);
		}

		game.loadToMemory();
	}
}
