package curs12;
/*
 * Programul trebuie sa caute un oras pe baa unui cod postal
 * avem nevoie de o clasa care sa contina inca de la 
 * initializare o serie de coduri postale si orase asociate cu ele(orase)
 * Daca codul nu exista vreau sa aruncam PostalCodeException
 * 
 * 
 * 
 */

import java.util.Scanner;

public class SearchPostalCod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PostalCodes pc = new PostalCodes();
		int codPostal;

		do {
			System.out.println("Please insert a postal code");
			codPostal = scan.nextInt();
			try {
				String oras = pc.findCity(codPostal);

				System.out.println("Orasul asociat codului :" + codPostal + "este" + oras);
			} catch (PostalCodeException e) {
				System.out.println(e.getMessage());

			}

		} while (!pc.map.containsKey(codPostal));

	}

}
