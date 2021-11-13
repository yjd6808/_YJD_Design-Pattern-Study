package behavioral._5_chain_of_responsibility;

import behavioral._5_chain_of_responsibility.logger.ConsoleLogger;
import behavioral._5_chain_of_responsibility.logger.FileLogger;
import behavioral._5_chain_of_responsibility.logger.Logger;
import behavioral._5_chain_of_responsibility.logger.MailLogger;

public class CORMain {
	public static void main(String[] args) {
		Logger logger = new ConsoleLogger(Logger.ALL);
		logger.AddNextLogger(new FileLogger(Logger.WARNING | Logger.ERROR));
		logger.AddNextLogger(new MailLogger(Logger.ERROR));

		logger.writeLog(Logger.DEBUG, "디버그를 출력합니다."); 	System.out.println();
		logger.writeLog(Logger.INFO, "정보를 출력합니다.");		System.out.println();
		logger.writeLog(Logger.WARNING, "경고를 출력합니다.");		System.out.println();
		logger.writeLog(Logger.ERROR, "에러가 발생하였습니다.");	System.out.println();
	}
}
