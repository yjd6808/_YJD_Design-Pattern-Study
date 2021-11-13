package behavioral._3_template_method.recipe;

public class HyungdoRamenRecipe extends RamenRecipe {
	@Override protected void pourWater() {
		System.out.println("���� 300ml �״´�.");
	}
	@Override protected void boilRamen() {
		System.out.println("����� �׳� ���δ�.");
	}
	@Override protected void waitForMinute() {
		System.out.println("30�а� ��ٸ���.");
	}
}
