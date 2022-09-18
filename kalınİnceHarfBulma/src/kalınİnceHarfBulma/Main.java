package kalınİnceHarfBulma;

import java.util.stream.BaseStream;

public class Main {

	public static void main(String[] args) {

		String theWord = "Ayşe tatile çıksın";

		// İnce Harfler
		char eLetter = 'e', iLetter = 'i', öLetter = 'ö', üLetter = 'ü';
		// Kalın Harfler
		char aLetter = 'a', ıLetter = 'ı', oLetter = 'o', uLetter = 'u';
		
		char space = ' ';

		int eLetterDetected = 0, iLetterDetected = 0, öLetterDetected = 0, üLetterDetected = 0;
		int aLetterDetected = 0, ıLetterDetected = 0, oLetterDetected = 0, uLetterDetected = 0;
		int consonantLetterDetected = 0, spaceDetected = 0;

		System.out.println("'"+theWord + "' cümlesinde bulunan karakterler;\n");
		theWord = theWord.toLowerCase();

		for (int i = 0; i < theWord.length(); i++) {
			if (eLetter == theWord.charAt(i))
				eLetterDetected++;
			else if (iLetter == theWord.charAt(i))
				iLetterDetected++;
			else if (öLetter == theWord.charAt(i))
				öLetterDetected++;
			else if (üLetter == theWord.charAt(i))
				üLetterDetected++;
			else if (aLetter == theWord.charAt(i))
				aLetterDetected++;
			else if (ıLetter == theWord.charAt(i))
				ıLetterDetected++;
			else if (oLetter == theWord.charAt(i))
				oLetterDetected++;
			else if (uLetter == theWord.charAt(i))
				uLetterDetected++;
			else if (space == theWord.charAt(i))
				spaceDetected++;
			else
				consonantLetterDetected++;
		}
		if (eLetterDetected > 0)
			System.out.println(eLetterDetected + " tane 'e' harfi bulundu");

		if (iLetterDetected > 0)
			System.out.println(iLetterDetected + " tane 'i' harfi bulundu");

		if (öLetterDetected > 0)
			System.out.println(öLetterDetected + " tane 'ö' harfi bulundu");

		if (üLetterDetected > 0)
			System.out.println(üLetterDetected + " tane 'ü' harfi bulundu");

		if (aLetterDetected > 0)
			System.out.println(aLetterDetected + " tane 'a' harfi bulundu");

		if (ıLetterDetected > 0)
			System.out.println(ıLetterDetected + " tane 'ı' harfi bulundu");

		if (oLetterDetected > 0)
			System.out.println(oLetterDetected + " tane 'o' harfi bulundu");

		if (uLetterDetected > 0)
			System.out.println(uLetterDetected + " tane 'u' harfi bulundu");

		if (spaceDetected > 0)
			System.out.println(spaceDetected + " tane 'boşluk' bulundu");

		if (consonantLetterDetected > 0)
			System.out.println(consonantLetterDetected + " tane 'ünsüz harf' bulundu");
		System.out.println("\nToplamda "
				+ (eLetterDetected + iLetterDetected + öLetterDetected + üLetterDetected + aLetterDetected
						+ ıLetterDetected + oLetterDetected + uLetterDetected + spaceDetected + consonantLetterDetected)
				+ " karakter bulundu");
	}
}
