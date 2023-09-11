package curs3;

import java.util.Scanner;

/*
 * Program care verifica daca un nr. este par sau impar
 * 
 * 
 */

public class ParSauImpar {

	int number;

	public void askTheUserForNumber() {
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
	}

	public int askTheUserForNumber2() {
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		return number;
	}

	public String checkOddOrEven(int number) {
		if (number % 2 == 0) {
			return "Number is even";
		} else {
			return "Number is odd";

		}
	}

	public String checkOddOrEven2() {
		if (number % 2 == 0) {
			return "Number is even";
		} else {
			return "Number is odd";

		}
	}
}
