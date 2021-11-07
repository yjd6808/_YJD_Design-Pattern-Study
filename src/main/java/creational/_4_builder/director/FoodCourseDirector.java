package creational._4_builder.director;

import creational._4_builder.builder.FoodCourseBuilder;
import creational._4_builder.product.FoodCourse;

import java.util.HashMap;

public class FoodCourseDirector {
	HashMap<FoodCourseType, HashMap<String, FoodCourseBuilder>> foodCourseBuilderMap = new HashMap<>();

	public FoodCourseDirector() {
		// �Ϲ�������, ������� ������ �ʱ�ȭ
		foodCourseBuilderMap.put(FoodCourseType.EMart, new HashMap<>());
		foodCourseBuilderMap.put(FoodCourseType.Restaurant, new HashMap<>());
	}

	//	�Ϲ��������� Ǫ���ڽ� �߰�
	public void addEMartFoodCourseBuilder(String restaurantName, FoodCourseBuilder foodCourseBuilder) {
		foodCourseBuilderMap
				.get(FoodCourseType.EMart)
				.put(restaurantName, foodCourseBuilder);
	}


	//	������� �������� Ǫ���ڽ� �߰�
	public void addRestaurantFoodCourseBuilder(String restaurantName, FoodCourseBuilder foodCourseBuilder) {
		foodCourseBuilderMap
				.get(FoodCourseType.Restaurant)
				.put(restaurantName, foodCourseBuilder);
	}

	//	���ϴ� �Ϲ� �������� Ǫ�� �ڽ��� �����´�.
	public FoodCourse getEMartFoodCourse(String name) throws Exception {
		return foodCourseBuilderMap
				.get(FoodCourseType.EMart)
				.get(name)
				.build();
	}

	//	���ϴ� ������� �������� Ǫ�� �ڽ��� �����´�.
	public FoodCourse getRestaurantFoodCourse(String name) throws Exception {
		return foodCourseBuilderMap
				.get(FoodCourseType.Restaurant)
				.get(name)
				.build();
	}
}
