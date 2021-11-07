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

		// 이마트 푸드코스에서는 에피타이저와 디저트를 제공하지 않는다.
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
			throw new Exception("이마트 음식점이 제공해야하는 코스메뉴에 부합되지 않습니다.");
		}

		return new EMartFoodCourse(main, appetizer, dessert);
	}
}
