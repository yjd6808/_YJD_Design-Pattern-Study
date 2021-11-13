package behavioral._4_command.control;

public class Label implements IControl {
	private String content;
	public Label(String content) {
		this.content = content;
	}
	@Override
	public void show() {
		System.out.print(content);
	}
}
