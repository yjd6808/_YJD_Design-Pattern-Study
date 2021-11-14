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

		// �̺�Ʈ(������) ���
		ConsoleObserver timeObserver = new TimeObserver();
		ConsoleObserver helloObserver = new HelloObserver();
		ConsoleObserver anonymousWriteObserver = (arg) -> System.out.println("\t[�͸� �б� �Լ�] " + arg);
		ConsoleObserver anonymousReadObserver = (arg) -> System.out.println("\t[�͸� �б� �Լ�] " + arg);

		consoleManager.readObservable.register(timeObserver);
		consoleManager.readObservable.register(anonymousReadObserver);
		consoleManager.writeObservable.register(helloObserver);
		consoleManager.writeObservable.register(anonymousWriteObserver);

		// �޽��� ����
		consoleManager.write("�ȳ��ϼ���!");
		String msg = consoleManager.read();

		// �̺�Ʈ(������) ����
		consoleManager.readObservable.unRegister(timeObserver);
		consoleManager.writeObservable.unRegister(helloObserver);

		// �޽��� ����
		consoleManager.write("�ȳ��ϼ���!");
		msg = consoleManager.read();
	}
}
