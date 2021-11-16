package behavioral._10_iterator;

import behavioral._10_iterator.container.ArrayList;
import behavioral._10_iterator.container.IContainer;
import behavioral._10_iterator.container.LinkedList;
import behavioral._10_iterator.iterator.Iterator;

public class IteratorMain {

	private static <T> void print(IContainer<T> collection) {
		StringBuilder builder = new StringBuilder(50);
		builder.append("[ ");
		Iterator<T> iter = collection.iterator();
		while (iter.hasNext()) {
			builder.append(iter.next() + " ");
		}
		builder.append(']');
		System.out.println("\t" + builder.toString());
	}

	public static void main(String[] args) {
		IContainer<Integer> list = new LinkedList<>();
		IContainer<Integer> array = new ArrayList<>();

		System.out.println("[연결리스트에 원소 추가]");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		print(list);
		list.add(60);
		print(list);

		System.out.println("[연결리스트에 원소 삭제]");
		list.remove(10);
		print(list);
		list.remove(40);
		print(list);
		list.remove(60);
		print(list);

		System.out.println("[배열에 원소 추가]");
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		print(array);
		array.add(60);
		print(array);

		System.out.println("[배열에 원소 삭제]");
		array.remove(10);
		print(array);
		array.remove(40);
		print(array);
		array.remove(60);
		print(array);
		
	}
}
