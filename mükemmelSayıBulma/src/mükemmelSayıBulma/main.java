package mükemmelSayıBulma;

public class main {

	public static void main(String[] args) {

		int beginningValue = 9999;
		int number = beginningValue;
		int dividers = 0;

		if (beginningValue < 0)
			System.out.println("number negatif olamaz");

		System.out.println("'Mükkemmel Sayı' bulma algoritması");
		System.out.println(beginningValue + " sayısından itibaren taranıyor...\n");
		
		for (int w = 0; w < beginningValue; w++) {
			for (int q = 2; q < number; q++) {
				if (number % q == 0) {
					dividers += q;
				}
			}
			if (dividers + 1 == number && number != 1)
				System.out.println(number + " mükemmel sayıdır.");
			number--;
			dividers = 0;
		}
		System.out.println("\nPROGRAM SONU");
	}
}
