package behavioral._1_strategy.collection;

import behavioral._1_strategy.sort.ISortStrategy;

public class Array extends Collection {

	public Array() { super(); }
	public Array(ISortStrategy sortStrategy) { super(sortStrategy); }
	@Override
	public void sort() {
		System.out.print("¹è¿­ ");
		super.sort();
	}
}
