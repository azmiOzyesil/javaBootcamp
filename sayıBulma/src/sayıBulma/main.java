package sayıBulma;

public class main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 5, 1, 6, 5, 1, 6, 5, 1, 6, 5, 1, 5, 1, 5, 1, 6, 3, 5, 6, 5, 1, 4, 8, 0 };
		int desiredNumber = 4;
		int counter = 0, forCounter = 0;

		for (int number : numbers) {
			if (number == desiredNumber) {
				System.out.println(forCounter + ". eleman '" + desiredNumber + "' dır.");
				counter++;
			}
			forCounter++;
		}
		System.out.println("\nToplamda " + counter + " tane bulundu");
	}
}
