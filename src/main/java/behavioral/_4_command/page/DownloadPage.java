package behavioral._4_command.page;

import behavioral._4_command.control.Label;

public class DownloadPage extends Page {
	@Override
	protected void initializeControls() {
		controls.add(new Label("\t다운로드가 진행중입니다.\n"));
		controls.add(new Label("\t다운로드가 완료되었습니다.\n"));
	}
}
