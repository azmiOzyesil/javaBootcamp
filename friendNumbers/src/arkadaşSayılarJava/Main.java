package arkadaşSayılarJava;

public class Main {

	public static void main(String[] args) {

		int number1 = 220, divisors1 = 0;
		int number2 = 284, divisors2 = 0;

		for (int a = 1; a < number1; a++) {
			if (number1 % a == 0)
				divisors1 += a;
			if (number2 % a == 0)
				divisors2 += a;
		}
		if (divisors1 == number2 && divisors2 == number1)
			System.out.println(number1 + " ve " + number2 + " kardeştir");
		else
			System.out.println(number1 + " ve " + number2 + " kardeş değildir");
		System.out.println("\nPROGRAM SONU");
	}
}
