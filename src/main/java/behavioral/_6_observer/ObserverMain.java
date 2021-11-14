package behavioral._6_observer;

import behavioral._6_observer.manager.ConsoleManager;
import behavioral._6_observer.observer.ConsoleObserver;
import behavioral._6_observer.observer.HelloObserver;
import behavioral._6_observer.observer.TimeObserver;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;


public class ObserverMain {
	public static void main(String[] args) {
		ConsoleManager consoleManager = ConsoleManager.getInstance();

		// 이벤트(옵저버) 등록
		ConsoleObserver timeObserver = new TimeObserver();
		ConsoleObserver helloObserver = new HelloObserver();
		ConsoleObserver anonymousWriteObserver = (arg) -> System.out.println("\t[익명 읽기 함수] " + arg);
		ConsoleObserver anonymousReadObserver = (arg) -> System.out.println("\t[익명 읽기 함수] " + arg);

		consoleManager.readObservable.register(timeObserver);
		consoleManager.readObservable.register(anonymousReadObserver);
		consoleManager.writeObservable.register(helloObserver);
		consoleManager.writeObservable.register(anonymousWriteObserver);

		// 메시지 실행
		consoleManager.write("안녕하세요!");
		String msg = consoleManager.read();

		// 이벤트(옵저버) 제거
		consoleManager.readObservable.unRegister(timeObserver);
		consoleManager.writeObservable.unRegister(helloObserver);

		// 메시지 실행
		consoleManager.write("안녕하세요!");
		msg = consoleManager.read();
	}
}
