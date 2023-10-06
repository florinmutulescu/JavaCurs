package curs10;

public class Account {
	private int accountNumber;
	public double balance;
	public Customer accountOwner;

	public void Account(int accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}

	public void withdraw(double amount) {
		try {
			if (amount > balance) {
				throw new InsufficientFundsException("Fonduri insuficiente! ");
			}
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());

		}
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

}
