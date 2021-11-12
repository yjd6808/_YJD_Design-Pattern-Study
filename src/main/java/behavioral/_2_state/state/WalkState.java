package behavioral._2_state.state;

import behavioral._2_state.user.User;

public class WalkState implements  IMoveState {

	@Override
	public void move(User user) {
		System.out.printf("������ �Ȱ� �ֽ��ϴ�. �� ���߰� �˴ϴ�.\n");
		user.setMoveState(new StopState());
	}

}
