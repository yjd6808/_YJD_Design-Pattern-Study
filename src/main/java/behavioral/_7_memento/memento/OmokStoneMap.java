package behavioral._7_memento.memento;

import behavioral._7_memento.state.OmokStoneState;

public class OmokStoneMap {
	private OmokStoneState[][] omokStoneMap;

	public OmokStoneMap(OmokStoneState[][] omokStoneMap) {
		this.omokStoneMap = new OmokStoneState[omokStoneMap.length][omokStoneMap.length];
		for (int i = 0; i < omokStoneMap.length; i++) {
			for (int j = 0; j < omokStoneMap[i].length; j++) {
				if (omokStoneMap[i][j] != null) {
					this.omokStoneMap[i][j] = omokStoneMap[i][j].clone();
				}
			}
		}
	}

	public OmokStoneState[][] getOmokStoneMap() {
		return omokStoneMap;
	}
}
