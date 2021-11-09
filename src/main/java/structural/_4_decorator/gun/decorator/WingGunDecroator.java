package structural._4_decorator.gun.decorator;

import structural._4_decorator.gun.InterfaceGun;

public class WingGunDecroator extends GunDecorator {

	public WingGunDecroator(InterfaceGun gun) {
		super(gun);
	}
	
	private void renderWingEffect() {
		System.out.println("[¿Ã∆Â∆Æ] ≥Ø∞≥∞° ∆ﬁ∑∞¿”");
	}

	@Override
	public void fire() {
		renderWingEffect();
		interfaceGun.fire();
	}

	@Override
	public void printDescription() {
		System.out.print("[Wing]");
		interfaceGun.printDescription();
	}
}
