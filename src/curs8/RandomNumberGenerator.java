package curs8;

import java.util.Random;

/*
 * facem un program care genereaza 6 numere intre 0-9
 * numerele le va tine intr-un array
 * nu tine numere duplicat
 * printeza array-ul
 * 
 * o metoda care genereaza si pune in array
 * o metoda pt duplicate
 * o metoda pentru print array
 */
public class RandomNumberGenerator {
	int age;// valoare default pentru Numerice==0
	String nume;// valoare default String ==null

	final int LENGHT = 6;
	final int MAX_NUMBERS = 9;

	int[] numbers = new int[LENGHT];

	public void generateNumbers() {
		Random random = new Random();

		System.out.println(random.nextInt(MAX_NUMBERS));

		for (int i = 0; i < LENGHT; i++) {

			// numbers[i]=random.nextInt(MAX_NUMBERS);
			int randomNR = 0;
			// random.nextInt(MAX_NUMBERS);
			do {
				randomNR = random.nextInt(MAX_NUMBERS);

			} while (checkDuplicateNumber(numbers, randomNR));
			numbers[i] = randomNR;
			/*
			 * if(!checkDuplicateNumber(numbers,randomNR)){ numbers[i]=randomNR;
			 * System.out.println(numbers[i]); System.out.println(Arrays.toString(numbers));
			 * 
			 * 
			 * System.out.println(numbers[i]); System.out.println(Arrays.toString(numbers));
			 */
		}
	}

	public boolean checkDuplicateNumber(int[] array, int nr) {
		for (int number : array) {
			if (number == nr) {
				return true;
			}
		}
		return false;
	}

	public void printArray() {
		for (int nr : numbers) {
			System.out.print(nr + "|");
		}

	}

}
