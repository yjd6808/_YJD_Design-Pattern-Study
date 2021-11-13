package behavioral._3_template_method.recipe;

public class HyungdoRamenRecipe extends RamenRecipe {
	@Override protected void pourWater() {
		System.out.println("물을 300ml 붓는다.");
	}
	@Override protected void boilRamen() {
		System.out.println("라면을 그냥 끓인다.");
	}
	@Override protected void waitForMinute() {
		System.out.println("30분간 기다린다.");
	}
}
