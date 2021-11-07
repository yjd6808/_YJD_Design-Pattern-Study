package creational._4_builder.director;

import creational._4_builder.builder.FoodCourseBuilder;
import creational._4_builder.product.FoodCourse;

import java.util.HashMap;

public class FoodCourseDirector {
	HashMap<FoodCourseType, HashMap<String, FoodCourseBuilder>> foodCourseBuilderMap = new HashMap<>();

	public FoodCourseDirector() {
		// 일반음식점, 레스토랑 음식점 초기화
		foodCourseBuilderMap.put(FoodCourseType.EMart, new HashMap<>());
		foodCourseBuilderMap.put(FoodCourseType.Restaurant, new HashMap<>());
	}

	//	일반음식점의 푸드코스 추가
	public void addEMartFoodCourseBuilder(String restaurantName, FoodCourseBuilder foodCourseBuilder) {
		foodCourseBuilderMap
				.get(FoodCourseType.EMart)
				.put(restaurantName, foodCourseBuilder);
	}


	//	레스토랑 음식점의 푸드코스 추가
	public void addRestaurantFoodCourseBuilder(String restaurantName, FoodCourseBuilder foodCourseBuilder) {
		foodCourseBuilderMap
				.get(FoodCourseType.Restaurant)
				.put(restaurantName, foodCourseBuilder);
	}

	//	원하는 일반 음식점의 푸드 코스를 가져온다.
	public FoodCourse getEMartFoodCourse(String name) throws Exception {
		return foodCourseBuilderMap
				.get(FoodCourseType.EMart)
				.get(name)
				.build();
	}

	//	원하는 레스토랑 음식점의 푸드 코스를 가져온다.
	public FoodCourse getRestaurantFoodCourse(String name) throws Exception {
		return foodCourseBuilderMap
				.get(FoodCourseType.Restaurant)
				.get(name)
				.build();
	}
}
