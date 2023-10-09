package curs10;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException() {
		super("The amount you entered is greater than available balance : ");

	}

}
