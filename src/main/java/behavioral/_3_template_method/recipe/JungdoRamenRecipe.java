package behavioral._3_template_method.recipe;

public class JungdoRamenRecipe extends RamenRecipe {
	@Override protected void pourWater() {
		System.out.println("물을 100ml 붓는다.");
	}
	@Override protected void boilRamen() {
		System.out.println("라면을 휘저으면서 끓인다.");
	}
	@Override protected void waitForMinute() {
		System.out.println("5분간 기다린다.");
	}
}
