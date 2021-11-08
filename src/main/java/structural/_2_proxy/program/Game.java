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
		System.out.println(gameName + " ������ ����Ǳ� ���� �޸𸮿� �ö󰩴ϴ�.");
		System.out.println("\t���� �̸� : " + gameName);
		System.out.println("\t���� ���̵� : " + gameDifficulty);

		if (gameDifficulty == GameDifficulty.SUPERHARD) {
			System.out.println("\t\t�ʹ� ���������� �����Ͽ����ϴ�. ����� �Ƿη� �������ϴ�.");
		}
	}
}
