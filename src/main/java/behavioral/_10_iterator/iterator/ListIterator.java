package behavioral._10_iterator.iterator;

import behavioral._10_iterator.node.ListNode;

public class ListIterator<T> implements Iterator<T> {
	private ListNode<T> iterator;

	public ListIterator(ListNode<T> iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasNext() {
		return iterator != null;
	}

	@Override
	public T next() {
		T data = iterator.getData();
		iterator = iterator.getNext();
		return data;
	}
}
