package week3Homework3.core.logger;

public class FileLogger implements Logger{

	@Override
	public void log(String text) {
		System.out.println("Dosya sisyemine loglama yapıldı :" + text);
	}

}
