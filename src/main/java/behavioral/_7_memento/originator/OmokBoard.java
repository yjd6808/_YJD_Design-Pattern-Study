package behavioral._7_memento.originator;

import behavioral._7_memento.memento.OmokStoneMap;
import behavioral._7_memento.state.OmokColor;
import behavioral._7_memento.state.OmokStoneState;

public class OmokBoard {
	public static final int BOARD_SIZE = 19;
	private OmokStoneState[][] stoneStates = new OmokStoneState[BOARD_SIZE][BOARD_SIZE];


	public void setMemento(OmokStoneMap omokStoneMap) {
		stoneStates = omokStoneMap.getOmokStoneMap();
	}

	public OmokStoneMap createMemento() {
		return new OmokStoneMap(stoneStates);
	}

	public void put(OmokStoneState state) {
		stoneStates[state.getY()][state.getX()] = state;
		System.out.println(state.toString());
	}

	public void draw() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				if (stoneStates[i][j] != null) {
					System.out.println("\t" + stoneStates[i][j].toString());
				}
			}
		}
	}
}
