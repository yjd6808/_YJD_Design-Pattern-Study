package structural._7_composite;

import structural._7_composite.bomb.*;

import java.util.Random;

public class CompositeMain {

	private static final int DEPTH_LIMIT = 6;
	private static BombPackage createTreeBomb(int depth) {
		Random random = new Random();
		BombPackage bombPackage = new BombPackage();
		int count = random.nextInt(DEPTH_LIMIT - depth);

		for (int i = 0; i < count; i++) {
			int type = random.nextInt(3);
			
			switch (type) {
				case 0: bombPackage.addBomb(new Nuclear());
				case 1: bombPackage.addBomb(new C4());
				case 2: bombPackage.addBomb(new Dynamite());
			}

			// 꾸러미 추가 확률은 뎁쓰마다 제곱식만큼 확률이 낮아지도록하자.
			int bound = 100 - (int)Math.pow(3, depth);
			if (bound <= 0) {
				continue;
			}
			int result = random.nextInt(100);
			if (result <= bound) {
				if (depth + 1 < DEPTH_LIMIT) {
					bombPackage.addBomb(createTreeBomb(depth + 1));
				}
			}
		}

		return bombPackage;
	}

	private static Bomb s_bomb;

	public static void main(String[] args) {
		System.out.println("[개별 폭파 테스트]");
		s_bomb = new C4();
		s_bomb.explode(0);
		s_bomb = new Nuclear();
		s_bomb.explode(0);
		s_bomb = new Dynamite();
		s_bomb.explode(0);
		System.out.println();
		System.out.println("[트리구조 폭파 테스트]");
		s_bomb = createTreeBomb(0);
		s_bomb.explode(0);
	}
}
