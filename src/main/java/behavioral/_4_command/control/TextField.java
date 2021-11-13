package behavioral._4_command.control;

import java.util.Scanner;

public class TextField implements IControl {
	private String content;
	public void edit() { content = new Scanner(System.in).next(); }
	@Override
	public void show() {
		System.out.print(content);
	}
}
