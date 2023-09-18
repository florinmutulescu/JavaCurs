package curs5;

import java.util.Scanner;

/*facem un program care cere un text de la tastatura
 * cautam in text daca exista litera A
 * daca o gasim printam ca am gasit litera si
 * de cate ori am gasit-o
 * daca nu o gasim,printam ca nu am gasit
 * 
 */

public class LetterSearch {

	String text;

	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text");
		text = scan.nextLine();
		scan.close();
	}

	public void searchForA() {
		// masina --> text.length()==6
		// 012345
		int counter = 0;
		for (int i = 0; i < text.length(); i++) {
			// text.toUpperCase() -->transf. textul in CAPS
			// text.toLowerCase() -> transforma textul in litere mici
			if (text.charAt(i) == 'A' || text.charAt(i) == 'a') {
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("Nu s-a gasit litera in text");

		} else {
			System.out.println("Litera A a fost gasita de : " + counter);

		}
		String result = (counter == 0) ? "Nu s-a gasit litera A" : "Litera A a fost gasita de : " + counter;
		System.out.println(result);
	}

}
