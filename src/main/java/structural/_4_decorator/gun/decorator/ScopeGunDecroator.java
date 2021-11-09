package structural._4_decorator.gun.decorator;

import structural._4_decorator.gun.InterfaceGun;

public class ScopeGunDecroator extends GunDecorator {

	public ScopeGunDecroator(InterfaceGun gun) {
		super(gun);
	}
	
	private void renderShinyEffect() {
		System.out.println("[����Ʈ] �������� ��¦�Ÿ��� ����Ʈ!");
	}

	@Override
	public void fire() {
		renderShinyEffect();
		interfaceGun.fire();
	}

	@Override
	public void printDescription() {
		System.out.print("[Scope]");
		interfaceGun.printDescription();
	}
}
