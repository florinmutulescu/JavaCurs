package curs5;

import java.util.Scanner;

/*program care intreaba utilizatorul 10 numere
 *  sub urmatoarea forma :
 * Please enter number 1:
 * Please enter number 2:
 * ---etc
 * dupa ce utiizatoru a introdus cele 10 numere
 * calculam suma lor si o printam sub urmatoare forma:
 * The sum of numbers is: 
 */

public class Tema1 {
	int suma = 0;
	// int[] number = new int[10];
	int number;

	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 11; i++) {
			System.out.println("Please enter number:" + i);
			// number[i - 1] = scan.nextInt();
			number = scan.nextInt();
		}
		scan.close();
	}

	public void calcSum() {
		for (int i = 1; i < 11; i++) {
			// suma += number[i - 1];
			suma += number;
		}
		System.out.println("The sum of numbers is :" + suma);
	}

	public static void main(String[] args) {
		Tema1 obj = new Tema1();
		obj.askTheUser();
		obj.calcSum();
	}

}
