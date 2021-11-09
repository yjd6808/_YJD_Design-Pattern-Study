package structural._4_decorator.gun.decorator;

import structural._4_decorator.gun.InterfaceGun;

public class SpringGunDecroator extends GunDecorator {

	public SpringGunDecroator(InterfaceGun gun) {
		super(gun);
	}
	
	private void playSpringReleasedSoundEffect() {
		System.out.println("[사운드 이펙트] 스프링 사운드 재생!");
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
