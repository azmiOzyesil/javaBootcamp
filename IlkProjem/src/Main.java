
public class Main {

	public static void main(String[] args) {

		int beginningValue = 100;

		System.out.println("Asal sayı bulma Algoritması");

		while (beginningValue >= 1) {
			boolean prime = true;
			for (int a = 2; a < beginningValue; a++) {
				if (beginningValue % a == 0) {
					prime = false;
					break;
				}
			}
			if (prime)
				System.out.println(beginningValue + " Asaldır");
			/*
			 * else System.out.println(baslangicDegeri + " Asal değildir");
			 */
			beginningValue--;
		}
	}
}
