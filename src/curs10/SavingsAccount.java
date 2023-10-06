package curs10;

public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super.accountOwner = accountOwner;
		super.balance = balance;
		setAccountNumber(accountNumber);

	}

	public void withdraw(double amount) {
		try {
			if (amount > balance) {
				throw new InsufficientFundsException("fonduri insuficiente");
			} else {
				balance = balance - amount;
				System.out.println("Pick your money!");
				System.out.println("Your new balance is :" + balance);
				System.out.println("Thank you for using our ATM! ");
			}
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage() + balance);
			System.out.println("Thank you for using our ATM !");
			e.printStackTrace();
		}
	}

}
