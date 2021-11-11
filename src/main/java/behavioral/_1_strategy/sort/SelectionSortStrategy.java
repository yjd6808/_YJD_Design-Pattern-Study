package behavioral._1_strategy.sort;

import behavioral._1_strategy.collection.Collection;

public class SelectionSortStrategy implements ISortStrategy {

	@Override
	public void sort(Collection collection) {
		System.out.println("선택 정렬 완료");
	}
}
