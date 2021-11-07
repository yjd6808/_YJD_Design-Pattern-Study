package creational._4_builder.product;

import creational._4_builder.object.Food;

import java.util.List;

public class RestaurantFoodCourse extends FoodCourse {
	public RestaurantFoodCourse(List<Food> main, List<Food> appetizer, List<Food> dessert) {
		super(main, appetizer, dessert);

		appetizerProvided = true;
		dessertProvided = true;
	}
}
