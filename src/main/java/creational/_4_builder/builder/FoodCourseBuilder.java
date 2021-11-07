package creational._4_builder.builder;

import creational._4_builder.object.Food;
import creational._4_builder.product.FoodCourse;

import java.util.List;

public abstract class FoodCourseBuilder {
	protected List<Food> main;
	protected List<Food> appetizer;
	protected List<Food> dessert;

	protected boolean appetizerProvided;	// ����Ÿ������ �����Ǵ��� ����
	protected boolean dessertProvided;		// ����Ʈ�� �����Ǵ��� ����

	public boolean checkCource() {
		if (appetizerProvided && appetizer.size() == 0) {
			return false;
		}

		// ����Ÿ������ �������� �ʾƾ��ϴµ� ������ ���
		if (!appetizerProvided && appetizer.size() > 0) {
			return false;
		}

		if (dessertProvided && dessert.size() == 0) {
			return false;
		}

		// ����Ʈ���� �������� �ʾƾ��ϴµ� ������ ���
		if (!dessertProvided && dessert.size() > 0) {
			return false;
		}

		if (main.size() == 0) {
			return false;
		}

		return true;
	}
	
	public abstract FoodCourseBuilder addMainFood(Food mainFood);
	public abstract FoodCourseBuilder addAppetizerFood(Food appetizerFood);
	public abstract FoodCourseBuilder addDessertFood(Food dessertFood);
	public abstract FoodCourse build() throws Exception;
}
