package creational._4_builder;

import creational._4_builder.builder.EMartFoodCourseBuilder;
import creational._4_builder.builder.RestaurantFoodCourseBuilder;
import creational._4_builder.director.FoodCourseDirector;
import creational._4_builder.object.Food;
import creational._4_builder.product.FoodCourse;

public class BuilderMain {
	public static void main(String[] args) {
		FoodCourseDirector foodCourseDirector = new FoodCourseDirector();
		
		foodCourseDirector.addEMartFoodCourseBuilder("이마트 치킨집",
				new EMartFoodCourseBuilder()
						.addMainFood(new Food("동네치킨"))
						.addMainFood(new Food("감자튀김"))
		);

		foodCourseDirector.addEMartFoodCourseBuilder("이마트 치킨집2",
				new EMartFoodCourseBuilder()
						.addMainFood(new Food("맛나는 치킨"))
						.addMainFood(new Food("오예!"))
		);

		foodCourseDirector.addRestaurantFoodCourseBuilder("고급 레스토랑",
				new RestaurantFoodCourseBuilder()
						.addAppetizerFood(new Food("에피타이저1"))
						.addAppetizerFood(new Food("에피타이저2"))
						.addMainFood(new Food("맛나는 치킨"))
						.addMainFood(new Food("오예!"))
						.addDessertFood(new Food("아이스크립"))
						.addDessertFood(new Food("떠먹는 요거트"))
		);


		try {
			FoodCourse restaurantFoodCourse = foodCourseDirector.getRestaurantFoodCourse("고급 레스토랑");
			restaurantFoodCourse.service();

			FoodCourse eMartChickenFoodCourse = foodCourseDirector.getEMartFoodCourse("이마트 치킨집");
			eMartChickenFoodCourse.service();

			FoodCourse eMartChickenFoodCourse2 = foodCourseDirector.getEMartFoodCourse("이마트 치킨집2");
			eMartChickenFoodCourse2.service();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
