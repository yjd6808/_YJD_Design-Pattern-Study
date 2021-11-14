package behavioral._7_memento;

import behavioral._7_memento.caretaker.OmokRecorder;
import behavioral._7_memento.originator.OmokBoard;
import behavioral._7_memento.state.OmokColor;
import behavioral._7_memento.state.OmokStoneState;

public class MementoMain {
	public static void main(String[] args) {
		OmokRecorder recorder = new OmokRecorder();
		OmokBoard board = new OmokBoard();

		board.put(new OmokStoneState(10, 10, OmokColor.BLACK));
		board.draw();
		recorder.addMemento(board.createMemento());

		board.put(new OmokStoneState(11, 10, OmokColor.WHITE));
		board.draw();
		recorder.addMemento(board.createMemento());

		board.put(new OmokStoneState(11, 11, OmokColor.BLACK));
		board.draw();
		recorder.addMemento(board.createMemento());

		board.put(new OmokStoneState(12, 12, OmokColor.WHITE));
		board.draw();
		recorder.addMemento(board.createMemento());

		board.put(new OmokStoneState(13, 12, OmokColor.BLACK));
		board.draw();
		recorder.addMemento(board.createMemento());

		board.put(new OmokStoneState(14, 12, OmokColor.WHITE));
		board.draw();
		recorder.addMemento(board.createMemento());


		board.setMemento(recorder.undo());
		board.draw();

		board.setMemento(recorder.undo());
		board.draw();

		board.setMemento(recorder.undo());
		board.draw();

		board.setMemento(recorder.undo());
		board.draw();

		board.setMemento(recorder.undo());
		board.draw();

		board.setMemento(recorder.redo());
		board.draw();

		board.setMemento(recorder.redo());
		board.draw();

		board.setMemento(recorder.redo());
		board.draw();

		board.setMemento(recorder.redo());
		board.draw();

		board.setMemento(recorder.redo());
		board.draw();

		// 수행 취소 후 착수
		board.setMemento(recorder.undo());
		board.draw();

		board.put(new OmokStoneState(15, 12, OmokColor.WHITE));
		recorder.addMemento(board.createMemento());
		board.draw();

		board.setMemento(recorder.undo());
		board.draw();

		board.setMemento(recorder.undo());
		board.draw();

		board.setMemento(recorder.undo());
		board.draw();

		board.setMemento(recorder.redo());
		board.draw();

		board.setMemento(recorder.redo());
		board.draw();

		board.setMemento(recorder.redo());
		board.draw();
	}
}
