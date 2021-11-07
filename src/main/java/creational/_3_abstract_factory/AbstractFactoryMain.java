package creational._3_abstract_factory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		Intellij intellij = new Intellij();

		// 인텔리제이 검정테마로 변경
		intellij.changeTheme(Theme.DARK);
		intellij.doJob();
		
		// 인텔리제이 하얀색테마로 변경
		intellij.changeTheme(Theme.WHITE);
		intellij.doJob();
	}
}
