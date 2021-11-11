package behavioral._1_strategy.collection;

import behavioral._1_strategy.sort.ISortStrategy;
import behavioral._1_strategy.sort.MergeSortStrategy;

public abstract class Collection {
	private ISortStrategy sortStrategy;

	// 그냥 만들시에는 병합 정렬로 초기화
	public Collection() { sortStrategy = new MergeSortStrategy(); }
	public Collection(ISortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void setSortStrategy(ISortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void sort() {
		sortStrategy.sort(this);
	}
}
