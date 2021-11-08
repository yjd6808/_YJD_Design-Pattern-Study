package creational._6_prototype;

import creational._6_prototype.factory.CarFactory;
import creational._6_prototype.object.Car;

import java.util.Scanner;

public class PrototypeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarFactory factory = new CarFactory();
		factory.initialize();

		while (true) {
			System.out.print("���� " + factory.size() + "���� ������Ÿ�� ���� ���� �ֽ��ϴ�.\n" +
							 "� ������ �����Ͻðڽ��ϱ�?");

			int choose = scanner.nextInt();

			if (choose < 0 || choose >= factory.size()) {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
				continue;
			}

			// ���忡�� ������ ����
			System.out.println("�����Ͻ� ������ �����Դϴ�.");
			Car car = factory.prototype(choose);
			car.printInfo();
			
			// ���� Ŀ���͸���¡ ����
		}
	}
}
