package creational._4_builder.product;

import creational._4_builder.object.Food;

import java.util.List;

public abstract class FoodCourse {
	protected List<Food> main;
	protected List<Food> appetizer;
	protected List<Food> dessert;

	// �ɼ�
	protected boolean appetizerProvided;	// ����Ÿ������ �����Ǵ��� ����
	protected boolean dessertProvided;		// ����Ʈ�� �����Ǵ��� ����

	public FoodCourse(List<Food> main, List<Food> appetizer, List<Food> dessert) {
		this.main = main;
		this.appetizer = appetizer;
		this.dessert = dessert;
	}

	public List<Food> getAppetizer() {
		return appetizer;
	}

	public List<Food> getMain() {
		return main;
	}

	public List<Food> getDessert() {
		return dessert;
	}

	public boolean isAppetizerProvided() {
		return appetizerProvided;
	}

	public boolean isDessertProvided() {
		return dessertProvided;
	}

	// ���� ����
	public void service() {
		if (appetizerProvided) {
			System.out.println("[����Ÿ���� ���]");
			appetizer.forEach(x -> System.out.printf("\t%s\n", x));
		}

		System.out.println("[���� ���]");
		main.forEach(x -> System.out.printf("\t%s\n", x));

		if (dessertProvided) {
			System.out.println("[����Ʈ ���]");
			dessert.forEach(x -> System.out.printf("\t%s\n", x));
		}
	}
}
