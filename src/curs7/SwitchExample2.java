package curs7;

import java.util.Scanner;

public class SwitchExample2 {
	/*
	 * Facem un program care verifica daca un student este eligibil pt o bursa
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce an esti:");
		int an = scan.nextInt();
		System.out.println("Te rog introdu ce punctaj ai:");
		int punctaj = scan.nextInt();

		switch (an) {
		case 1:
		case 2:
			System.out.println("Nu esti eligibil");
			break;
		case 3:
			System.out.println("Te rog introdu un punctaj valid!");
			switch (punctaj) {
			case 80:
				System.out.println("Eligibil pentru bursa 1");
				break;
			case 50:
				System.out.println("Eligibil pentru bursa 2");
				break;
			default:
				System.out.println("Te rog introdu un punctaj valid!");

			}
			break;
		default:
			System.out.println("Te rog introdu un an valid");
		}

	}

}
