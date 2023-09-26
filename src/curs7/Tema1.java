package curs7;

import java.util.Scanner;

public class Tema1 {
	/*
	 * Scriem un program care cere userului 10 numere Va pune acele numere intr-un
	 * array si va calcula suma lor La final va printa suma numerelor: Ex:Introdu 10
	 * numere: 33 22 12 45 566 67 12 1 5 21 Suma numerelor din array este:784
	 */
	int suma = 0;
	int[] number = new int[10];

	public void introdNumere() {
		System.out.println("Introdu 10 numere:");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {

			number[i] = scan.nextInt();
		}
		scan.close();
	}

	public void calcSum() {
		for (int i = 0; i < 10; i++) {
			suma += number[i];
		}
		System.out.println("Suma numerelor din array:" + suma);
	}

	public static void main(String[] args) {
		Tema1 obj = new Tema1();
		obj.introdNumere();
		obj.calcSum();

	}

}
