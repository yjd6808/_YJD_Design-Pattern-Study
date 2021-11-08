package structural._2_proxy;

import structural._2_proxy.program.*;
import structural._2_proxy.program.proxy.ProxyGame;
import structural._2_proxy.program.proxy.ProxyUtility;

public class ProxyMain {
	public static void main(String[] args) {
		System.out.println("[�׳� �����ϴ� ���]");

		Game sonic3 = new Game("�Ҵ�3", GameDifficulty.EASY);
		Game leagueOfLegend = new Game("���� ���� ������", GameDifficulty.SUPERHARD);
		Game superMario = new Game("���۸�����", GameDifficulty.NORMAL);

		Utility alzip = new Utility("����", false);
		Utility commandPrompt = new Utility("Ŀ�ǵ� ������Ʈ", false);
		Utility fetchedAlzip = new Utility("��ġ�� ����", true);

		sonic3.loadToMemory();
		leagueOfLegend.loadToMemory();
		superMario.loadToMemory();

		alzip.loadToMemory();
		commandPrompt.loadToMemory();
		fetchedAlzip.loadToMemory();

		System.out.println("================================");
		System.out.println("[���Ͻø� ���ļ� �����ϴ� ���]");

		new ProxyGame(sonic3).loadToMemory();
		new ProxyGame(leagueOfLegend).loadToMemory();
		new ProxyGame(superMario).loadToMemory();

		new ProxyUtility(alzip).loadToMemory();
		new ProxyUtility(commandPrompt).loadToMemory();
		new ProxyUtility(fetchedAlzip).loadToMemory();
	}
}
