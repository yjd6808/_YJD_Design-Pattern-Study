package structural._1_adapter.unit;

public class Medic implements Healable {
	@Override
	public void heal() {
		System.out.println(this.getClass().getName() + " Èú!");
	}
}
