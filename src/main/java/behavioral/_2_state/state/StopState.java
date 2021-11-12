package behavioral._2_state.state;

import behavioral._2_state.user.User;

public class StopState implements  IMoveState {
	private int callCount = 0;

	@Override
	public void move(User user) {
		if (callCount == 0) {
			System.out.printf("유저가 멈췄습니다.\n");
			callCount++;
		} else {
			System.out.printf("멈췄는데 어떻게 움직여요? ㄷㄷ\n");
		}
	}
}
