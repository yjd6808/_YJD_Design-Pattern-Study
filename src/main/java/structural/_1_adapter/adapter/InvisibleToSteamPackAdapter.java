package structural._1_adapter.adapter;

import structural._1_adapter.unit.Invisible;
import structural._1_adapter.unit.SteamPackable;

public class InvisibleToSteamPackAdapter implements SteamPackable {

	private Invisible invisibleUnit;

	public InvisibleToSteamPackAdapter(Invisible invisibleUnit) {
		this.invisibleUnit = invisibleUnit;
	}

	@Override
	public void steamPack() {
		System.out.println(invisibleUnit.getClass().getName() + " ½ºÆÀÆÑ!");
	}
}
