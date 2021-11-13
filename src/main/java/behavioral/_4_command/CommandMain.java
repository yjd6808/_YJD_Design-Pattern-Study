package behavioral._4_command;

import behavioral._4_command.control.Label;
import behavioral._4_command.page.DownloadPage;
import behavioral._4_command.page.LastPage;
import behavioral._4_command.page.Page;
import behavioral._4_command.page.StartPage;
import behavioral._4_command.wizard.Wizard;

import java.util.Scanner;

public class CommandMain {
	public static void main(String[] args) {
		Wizard wizard = new Wizard();

		// 커맨드 전달
		wizard.addPage(new StartPage());
		wizard.addPage(new DownloadPage());
		wizard.addPage(new Page() {
			@Override
			protected void initializeControls() {
				controls.add(new Label("\t임시 페이지 입니다.\n"));
				controls.add(new Label("\t아무런 기능이 없습니다.\n"));
			}
		});
		wizard.addPage(new LastPage());
		wizard.run();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.next();

			if (input.equals("n")) {
				wizard.next();	// 커맨드 수행
			} else if (input.equals("p")) {
				wizard.previous();	// 커맨드 수행
			}  else if (input.equals("f")) {
				if (wizard.finish()) {
					break;
				}
			}
		}
	}
}
