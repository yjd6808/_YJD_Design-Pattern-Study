package behavioral._3_template_method.recipe;

public abstract class RamenRecipe {

	public void cookRamen() {
		readyForCook();
		pourWater();
		boilRamen();
		waitForMinute();
	}

	protected void readyForCook() { System.out.println("냄비를 준비한다."); }
	protected abstract void pourWater();
	protected abstract void boilRamen();
	protected abstract void waitForMinute();
}
