package creational._3_abstract_factory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		Intellij intellij = new Intellij();

		// ���ڸ����� �����׸��� ����
		intellij.changeTheme(Theme.DARK);
		intellij.doJob();
		
		// ���ڸ����� �Ͼ���׸��� ����
		intellij.changeTheme(Theme.WHITE);
		intellij.doJob();
	}
}
