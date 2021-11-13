package behavioral._5_chain_of_responsibility.logger;

public class FileLogger extends Logger {
	public FileLogger(int mask) {
		super(mask);
	}

	@Override
	public void writeLog(int logLevel, String msg) {
		if ((logLevel & mask) != 0) {
			System.out.printf("[���� ���][%s] %s\n", getLevelString(logLevel), msg);
		}

		if (next != null) { // å�� ����
			next.writeLog(logLevel, msg);
		}
	}
}
