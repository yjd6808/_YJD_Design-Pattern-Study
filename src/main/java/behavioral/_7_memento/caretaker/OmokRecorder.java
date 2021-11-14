package behavioral._7_memento.caretaker;

import behavioral._7_memento.memento.OmokStoneMap;

import java.util.ArrayList;
import java.util.List;

public class OmokRecorder {
	private List<OmokStoneMap> records = new ArrayList<>();
	private int pos;
	private int size;

	public void addMemento(OmokStoneMap record) {
		// �������� �ƴ� ��쿡�� ���
		if (pos < records.size() - 1) {
			size = pos;
		}

		records.add(record);
		size++;
		pos = size - 1;
	}

	public OmokStoneMap redo() {
		System.out.println("���� ���� ����");
		return records.get(++pos);
	}

	public OmokStoneMap undo() {
		System.out.println("���� ��� ����");
		return records.get(--pos);
	}
}
