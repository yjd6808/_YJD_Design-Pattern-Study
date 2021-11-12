package behavioral._2_state;

import behavioral._2_state.state.RunState;
import behavioral._2_state.state.StopState;
import behavioral._2_state.user.User;

import java.util.Scanner;

public class StateMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		User user = new User(new RunState());
		user.move();
		user.move();
		user.move();
		user.move();
		user.move();
		user.move();
		user.move();
	}
}
