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

		// Ŀ�ǵ� ����
		wizard.addPage(new StartPage());
		wizard.addPage(new DownloadPage());
		wizard.addPage(new Page() {
			@Override
			protected void initializeControls() {
				controls.add(new Label("\t�ӽ� ������ �Դϴ�.\n"));
				controls.add(new Label("\t�ƹ��� ����� �����ϴ�.\n"));
			}
		});
		wizard.addPage(new LastPage());
		wizard.run();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.next();

			if (input.equals("n")) {
				wizard.next();	// Ŀ�ǵ� ����
			} else if (input.equals("p")) {
				wizard.previous();	// Ŀ�ǵ� ����
			}  else if (input.equals("f")) {
				if (wizard.finish()) {
					break;
				}
			}
		}
	}
}
