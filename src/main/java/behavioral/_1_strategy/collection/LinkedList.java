package behavioral._1_strategy.collection;

import behavioral._1_strategy.sort.ISortStrategy;

public class LinkedList extends Collection {

	public LinkedList() { super(); }
	public LinkedList(ISortStrategy sortStrategy) { super(sortStrategy); }
	@Override
	public void sort() {
		System.out.print("연결리스트 ");
		super.sort();
	}
}
