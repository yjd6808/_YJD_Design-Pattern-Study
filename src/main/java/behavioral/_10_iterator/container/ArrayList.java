package behavioral._10_iterator.container;

import behavioral._10_iterator.iterator.ArrayIterator;
import behavioral._10_iterator.iterator.Iterator;

public class ArrayList<T>  implements IContainer<T> {
	private static final int DEFAULT_CAPACITY = 32;
	private Object[] data;
	private int size;

	public ArrayList() {
		this.data = new Object[DEFAULT_CAPACITY];
	}

	@Override
	public void add(T data) {
		this.data[size++] = data;
		// �ڵ� Ȯ���� �ܼ�ȭ�� ���� ���� �ʴ´�.
	}

	@Override
	public void remove(T data) {
		System.out.printf("\t%d ����\n", data);
		Iterator<T> iterator = iterator();
		int removeIdx = 0;
		while (iterator.hasNext()) {
			if (iterator.next() == data) {
				break;
			}
			removeIdx++;
		}

		// ������ �ε��� ���ĺ��� ��ĭ�� �����
		if (removeIdx < size) {
			for (int indexer = removeIdx + 1; indexer < size; indexer++) {
				this.data[indexer - 1] = this.data[indexer];
			}
			size--;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new ArrayIterator<>((T[])data, 0, size);
	}

	@Override
	public int size() {
		return size;
	}
}
