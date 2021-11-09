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

		ProxyGame proxySonic3 = new ProxyGame("�Ҵ�3", GameDifficulty.EASY);
		ProxyGame proxyLoL = new ProxyGame("���� ���� ������", GameDifficulty.SUPERHARD);
		ProxyGame proxySuperMario = new ProxyGame("���۸�����", GameDifficulty.NORMAL);

		ProxyUtility proxyAlzip = new ProxyUtility("����", false);
		ProxyUtility proxyCmd = new ProxyUtility("Ŀ�ǵ� ������Ʈ", false);
		ProxyUtility proxyfetchedAlzip = new ProxyUtility("��ġ�� ����", true);

		proxySonic3.loadToMemory();
		proxyLoL.loadToMemory();
		proxySuperMario.loadToMemory();

		proxyAlzip.loadToMemory();
		proxyCmd.loadToMemory();
		proxyfetchedAlzip.loadToMemory();
	}
}
