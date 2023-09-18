package curs5;

import java.util.Scanner;

public class Palindrom {
	String text;

	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text");
		text = scan.nextLine();
		scan.close();
	}

	public void checkIfStringIsPalindrom() {
		// radar

	}
}
