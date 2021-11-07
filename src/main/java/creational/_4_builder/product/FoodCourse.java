package creational._4_builder.product;

import creational._4_builder.object.Food;

import java.util.List;

public abstract class FoodCourse {
	protected List<Food> main;
	protected List<Food> appetizer;
	protected List<Food> dessert;

	// 옵션
	protected boolean appetizerProvided;	// 에피타이저가 제공되는지 여부
	protected boolean dessertProvided;		// 디저트가 제공되는지 여부

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

	// 서비스 제공
	public void service() {
		if (appetizerProvided) {
			System.out.println("[에피타이저 목록]");
			appetizer.forEach(x -> System.out.printf("\t%s\n", x));
		}

		System.out.println("[메인 목록]");
		main.forEach(x -> System.out.printf("\t%s\n", x));

		if (dessertProvided) {
			System.out.println("[디저트 목록]");
			dessert.forEach(x -> System.out.printf("\t%s\n", x));
		}
	}
}
