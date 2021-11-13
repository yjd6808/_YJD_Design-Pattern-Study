package behavioral._5_chain_of_responsibility.logger;

public class FileLogger extends Logger {
	public FileLogger(int mask) {
		super(mask);
	}

	@Override
	public void writeLog(int logLevel, String msg) {
		if ((logLevel & mask) != 0) {
			System.out.printf("[파일 출력][%s] %s\n", getLevelString(logLevel), msg);
		}

		if (next != null) { // 책임 연쇄
			next.writeLog(logLevel, msg);
		}
	}
}
