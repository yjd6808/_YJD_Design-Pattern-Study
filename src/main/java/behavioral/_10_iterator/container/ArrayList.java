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
		// 자동 확장은 단순화를 위해 넣지 않는다.
	}

	@Override
	public void remove(T data) {
		System.out.printf("\t%d 삭제\n", data);
		Iterator<T> iterator = iterator();
		int removeIdx = 0;
		while (iterator.hasNext()) {
			if (iterator.next() == data) {
				break;
			}
			removeIdx++;
		}

		// 삭제한 인덱스 이후부터 한칸씩 당겨줌
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
