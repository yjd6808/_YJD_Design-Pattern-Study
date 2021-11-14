package behavioral._7_memento.caretaker;

import behavioral._7_memento.memento.OmokStoneMap;

import java.util.ArrayList;
import java.util.List;

public class OmokRecorder {
	private List<OmokStoneMap> records = new ArrayList<>();
	private int pos;
	private int size;

	public void addMemento(OmokStoneMap record) {
		// 마지막이 아닌 경우에는 덮어씀
		if (pos < records.size() - 1) {
			size = pos;
		}

		records.add(record);
		size++;
		pos = size - 1;
	}

	public OmokStoneMap redo() {
		System.out.println("착수 복구 수행");
		return records.get(++pos);
	}

	public OmokStoneMap undo() {
		System.out.println("착수 취소 수행");
		return records.get(--pos);
	}
}
