package behavioral._6_observer.observer;

import behavioral._6_observer.manager.ConsoleManager;

public class HelloObserver implements ConsoleObserver {
	@Override
	public void update(String arg) {
		System.out.println("\t[Hello] " + arg);
	}
}
