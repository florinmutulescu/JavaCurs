package curs10;

public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super.accountOwner = accountOwner;
		super.balance = balance;
		setAccountNumber(accountNumber);

	}

	public void withdraw(double amount) {
		try {
			if (amount < 0) {
				System.out.println("Introduceti o suma pozitiva");
				System.out.println("Thank you for using our ATM !");
				System.exit(-1);
			}

			if (amount > balance) {

				throw new InsufficientFundsException();
			} else {
				balance = balance - amount;
				System.out.println("Pick your money!");
				System.out.println("Your new balance is :" + balance);

			}
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage() + balance);

			e.printStackTrace();
		} finally {
			System.out.println("Thank you for using our ATM !");
		}
	}

}
