package behavioral._4_command.page;

import behavioral._4_command.control.*;

public class StartPage extends Page {
	@Override
	protected void initializeControls() {
		controls.add(new Label("\t�������. ¯�� ��ġ �������Դϴ�.\n"));
		controls.add(new Label("\t��� �����ϽǷ��� Next�� �����ּ���.\n"));
	}
}
