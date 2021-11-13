package behavioral._3_template_method.recipe;

public abstract class RamenRecipe {

	public void cookRamen() {
		readyForCook();
		pourWater();
		boilRamen();
		waitForMinute();
	}

	protected void readyForCook() { System.out.println("���� �غ��Ѵ�."); }
	protected abstract void pourWater();
	protected abstract void boilRamen();
	protected abstract void waitForMinute();
}
