package structural._4_decorator.gun.decorator;

import structural._4_decorator.gun.InterfaceGun;

public class SpringGunDecroator extends GunDecorator {

	public SpringGunDecroator(InterfaceGun gun) {
		super(gun);
	}
	
	private void playSpringReleasedSoundEffect() {
		System.out.println("[���� ����Ʈ] ������ ���� ���!");
	}

	@Override
	public void fire() {
		playSpringReleasedSoundEffect();
		interfaceGun.fire();
	}

	@Override
	public void printDescription() {
		System.out.print("[Spring]");
		interfaceGun.printDescription();
	}
}
