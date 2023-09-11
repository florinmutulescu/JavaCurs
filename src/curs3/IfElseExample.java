package curs3;

import java.util.Scanner;

/*
 * User Test
 * Pass:1234
 * daca auth este corect,printam
 * -->login sucessfull
 * daca auth este gresit,printam
 * -->user name sau parola este gresit
 * 
 */

public class IfElseExample {

	public static void main(String[] args) {
		String user = "Test";
		int pass = 1234;

		String inputUsername;
		int inputPassword;
		// in java string. se compara cu equals nu cu ==;
		System.out.println("Te rog introdu username");
		Scanner scan = new Scanner(System.in);
		inputUsername = scan.next();
		System.out.println("Te rog intodu o parola:");
		inputPassword = scan.nextInt();
		if ((inputUsername.equals(user)) && (inputPassword == pass)) {
			System.out.println("Login sucessfull!");
		} else {
			System.out.println("Username or password is wrong");

			/*
			 * if(conditie booleana(true sau false) { codul din corpul lui if se executa
			 * daca conditia di if este indeplinita(adica rezulta TRUE
			 * 
			 * 
			 * 
			 * } }
			 */
		}
	}
}
