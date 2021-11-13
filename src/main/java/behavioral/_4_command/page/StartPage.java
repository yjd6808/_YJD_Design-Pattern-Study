package behavioral._4_command.page;

import behavioral._4_command.control.*;

public class StartPage extends Page {
	@Override
	protected void initializeControls() {
		controls.add(new Label("\t어서오세요. 짱도 설치 마법사입니다.\n"));
		controls.add(new Label("\t계속 진행하실려면 Next를 눌러주세요.\n"));
	}
}
