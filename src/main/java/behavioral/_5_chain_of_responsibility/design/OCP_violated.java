package behavioral._5_chain_of_responsibility.design;

class Logger {
	public static final int DEBUG = 0b1;
	public static final int INFO = 0b10;
	public static final int WARNING = 0b100;
	public static final int ERROR = 0b1000;
	public static final int MAX = 0b10000;
	public static final int ALL = DEBUG | INFO | WARNING | ERROR;

	public int consoleLogMask = ALL;
	public int fileLogMask = WARNING | ERROR;
	public int mailLogMask = ERROR;

	String getLevelString(int logLevel) {
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

	void writeLog(int logLevel, String msg) {
		if ((logLevel & consoleLogMask) != 0) {
			System.out.printf("[%s] %s\n", getLevelString(logLevel), msg);
		}

		// ��� �Ǵ� ������ ��� ���Ϸ� ����Ѵ�.
		if ((logLevel & fileLogMask) != 0) {
			System.out.printf("[FILE][%s] %s\n", getLevelString(logLevel), msg);
		}

		// ������ �߻��� ��� ���Ϸ� ���۵� �Ѵ�.
		if ((logLevel & mailLogMask) != 0) {
			System.out.printf("[MAIL][%s] %s\n", getLevelString(logLevel), msg);
		}
	}
}



public class OCP_violated {
	public static void main(String[] args) {
		Logger logger = new Logger();
		logger.writeLog(Logger.ERROR, "���� �߻�");
		logger.writeLog(Logger.DEBUG, "��׹� �����մϴ�.");
		logger.writeLog(Logger.WARNING, "�ش� �ڵ�� ������ �ֽ��ϴ�.");
		
		/*
		��� ���
		
		[ERROR] ���� �߻�
		[FILE][ERROR] ���� �߻�
		[MAIL][ERROR] ���� �߻�
		[DEBUG] ��׹� �����մϴ�.
		[WARNING] �ش� �ڵ�� ������ �ֽ��ϴ�.
		[FILE][WARNING] �ش� �ڵ�� ������ �ֽ��ϴ�.
		
		 */
	}
}
