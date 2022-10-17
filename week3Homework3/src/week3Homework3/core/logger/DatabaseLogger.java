package week3Homework3.core.logger;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String text) {
		System.out.println("Database'e loglama yapıldı :" + text);
	}

}
