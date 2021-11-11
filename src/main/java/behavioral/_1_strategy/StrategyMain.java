package behavioral._1_strategy;

import behavioral._1_strategy.collection.*;
import behavioral._1_strategy.sort.*;


public class StrategyMain {
	public static void main(String[] args) {
		Collection array = new Array();
		Collection linkedList = new LinkedList(new BubbleSortStrategy());

		array.sort();
		linkedList.sort();

		// ��Ÿ���߿� �������� ���Ĺ�� ���氡��
		array.setSortStrategy(new MergeSortStrategy());
		array.sort();

		array.setSortStrategy(new SelectionSortStrategy());
		array.sort();
	}
}
