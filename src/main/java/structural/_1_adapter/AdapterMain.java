package structural._1_adapter;

import structural._1_adapter.adapter.HealableToSteamPackAdapter;
import structural._1_adapter.adapter.InvisibleToSteamPackAdapter;
import structural._1_adapter.unit.*;

public class AdapterMain {
	public static void main(String[] args) {
		// 기존 유닛의 기능만 활용가능
		System.out.println("\t[ 기존 유닛 기능 ]");
		Marine marine = new Marine();
		Firebat firebat = new Firebat();
		Medic medic = new Medic();
		Ghost ghost = new Ghost();
		Wraith wraith = new Wraith();

		marine.steamPack();
		firebat.steamPack();
		medic.heal();
		ghost.clocking();
		wraith.clocking();

		// ----------------------------------
		// 어댑터를 사용하여 메딕이 스팀팩을 사용할 수 있도록 한다.
		System.out.println("\t[ 어댑터 사용 ]");

		new HealableToSteamPackAdapter(medic).steamPack();
		new InvisibleToSteamPackAdapter(ghost).steamPack();
		new InvisibleToSteamPackAdapter(wraith).steamPack();
	}
}
