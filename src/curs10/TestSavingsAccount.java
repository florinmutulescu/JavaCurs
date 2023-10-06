package curs10;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Customer accountOwner = new Customer("Florin", "Adresa", "forin@gmail.com");
		SavingsAccount obj = new SavingsAccount(1234, 100.0, accountOwner);
		System.out.println("Hi " + accountOwner.getName());
		System.out.println("Please enter the amount to widraw!");
		double amount = scan.nextDouble();

		obj.withdraw(amount);

		scan.close();
	}

}
