package behavioral._4_command.page;

import behavioral._4_command.control.Label;
import behavioral._4_command.control.TextField;

public class LastPage extends Page {
	@Override
	protected void initializeControls() {
		controls.add(new Label("\t설치 경로를 지정해주세요 : \n"));
	}
}
