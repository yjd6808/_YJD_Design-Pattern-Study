package structural._4_decorator.gun.decorator;

import structural._4_decorator.gun.*;

public abstract class GunDecorator implements InterfaceGun {
	protected InterfaceGun interfaceGun;
	public GunDecorator(InterfaceGun gun) {
		this.interfaceGun = gun;
	}
}
