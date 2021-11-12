package behavioral._2_state.state;

import behavioral._2_state.user.User;

public class RunState implements  IMoveState {

	@Override
	public void move(User user) {
		System.out.printf("������ �޸��� �ֽ��ϴ�. �� �Ȱ� �˴ϴ�.\n");
		user.setMoveState(new WalkState());
	}

}
