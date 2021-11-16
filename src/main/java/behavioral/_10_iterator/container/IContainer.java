package behavioral._10_iterator.container;

import behavioral._10_iterator.iterator.Iterator;

public interface IContainer<T> {
	void add(T data);
	void remove(T data);
	int size();
	Iterator<T> iterator();
}
