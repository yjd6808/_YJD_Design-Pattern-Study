package behavioral._2_state.state;

import behavioral._2_state.user.User;

public class StopState implements  IMoveState {
	private int callCount = 0;

	@Override
	public void move(User user) {
		if (callCount == 0) {
			System.out.printf("������ ������ϴ�.\n");
			callCount++;
		} else {
			System.out.printf("����µ� ��� ��������? ����\n");
		}
	}
}
