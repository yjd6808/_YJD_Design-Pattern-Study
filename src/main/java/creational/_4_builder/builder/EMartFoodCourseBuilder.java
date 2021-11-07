package creational._4_builder.builder;

import creational._4_builder.object.Food;
import creational._4_builder.product.EMartFoodCourse;
import creational._4_builder.product.FoodCourse;
import creational._4_builder.product.RestaurantFoodCourse;

import java.util.LinkedList;

public class EMartFoodCourseBuilder extends FoodCourseBuilder {

	public EMartFoodCourseBuilder() {
		main = new LinkedList<>();
		appetizer = new LinkedList<>();
		dessert = new LinkedList<>();

		// �̸�Ʈ Ǫ���ڽ������� ����Ÿ������ ����Ʈ�� �������� �ʴ´�.
		appetizerProvided = false;
		dessertProvided = false;
	}

	@Override
	public FoodCourseBuilder addMainFood(Food mainFood) {
		main.add(mainFood);
		return this;
	}

	@Override
	public FoodCourseBuilder addAppetizerFood(Food appetizerFood) {
		appetizer.add(appetizerFood);
		return this;
	}

	@Override
	public FoodCourseBuilder addDessertFood(Food dessertFood) {
		dessert.add(dessertFood);
		return this;
	}

	@Override
	public FoodCourse build() throws Exception {
		if (!checkCource()) {
			throw new Exception("�̸�Ʈ �������� �����ؾ��ϴ� �ڽ��޴��� ���յ��� �ʽ��ϴ�.");
		}

		return new EMartFoodCourse(main, appetizer, dessert);
	}
}
