package behavioral._5_chain_of_responsibility.logger;

public class ConsoleLogger extends Logger {
	public ConsoleLogger(int mask) {
		super(mask);
	}

	@Override
	public void writeLog(int logLevel, String msg) {
		if ((logLevel & mask) != 0) {
			System.out.printf("[%s] %s\n", getLevelString(logLevel), msg);
		}

		if (next != null) { // √•¿” ø¨º‚
			next.writeLog(logLevel, msg);
		}
	}
}
