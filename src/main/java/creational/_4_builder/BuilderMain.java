package creational._4_builder;

import creational._4_builder.builder.EMartFoodCourseBuilder;
import creational._4_builder.builder.RestaurantFoodCourseBuilder;
import creational._4_builder.director.FoodCourseDirector;
import creational._4_builder.object.Food;
import creational._4_builder.product.FoodCourse;

public class BuilderMain {
	public static void main(String[] args) {
		FoodCourseDirector foodCourseDirector = new FoodCourseDirector();
		
		foodCourseDirector.addEMartFoodCourseBuilder("�̸�Ʈ ġŲ��",
				new EMartFoodCourseBuilder()
						.addMainFood(new Food("����ġŲ"))
						.addMainFood(new Food("����Ƣ��"))
		);

		foodCourseDirector.addEMartFoodCourseBuilder("�̸�Ʈ ġŲ��2",
				new EMartFoodCourseBuilder()
						.addMainFood(new Food("������ ġŲ"))
						.addMainFood(new Food("����!"))
		);

		foodCourseDirector.addRestaurantFoodCourseBuilder("��� �������",
				new RestaurantFoodCourseBuilder()
						.addAppetizerFood(new Food("����Ÿ����1"))
						.addAppetizerFood(new Food("����Ÿ����2"))
						.addMainFood(new Food("������ ġŲ"))
						.addMainFood(new Food("����!"))
						.addDessertFood(new Food("���̽�ũ��"))
						.addDessertFood(new Food("���Դ� ���Ʈ"))
		);


		try {
			FoodCourse restaurantFoodCourse = foodCourseDirector.getRestaurantFoodCourse("��� �������");
			restaurantFoodCourse.service();

			FoodCourse eMartChickenFoodCourse = foodCourseDirector.getEMartFoodCourse("�̸�Ʈ ġŲ��");
			eMartChickenFoodCourse.service();

			FoodCourse eMartChickenFoodCourse2 = foodCourseDirector.getEMartFoodCourse("�̸�Ʈ ġŲ��2");
			eMartChickenFoodCourse2.service();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
