
public class main {

	// Not: Burada hocanın projesinin aynısını yazmak yerine aynı mantıkta farklı
	// bir algoritma yazdım.
	public static void main(String[] args) {

		int beginningNumber = 100;
		int divider = 3;

		while (beginningNumber > 0) {
			if (beginningNumber % divider == 0) {
				printConsole(beginningNumber + " is divided by " + divider);
			} else {
				//printConsole(beginningNumber + " is not divided by " + divider);
			}
			beginningNumber--;
		}
	}

	public static void printConsole(String theString) {
		System.out.println(theString);
	}
}
