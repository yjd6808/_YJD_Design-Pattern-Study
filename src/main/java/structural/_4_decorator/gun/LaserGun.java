package structural._4_decorator.gun;

public class LaserGun implements InterfaceGun {

	@Override
	public void fire() {
		System.out.println("레이저 건 발쏴!");
	}

	@Override
	public void printDescription() {
		System.out.println(" 레이저 총");
	}
}
