package behavioral._6_observer.observer;

import behavioral._6_observer.manager.ConsoleManager;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeObserver implements ConsoleObserver {
	@Override
	public void update(String arg) {
		System.out.printf("\t[%s] %s\n",
				new SimpleDateFormat("hh:mm:ss").format(new Date()), arg);
	}
}
