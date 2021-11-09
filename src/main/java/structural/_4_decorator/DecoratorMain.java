package structural._4_decorator;

import structural._4_decorator.gun.*;
import structural._4_decorator.gun.decorator.*;

public class DecoratorMain {
	public static void main(String[] args) {
		System.out.println("[µ•ƒ⁄∑π¿Ãº« ¿˚øÎ ¿¸]");
		InterfaceGun laserGun = new LaserGun();
		InterfaceGun normalGun = new NormalGun();

		laserGun.printDescription();
		laserGun.fire();

		normalGun.printDescription();
		normalGun.fire();

		System.out.println("[µ•ƒ⁄∑π¿Ãº« ¿˚øÎ »ƒ]");
		GunDecorator scopeDecoratedGun = new ScopeGunDecroator(laserGun);
		scopeDecoratedGun.printDescription();
		System.out.println("======= √—ΩÓ±‚ Ω√¿€");
		scopeDecoratedGun.fire();
		System.out.println("======= √—ΩÓ±‚ ¡æ∑·");

		GunDecorator wingDecoratedGun = new WingGunDecroator(scopeDecoratedGun);
		wingDecoratedGun.printDescription();
		System.out.println("======= √—ΩÓ±‚ Ω√¿€");
		wingDecoratedGun.fire();
		System.out.println("======= √—ΩÓ±‚ ¡æ∑·");

		GunDecorator springDecoratedGun = new SpringGunDecroator(wingDecoratedGun);
		springDecoratedGun.printDescription();
		System.out.println("======= √—ΩÓ±‚ Ω√¿€");
		springDecoratedGun.fire();
		System.out.println("======= √—ΩÓ±‚ ¡æ∑·");

		springDecoratedGun = new SpringGunDecroator(springDecoratedGun);
		springDecoratedGun.printDescription();
		System.out.println("======= √—ΩÓ±‚ Ω√¿€");
		springDecoratedGun.fire();
		System.out.println("======= √—ΩÓ±‚ ¡æ∑·");
	}
}
