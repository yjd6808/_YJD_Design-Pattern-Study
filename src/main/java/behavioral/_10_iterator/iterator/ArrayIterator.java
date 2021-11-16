package behavioral._10_iterator.iterator;

public class ArrayIterator<T> implements Iterator<T> {
	private T[] data;
	private int iterator;
	private int size;

	public ArrayIterator(T[] data, int start, int size) {
		this.data = data;
		this.iterator = start;
		this.size = size;
	}

	@Override
	public boolean hasNext() {
		return iterator < size;
	}

	@Override
	public T next() {
		return data[iterator++];
	}
}
