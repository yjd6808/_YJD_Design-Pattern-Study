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

		// 경고 또는 오류일 경우 파일로 기록한다.
		if ((logLevel & fileLogMask) != 0) {
			System.out.printf("[FILE][%s] %s\n", getLevelString(logLevel), msg);
		}

		// 오류가 발생한 경우 메일로 전송도 한다.
		if ((logLevel & mailLogMask) != 0) {
			System.out.printf("[MAIL][%s] %s\n", getLevelString(logLevel), msg);
		}
	}
}



public class OCP_violated {
	public static void main(String[] args) {
		Logger logger = new Logger();
		logger.writeLog(Logger.ERROR, "오류 발생");
		logger.writeLog(Logger.DEBUG, "디그버 진행합니다.");
		logger.writeLog(Logger.WARNING, "해당 코드는 문제가 있습니다.");
		
		/*
		출력 결과
		
		[ERROR] 오류 발생
		[FILE][ERROR] 오류 발생
		[MAIL][ERROR] 오류 발생
		[DEBUG] 디그버 진행합니다.
		[WARNING] 해당 코드는 문제가 있습니다.
		[FILE][WARNING] 해당 코드는 문제가 있습니다.
		
		 */
	}
}
