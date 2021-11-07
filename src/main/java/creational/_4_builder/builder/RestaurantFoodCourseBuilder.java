package creational._4_builder.builder;

import creational._4_builder.object.Food;
import creational._4_builder.product.FoodCourse;
import creational._4_builder.product.RestaurantFoodCourse;

import java.util.ArrayList;
import java.util.LinkedList;

public class RestaurantFoodCourseBuilder extends FoodCourseBuilder {

	public RestaurantFoodCourseBuilder() {
		main = new LinkedList<>();
		appetizer = new LinkedList<>();
		dessert = new LinkedList<>();

		// 레스토랑은 에피타이저와 디저트를 제공한다.
		appetizerProvided = true;
		dessertProvided = true;
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
			throw new Exception("레스토랑이 제공해야하는 코스메뉴에 부합되지 않습니다.");
		}

		return new RestaurantFoodCourse(main, appetizer, dessert);
	}
}
