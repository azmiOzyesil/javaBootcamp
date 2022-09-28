
public class main {

	public static void main(String[] args) {
		int number1 = 20, number2 = 9;

		System.out.println(sum(number1, number2));
		System.out.println(sumAll(5,56,12,6,51,7,3,9,5,2,14));
	}

	public static int sum(int first, int second) {
		return first + second;
	}

	public static int sumAll(int... num) {
		int sumOf = 0;
		for (int numbers : num) {
			sumOf += numbers;
		}
		return sumOf;
	}

}
