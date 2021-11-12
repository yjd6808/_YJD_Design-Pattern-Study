package behavioral._2_state.state;

import behavioral._2_state.user.User;

public class WalkState implements  IMoveState {

	@Override
	public void move(User user) {
		System.out.printf("유저가 걷고 있습니다. 곧 멈추게 됩니다.\n");
		user.setMoveState(new StopState());
	}

}
