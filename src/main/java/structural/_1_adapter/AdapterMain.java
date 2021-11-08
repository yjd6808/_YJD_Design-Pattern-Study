package structural._1_adapter;

import structural._1_adapter.adapter.HealableToSteamPackAdapter;
import structural._1_adapter.adapter.InvisibleToSteamPackAdapter;
import structural._1_adapter.unit.*;

public class AdapterMain {
	public static void main(String[] args) {
		// ���� ������ ��ɸ� Ȱ�밡��
		System.out.println("\t[ ���� ���� ��� ]");
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
		// ����͸� ����Ͽ� �޵��� �������� ����� �� �ֵ��� �Ѵ�.
		System.out.println("\t[ ����� ��� ]");

		new HealableToSteamPackAdapter(medic).steamPack();
		new InvisibleToSteamPackAdapter(ghost).steamPack();
		new InvisibleToSteamPackAdapter(wraith).steamPack();
	}
}
