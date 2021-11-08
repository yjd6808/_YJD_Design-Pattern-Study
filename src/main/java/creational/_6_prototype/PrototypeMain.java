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
			System.out.print("현재 " + factory.size() + "대의 프토토타입 차량 모델이 있습니다.\n" +
							 "어떤 차량을 구매하시겠습니까?");

			int choose = scanner.nextInt();

			if (choose < 0 || choose >= factory.size()) {
				System.out.println("잘못 선택하셨습니다.");
				continue;
			}

			// 공장에서 구매한 차량
			System.out.println("구매하신 차량의 정보입니다.");
			Car car = factory.prototype(choose);
			car.printInfo();
			
			// 차량 커스터마이징 가능
		}
	}
}
