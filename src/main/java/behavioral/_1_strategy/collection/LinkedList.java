package behavioral._1_strategy.collection;

import behavioral._1_strategy.sort.ISortStrategy;

public class LinkedList extends Collection {

	public LinkedList() { super(); }
	public LinkedList(ISortStrategy sortStrategy) { super(sortStrategy); }
	@Override
	public void sort() {
		System.out.print("���Ḯ��Ʈ ");
		super.sort();
	}
}
