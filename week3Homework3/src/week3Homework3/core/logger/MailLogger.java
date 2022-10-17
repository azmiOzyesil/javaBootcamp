package week3Homework3.core.logger;

public class MailLogger implements Logger {

	@Override
	public void log(String text) {
		System.out.println("Mail ile loglama yapıldı :" + text);
	}

}
