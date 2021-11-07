package creational._4_builder.builder;

import creational._4_builder.object.Food;
import creational._4_builder.product.FoodCourse;

import java.util.List;

public abstract class FoodCourseBuilder {
	protected List<Food> main;
	protected List<Food> appetizer;
	protected List<Food> dessert;

	protected boolean appetizerProvided;	// 에피타이저가 제공되는지 여부
	protected boolean dessertProvided;		// 디저트가 제공되는지 여부

	public boolean checkCource() {
		if (appetizerProvided && appetizer.size() == 0) {
			return false;
		}

		// 에피타이저가 제공되지 않아야하는데 제공된 경우
		if (!appetizerProvided && appetizer.size() > 0) {
			return false;
		}

		if (dessertProvided && dessert.size() == 0) {
			return false;
		}

		// 디저트가가 제공되지 않아야하는데 제공된 경우
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
