package behavioral._1_strategy.sort;

import behavioral._1_strategy.collection.Collection;

public class BubbleSortStrategy implements ISortStrategy {

	@Override
	public void sort(Collection collection) {
		System.out.println("버블 정렬 완료");
	}
}
