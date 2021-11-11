package behavioral._1_strategy.sort;

import behavioral._1_strategy.collection.Collection;

public class MergeSortStrategy implements ISortStrategy {

	@Override
	public void sort(Collection collection) {
		System.out.println("병합 정렬 완료");
	}
}
