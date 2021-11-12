package behavioral._2_state.user;

import behavioral._2_state.state.*;

public class User {
	private IMoveState moveState;

	public User(IMoveState state) {
		this.moveState = state;
	}

	public void setMoveState(IMoveState moveState) {
		this.moveState = moveState;
	}

	public void move() {
		moveState.move(this);
	}
}
