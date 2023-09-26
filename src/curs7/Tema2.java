package curs7;

public class Tema2 {
	/*
	 * Scriem un program care numara cate vocale contine textul "Eu invat Java" Va
	 * printa urmatorul mesaj:Vocale:nr de vocale din text
	 */

	public static void main(String[] args) {
		String[] textArray = { "Eu", "invat", "Java" };
		int contor = 0;

		for (int i = 0; i < textArray.length; i++) {

			for (int j = 0; j < textArray[i].length(); j++) {

				if (textArray[i].charAt(j) == 'a' || textArray[i].charAt(j) == 'A' || textArray[i].charAt(j) == 'e'
						|| textArray[i].charAt(j) == 'E' || textArray[i].charAt(j) == 'i'
						|| textArray[i].charAt(j) == 'I' || textArray[i].charAt(j) == 'o'
						|| textArray[i].charAt(j) == 'O' || textArray[i].charAt(j) == 'u'
						|| textArray[i].charAt(j) == 'U') {
					contor++;

				}

			}
		}
		System.out.println("Vocale: nr.de vocale din text  " + contor);
	}
}
