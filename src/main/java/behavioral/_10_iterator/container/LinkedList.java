package behavioral._10_iterator.container;

import behavioral._10_iterator.iterator.Iterator;
import behavioral._10_iterator.iterator.ListIterator;
import behavioral._10_iterator.node.ListNode;

public class LinkedList<T> implements IContainer<T> {
	private ListNode<T> head;
	private ListNode<T> tail;
	private int size;

	@Override
	public void add(T data) {
		ListNode<T> newNode = new ListNode<>(data);
		if (head == null) {
			head = newNode;
		} else {
			tail.setNext(newNode);
		}
		tail = newNode;
		size++;
	}

	@Override
	public void remove(T data) {
		System.out.printf("\t%d ªË¡¶\n", data);
		if (head == null) {
			return;
		}

		if (head.getData() == data) {
			head = head.getNext();

			if (head == null)
				tail = null;
			size--;
			return;
		}

		ListNode<T> cur = head.getNext();
		ListNode<T> prev = head;

		while (cur != null) {
			if (cur.getData() == data) {
				prev.setNext(cur.getNext());

				if (cur == tail) {
					prev = tail;
				}
				size--;
				break;
			}
			prev = cur;
			cur = cur.getNext();
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new ListIterator<>(head);
	}

	@Override
	public int size() {
		return size;
	}
}
