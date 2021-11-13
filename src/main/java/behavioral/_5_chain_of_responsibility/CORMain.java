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

		logger.writeLog(Logger.DEBUG, "����׸� ����մϴ�."); 	System.out.println();
		logger.writeLog(Logger.INFO, "������ ����մϴ�.");		System.out.println();
		logger.writeLog(Logger.WARNING, "��� ����մϴ�.");		System.out.println();
		logger.writeLog(Logger.ERROR, "������ �߻��Ͽ����ϴ�.");	System.out.println();
	}
}
