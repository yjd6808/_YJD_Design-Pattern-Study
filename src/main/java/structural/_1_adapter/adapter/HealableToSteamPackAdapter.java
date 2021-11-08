package structural._1_adapter.adapter;

import structural._1_adapter.unit.Healable;
import structural._1_adapter.unit.SteamPackable;

public class HealableToSteamPackAdapter implements SteamPackable {

	private Healable healableUnit;

	public HealableToSteamPackAdapter(Healable healableUnit) {
		this.healableUnit = healableUnit;
	}

	@Override
	public void steamPack() {
		System.out.println(healableUnit.getClass().getName() + " ½ºÆÀÆÑ!");
	}
}
