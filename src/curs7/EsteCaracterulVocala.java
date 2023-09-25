package curs7;

import java.util.Scanner;

public class EsteCaracterulVocala {
	/*
	 * Facem un program care citeste o litera de la tastatura verificam daca este o
	 * vocala
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu o litera:");
		char litera = scan.next().charAt(0);

		// rezolvare cu IF
		if (litera == 'a' || litera == 'A' || litera == 'e' || litera == 'E' || litera == 'i' || litera == 'I'
				|| litera == 'o' || litera == 'O' || litera == 'u' || litera == 'U') {
			System.out.println(litera + "vocala");
		} else {
			System.out.println(litera + "Nu este vocala");
		}

		// rezolvare cu switch
		// switch(litera) {

	}
}
