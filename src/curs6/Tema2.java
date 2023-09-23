package curs6;

/*Scriem o secventa de numere Fibonaccci folosind o structura -for-
 *  si inca odata folosind o structura -while-
 *  Un numar fibonaci:
 *  https://ro.wikipedia.org/wiki/Num%C4%83r Fibonacci
 * Exemplu output:
 * Seria Fibonacci pentru 9 numere
 * 0 1 1 2 3 5 8 13 21
 * 
 * 
 */

public class Tema2 {

	public static void fibonacci(int n) {
		int nr1 = 0;
		int nr2 = 1;
		int contor = 0;
		while (contor < n) {
			System.out.print(nr1 + "  ");
			int nr3 = nr2 + nr1;
			nr1 = nr2;
			nr2 = nr3;
			contor++;
		}

	}

	public static void fibonacci1(int n) {
		int nr1 = 0, nr2 = 1, nr3, i;
		System.out.print(nr1 + "  " + nr2);
		for (i = 2; i < n; i++) {
			nr3 = nr1 + nr2;
			System.out.print("  " + nr3);
			nr1 = nr2;
			nr2 = nr3;

		}

	}

	public static void main(String[] args) {
		int n = 9;// nr. numere Fibonacci
		fibonacci(n);
		System.out.println("  ");
		fibonacci1(n);

	}

}
