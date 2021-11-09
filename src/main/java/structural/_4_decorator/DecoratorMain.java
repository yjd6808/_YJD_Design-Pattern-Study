package structural._4_decorator;

import structural._4_decorator.gun.*;
import structural._4_decorator.gun.decorator.*;

public class DecoratorMain {
	public static void main(String[] args) {
		System.out.println("[���ڷ��̼� ���� ��]");
		InterfaceGun laserGun = new LaserGun();
		InterfaceGun normalGun = new NormalGun();

		laserGun.printDescription();
		laserGun.fire();

		normalGun.printDescription();
		normalGun.fire();

		System.out.println("[���ڷ��̼� ���� ��]");
		GunDecorator scopeDecoratedGun = new ScopeGunDecroator(laserGun);
		scopeDecoratedGun.printDescription();
		System.out.println("======= �ѽ�� ����");
		scopeDecoratedGun.fire();
		System.out.println("======= �ѽ�� ����");

		GunDecorator wingDecoratedGun = new WingGunDecroator(scopeDecoratedGun);
		wingDecoratedGun.printDescription();
		System.out.println("======= �ѽ�� ����");
		wingDecoratedGun.fire();
		System.out.println("======= �ѽ�� ����");

		GunDecorator springDecoratedGun = new SpringGunDecroator(wingDecoratedGun);
		springDecoratedGun.printDescription();
		System.out.println("======= �ѽ�� ����");
		springDecoratedGun.fire();
		System.out.println("======= �ѽ�� ����");

		springDecoratedGun = new SpringGunDecroator(springDecoratedGun);
		springDecoratedGun.printDescription();
		System.out.println("======= �ѽ�� ����");
		springDecoratedGun.fire();
		System.out.println("======= �ѽ�� ����");
	}
}
