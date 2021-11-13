package behavioral._6_observer.observable;

import behavioral._6_observer.observer.ConsoleObserver;

import java.util.LinkedList;
import java.util.List;

public class ConsoleObservable {
	private List<ConsoleObserver> observers = new LinkedList<>();

	public void register(ConsoleObserver observer) { observers.add(observer); }
	public void unRegister(ConsoleObserver observer) { observers.remove(observer); }
	public void notifyAll(String msg) {
		observers.forEach(x -> x.update(msg));
	}
}
