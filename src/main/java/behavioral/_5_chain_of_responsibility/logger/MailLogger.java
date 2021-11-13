package behavioral._5_chain_of_responsibility.logger;

public class MailLogger extends Logger {
	public MailLogger(int mask) {
		super(mask);
	}

	@Override
	public void writeLog(int logLevel, String msg) {
		if ((logLevel & mask) != 0) {
			System.out.printf("[메일 발송][%s] %s\n", getLevelString(logLevel), msg);
		}

		if (next != null) { // 책임 연쇄
			next.writeLog(logLevel, msg);
		}
	}
}
