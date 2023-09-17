package curs4;

import java.util.Scanner;

public class PunctajTema {

	public static void main(String[] args) {
		String punctaj;
		int valPunctaj;

		Scanner scan = new Scanner(System.in);
		System.out.println("Va rog intrduceti punctajul:");
		valPunctaj = scan.nextInt();
		scan.close();
		String result = (valPunctaj >= 90) ? "FB" : (valPunctaj >= 80) ? "B" : "S";
		System.out.println("Ai primit calificativul:"
				+ (result.equals("FB") ? "Foarte bine" : (result.equals("B") ? "Bine" : "Suficient")));

		// if (valPunctaj >= 90) {
		// punctaj = "FB";

		// System.out.println("Punctajul este: " + punctaj + " Ai primit: Foarte
		// Bine!");
		// } else if (valPunctaj >= 80) {
		// punctaj = "B";

		// System.out.println("Punctajul este: " + punctaj + " Ai primit: Bine!");
		// } else {
		// punctaj = "S";

		// System.out.println("Punctajul este: " + punctaj + " Ai primit : suficient!");

	}

}
