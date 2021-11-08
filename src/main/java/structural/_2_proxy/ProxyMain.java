package structural._2_proxy;

import structural._2_proxy.program.*;
import structural._2_proxy.program.proxy.ProxyGame;
import structural._2_proxy.program.proxy.ProxyUtility;

public class ProxyMain {
	public static void main(String[] args) {
		System.out.println("[그냥 실행하는 경우]");

		Game sonic3 = new Game("소닉3", GameDifficulty.EASY);
		Game leagueOfLegend = new Game("리그 오브 레전드", GameDifficulty.SUPERHARD);
		Game superMario = new Game("슈퍼마리오", GameDifficulty.NORMAL);

		Utility alzip = new Utility("알집", false);
		Utility commandPrompt = new Utility("커맨드 프롬프트", false);
		Utility fetchedAlzip = new Utility("패치된 알집", true);

		sonic3.loadToMemory();
		leagueOfLegend.loadToMemory();
		superMario.loadToMemory();

		alzip.loadToMemory();
		commandPrompt.loadToMemory();
		fetchedAlzip.loadToMemory();

		System.out.println("================================");
		System.out.println("[프록시를 거쳐서 실행하는 경우]");

		new ProxyGame(sonic3).loadToMemory();
		new ProxyGame(leagueOfLegend).loadToMemory();
		new ProxyGame(superMario).loadToMemory();

		new ProxyUtility(alzip).loadToMemory();
		new ProxyUtility(commandPrompt).loadToMemory();
		new ProxyUtility(fetchedAlzip).loadToMemory();
	}
}
