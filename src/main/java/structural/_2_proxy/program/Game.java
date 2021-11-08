package structural._2_proxy.program;

public class Game implements Program{
	private String gameName;
	private GameDifficulty gameDifficulty;

	public Game(String gameName, GameDifficulty gameDifficulty) {
		this.gameName = gameName;
		this.gameDifficulty = gameDifficulty;
	}

	public String getGameName() {
		return gameName;
	}

	public GameDifficulty getGameDifficulty() {
		return gameDifficulty;
	}

	@Override
	public void loadToMemory() {
		System.out.println(gameName + " 게임이 실행되기 위해 메모리에 올라갑니다.");
		System.out.println("\t게임 이름 : " + gameName);
		System.out.println("\t게임 난이도 : " + gameDifficulty);

		if (gameDifficulty == GameDifficulty.SUPERHARD) {
			System.out.println("\t\t너무 어려운게임을 실행하였습니다. 당신은 피로로 쓰러집니다.");
		}
	}
}
