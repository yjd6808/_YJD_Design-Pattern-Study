package structural._1_adapter.unit;

public class Marine implements SteamPackable{
	@Override
	public void steamPack() {
		System.out.println(this.getClass().getName() + " ½ºÆÀÆÑ!");
	}
}
