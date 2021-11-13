package behavioral._3_template_method.recipe;

public class JungdoRamenRecipe extends RamenRecipe {
	@Override protected void pourWater() {
		System.out.println("���� 100ml �״´�.");
	}
	@Override protected void boilRamen() {
		System.out.println("����� �������鼭 ���δ�.");
	}
	@Override protected void waitForMinute() {
		System.out.println("5�а� ��ٸ���.");
	}
}
