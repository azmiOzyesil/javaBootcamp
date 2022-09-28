package methodOverloading;

public class FourOperations {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int... a) {
		int sum = 0;
		for (int ab : a) {
			sum += ab;
		}
		return sum;
	}

}
