package behavioral._6_observer.manager;

import behavioral._6_observer.observable.ConsoleObservable;

import java.util.Scanner;

public class ConsoleManager {
	private static final ConsoleManager INSTANCE = new ConsoleManager();
	private ConsoleManager() {}
	public static ConsoleManager getInstance() { return INSTANCE; }

	public ConsoleObservable readObservable = new ConsoleObservable();
	public ConsoleObservable writeObservable = new ConsoleObservable();

	public void write(String msg) {
		System.out.println("[콘솔 출력 진행]");
		writeObservable.notifyAll(msg);
		System.out.println("======================");
	}

	public String read() {
		System.out.println("[콘솔 입력 진행]");
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.next();
		readObservable.notifyAll(msg);
		System.out.println("======================");
		return msg;
	}
}
