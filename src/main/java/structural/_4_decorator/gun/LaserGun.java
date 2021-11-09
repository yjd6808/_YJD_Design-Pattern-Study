package structural._4_decorator.gun;

public class LaserGun implements InterfaceGun {

	@Override
	public void fire() {
		System.out.println("������ �� �߽�!");
	}

	@Override
	public void printDescription() {
		System.out.println(" ������ ��");
	}
}
