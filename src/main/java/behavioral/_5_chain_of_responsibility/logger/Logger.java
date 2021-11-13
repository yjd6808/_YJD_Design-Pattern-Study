package behavioral._5_chain_of_responsibility.logger;

public abstract class Logger {
	public static final int DEBUG = 0b1;
	public static final int INFO = 0b10;
	public static final int WARNING = 0b100;
	public static final int ERROR = 0b1000;
	public static final int MAX = 0b10000;
	public static final int ALL = DEBUG | INFO | WARNING | ERROR;

	protected int mask;
	protected Logger next;

	public Logger(int mask) {
		this.mask = mask;
	}

	public void AddNextLogger(Logger logger) {
		if (next == null) {
			next = logger;
		} else {
			next.next = logger;
		}
	}

	protected String getLevelString(int logLevel) {
		switch (logLevel) {
			case DEBUG:
				return "DEBUG";
			case INFO:
				return "INFO";
			case WARNING:
				return "WARNING";
			case ERROR:
				return "ERROR";
		}
		return "??";
	}

	abstract public void writeLog(int logLevel, String msg);
}
