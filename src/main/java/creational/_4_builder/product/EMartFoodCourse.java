package creational._4_builder.product;

import creational._4_builder.object.Food;

import java.util.List;

public class EMartFoodCourse extends FoodCourse {
	public EMartFoodCourse(List<Food> main, List<Food> appetizer, List<Food> dessert) {
		super(main, appetizer, dessert);

		appetizerProvided = false;
		dessertProvided = false;
	}
}
