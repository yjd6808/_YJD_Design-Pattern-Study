package behavioral._4_command.page;

import behavioral._4_command.control.Label;

public class DownloadPage extends Page {
	@Override
	protected void initializeControls() {
		controls.add(new Label("\t�ٿ�ε尡 �������Դϴ�.\n"));
		controls.add(new Label("\t�ٿ�ε尡 �Ϸ�Ǿ����ϴ�.\n"));
	}
}
